import java.io.*;
import java.util.*;
public class SortHS{

	ArrayList<String> songList = new ArrayList<String>();

	public static void main(String[] args){
		SortHS sortHS = new SortHS();
		sortHS.run();
	}

	public void run(){
		try{
			File songFile = new File("I:\\Head First Java\\WorkSpace\\Chapter 16\\Recap\\Sort - HashSet(Strings)\\Songs.txt");
			FileReader fr = new FileReader(songFile);
			BufferedReader reader = new BufferedReader(fr);
			String newLine = null;
			while((newLine = reader.readLine()) != null)
				splitSong(newLine);
			sortSongs();
		} catch(Exception e){
			e.printStackTrace();
		}
	}

	public void splitSong(String newSong){
		String[] newList = newSong.split("/");
		songList.add(newList[0]);
	}

	public void sortSongs(){
		System.out.println("Before Sort "+songList);
		HashSet songHashSet = new HashSet();
		songHashSet.addAll(songList);
		System.out.println("After Sort "+songHashSet);
	}
}