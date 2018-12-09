public class BottlesOfBeer{
	public static void main(String[] args){
		int bottleNo = 99;
		String bottle = "bottles";
		while(bottleNo>0){
			System.out.println(bottleNo+" "+bottle+" of beer on the wall,"+bottleNo+" "+bottle+" of beer.");
			bottleNo = bottleNo-1;
			if(bottleNo == 1)
				bottle = "bottle";
			if(bottleNo != 0)
			System.out.println("Take one down and pass it around, "+bottleNo+" "+bottle+" of beer on the wall.");
			else
				System.out.println("Take one down and pass it around, no more bottles of beer on the wall.");
		}
		System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
		System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.");
	}
}