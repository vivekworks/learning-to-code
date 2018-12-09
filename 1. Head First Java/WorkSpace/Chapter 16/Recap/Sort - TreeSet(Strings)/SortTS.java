import java.io.*;
import java.util.*;
public class SortTS{

	TreeSet<String> songTree = new TreeSet<String>();

	public static void main(String[] args){
		SortTS SortTS = new SortTS();
		SortTS.run();
	}

	public void run(){
		try{
			File songFile = new File("I:\\Head First Java\\WorkSpace\\Chapter 16\\Recap\\Sort - TreeSet(Strings)\\Songs.txt");
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
		songTree.add(newList[0]);
	}

	public void sortSongs(){
		System.out.println("Sort "+songTree);
	}
}