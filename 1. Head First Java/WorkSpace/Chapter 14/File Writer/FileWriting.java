import java.io.*;
public class FileWriting{
	public static void main(String[] args){
		try{
		FileWriter fw = new FileWriter("fw.txt");
		fw.write("Hey! How's it going?");
		fw.close();
	} catch (Exception e){
		e.printStackTrace();
	}
	}
}