import java.io.*;
public class GameSaveRestore implements Serializable{
	public static void main(String[] args){
		try{
			//Players Creation
			GameCharacter player1 = new GameCharacter("Batman","Human","Will",new String[] {"Bat Mobile","Tumblr"});
			GameCharacter player2 = new GameCharacter("Superman","Kryptonian","SuperHuman",new String[] {"SuperBody"});

			//Save the data
			FileOutputStream fos = new FileOutputStream("Players.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(player1);
			oos.writeObject(player2);
			oos.close();

			//Nullifying
			player1=null;
			player2=null;

			//Restore the data
			FileInputStream fis = new FileInputStream("Players.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			player1 = (GameCharacter) ois.readObject();
			player2 = (GameCharacter) ois.readObject();

			//Checking
			System.out.println(player1.getName()+" - "+player1.getType()+" - "+player1.getPower());
			System.out.println(player2.getName()+" - "+player2.getType()+" - "+player2.getPower());
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}