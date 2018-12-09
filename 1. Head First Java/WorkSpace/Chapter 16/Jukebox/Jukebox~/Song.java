public class Song implements Comparable<Song>{
	String title;
	String artist;
	String rating;
	String bpm;
	Integer order;

	Song(String t, String a, String r, String b, Integer o){
		title = t;
		artist = a;
		rating = r;
		bpm = b;
		order  = o;
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

	public Integer getOrder(){
		return order;
	}

	public int compareTo(Song s){
		return title.compareTo(s.title);
	}
}