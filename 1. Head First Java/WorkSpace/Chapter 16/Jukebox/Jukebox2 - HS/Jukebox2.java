import java.util.*;
import java.io.*;

public class Jukebox2{
	ArrayList<Song> songList = new ArrayList<Song>();
	public static void main(String[] args){
		Jukebox2 juke = new Jukebox2();
		juke.go();
	}

	public void go(){
		getSongs();
		System.out.println("Before - "+songList);
		Collections.sort(songList);
		System.out.println("After Title Sort- "+songList);
		Collections.sort(songList,new TitleComparator());
		System.out.println("After Artist Sort- "+songList);
		HashSet<Song> songSet = new HashSet<Song>();
		songSet.addAll(songList);
		System.out.println("After using Song Set- "+songSet);
	}

	public void getSongs(){
		try{
			File songFile = new File("C:\\Users\\Peril\\Documents\\Jukebox.txt");
			FileReader fR = new FileReader(songFile);
			BufferedReader reader = new BufferedReader(fR);
			String line = null;
			while((line=reader.readLine()) != null)
				addSongs(line);
		} catch(Exception e){
			e.printStackTrace();
		}
	}

	public void addSongs(String song){
		String[] line = song.split("/");
		Song newSong = new Song(line[0],line[1],line[2],line[3]);
		System.out.println("New Song  - "+newSong.getTitle().hashCode()+" - "+newSong.getArtist().hashCode()+" - "+newSong.getRating().hashCode()+" - "+newSong.getBpm().hashCode());
		songList.add(newSong);
	}

	public class TitleComparator implements Comparator<Song>{
		public int compare(Song one, Song two){
			return one.getArtist().compareTo(two.getArtist());
		}
	}
}