import java.io.*;
import java.util.*;
public class FileReader1{

	public static void main(String[] args){
		FileReader1 fReader = new FileReader1();
		fReader.readFile();
	}

	public void readFile(){
		try{
			File newFile = new File("hey.txt");
			FileReader fileRr = new FileReader(newFile);
			BufferedReader buffRr = new BufferedReader(fileRr);
			Calendar cal = Calendar.getInstance();
			System.out.println(cal.getTimeInMillis());
			String line = null;
			while((line=buffRr.readLine()) != null){
				System.out.println(line);
			}
			System.out.println(cal.getTimeInMillis());
			buffRr.close();
		} catch(Exception e){

		}
	}
}