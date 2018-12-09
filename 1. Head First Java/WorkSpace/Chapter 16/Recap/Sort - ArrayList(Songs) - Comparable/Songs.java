class Songs implements Comparable<Songs>{
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

	public int compareTo(Songs one){
		return getTitle().compareTo(one.getTitle());
	}
}