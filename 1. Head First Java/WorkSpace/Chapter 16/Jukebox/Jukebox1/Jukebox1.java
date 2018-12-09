import java.util.*;
import java.io.*;

public class Jukebox1{
	ArrayList<String> songList = new ArrayList<String>();
	public static void main(String[] args){
		Jukebox1 juke = new Jukebox1();
		juke.go();
	}

	public void go(){
		getSongs();
		System.out.println("Before - "+songList);
		Collections.sort(songList);
		System.out.println("After - "+songList);
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
		songList.add(line[0]);
	}
}