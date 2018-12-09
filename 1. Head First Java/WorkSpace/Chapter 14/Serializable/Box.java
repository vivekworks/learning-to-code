import java.io.*;
public class Box implements Serializable{
	transient public Duck duck = new Duck();
	private int height;
	private int width;
	public void setHeight(int h){
		height=h;
	}
	public void setWidth(int w){
		width=w;
	}
	public static void main(String[] args){
		Box myBox = new Box();
		myBox.setWidth(60);
		myBox.setHeight(80);
		try{
			FileOutputStream fs = new FileOutputStream("file.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(myBox);
			os.close();
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}