import java.io.*;
public class GameCharacter implements Serializable{
	private String name;
	private String type;
	private String power;
	private String[] weapons;

	public GameCharacter(String n, String t, String p, String[] w){
		name = n;
		type =t;
		power = p;
		weapons = w;
	}

	public String getName(){
		return name;
	}

	public String getType(){
		return type;
	}

	public String getPower(){
		return power;
	}

	public String[] getWeapons(){
		return weapons;
	}
}