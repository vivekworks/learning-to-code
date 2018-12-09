class Songs {
	String title;
	String artist;
	int rating;
	int bpm;

	public Songs(String newT, String newA, int newR, int newB){
		title = newT;
		artist = newA;
		rating = newR;
		bpm = newB;
	}

	public String getTitle(){
		return title;
	}

	public String getArtist(){
		return artist;
	}

	public int getRating(){
		return rating;
	}

	public int getBpm(){
		return bpm;
	}

	public String toString(){
		return title;
	}

	public int hashCode(){
		return getTitle().hashCode();
	}

	public boolean equals (Object obj){
		Songs songOb = (Songs)obj;
		System.out.println(getTitle()+" "+getTitle().hashCode()+" "+songOb.getTitle()+" "+songOb.getTitle().hashCode());
		return (getTitle().hashCode() == songOb.getTitle().hashCode());
	}
}