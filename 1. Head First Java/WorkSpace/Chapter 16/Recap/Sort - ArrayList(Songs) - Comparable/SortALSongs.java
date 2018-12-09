import java.io.*;
import java.util.*;
public class SortALSongs{

	ArrayList<Songs> songList = new ArrayList<Songs>();

	public static void main(String[] args){
		new SortALSongs().run();
	}

	public void run(){
		try{
			File songFile = new File("I:\\Head First Java\\WorkSpace\\Chapter 16\\Recap\\Sort - ArrayList(Songs)\\Songs.txt");
			FileReader fr = new FileReader(songFile);
			BufferedReader reader = new BufferedReader(fr);
			String newLine = null;
			while((newLine = reader.readLine()) != null)
				splitSongs(newLine);
			sortSongs();
		} catch(Exception e){
			e.printStackTrace();
		}
	}

	public void splitSongs(String newLine){
		String[] songLine = newLine.split("/");
		songList.add(new Songs(songLine[0],songLine[1],Integer.parseInt(songLine[2]),Integer.parseInt(songLine[3])));
	}

	public void sortSongs(){
		System.out.println("Before Sort - "+songList);
		Collections.sort(songList);
		System.out.println("After Sort - "+songList);
	}
}