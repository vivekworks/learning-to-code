import java.io.*;
import java.util.*;
public class SortALSongs{

	ArrayList<Songs> songList = new ArrayList<Songs>();

	public static void main(String[] args){
		new SortALSongs().run();
	}

	public void run(){
		try{
			File songFile = new File("I:\\Head First Java\\WorkSpace\\Chapter 16\\Recap\\Sort - ArrayList(Songs) - Comparator\\Songs.txt");
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
		Collections.sort(songList, new CompareSongs());
		System.out.println("After Sort - "+songList);
	}

	public class CompareSongs implements Comparator{
		public int compare(Object one, Object two){
			Songs oneS = (Songs)one;
			Songs twoS = (Songs)two;
			return oneS.getTitle().compareTo(twoS.getTitle());
		}
	}
}