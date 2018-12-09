public class Song implements Comparable<Song>{
	String title;
	String artist;
	String rating;
	String bpm;
	

	Song(String t, String a, String r, String b){
		title = t;
		artist = a;
		rating = r;
		bpm = b;
	}

	public String getTitle(){
		return title;
	}

	public String getArtist(){
		return artist;
	}

	public String getRating(){
		return rating;
	}

	public String getBpm(){
		return bpm;
	}

	public String toString(){
		return title;
	}

	public int compareTo(Song s){
		return title.compareTo(s.title);
	}

	public int hashCode(){
		System.out.println("HashCode Override hai");
		return title.hashCode();
	}

	public boolean equals(Object obj){
		Song songHo = (Song)obj;
		System.out.println("Equals Override hai");
		return getTitle().equals(songHo.getTitle());
	}
}