import java.io.*;
import java.util.*;
public class SortHSSongs{
    
    public class CompareSongs implements Comparator<Songs>{
		public int compare(Songs one, Songs two){
			return one.getTitle().compareTo(two.getTitle());
		}
	}

    HashSet<Songs> songSet;
	
	public static void main(String[] args){
		new SortHSSongs().run();
	}

	public void run(){
		try{
			File songFile = new File("I:\\Head First Java\\WorkSpace\\Chapter 16\\Recap\\Sort - HashSet(Songs) - Comparator\\Songs.txt");
			FileReader fr = new FileReader(songFile);
			BufferedReader reader = new BufferedReader(fr);
			String newLine = null;
			songSet = new HashSet<Songs>(new CompareSongs());
			while((newLine = reader.readLine()) != null)
				splitSongs(newLine);
			sortSongs();
		} catch(Exception e){
			e.printStackTrace();
		}
	}

	public void splitSongs(String newLine){
		String[] songLine = newLine.split("/");
		songSet.add(new Songs(songLine[0],songLine[1],Integer.parseInt(songLine[2]),Integer.parseInt(songLine[3])));
	}

	public void sortSongs(){
		System.out.println("After Sort - "+songSet);
	}

	
}