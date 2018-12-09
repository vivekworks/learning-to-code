public class AppendixB{
	public enum Members{VIVEK, JAIN, COLLEGE};
	public Members bandMember;
	public static void main(String[] args){
		//Immutable
		Integer iWrap = new Integer(32);
		iWrap = 45;
		
		//Assertions
		try{
			assert(iWrap < 0) : "iWrap = "+iWrap;
		} catch(AssertionError AE){
			AE.printStackTrace();
		}
		
		//Linked Invocations
		StringBuffer sBuff = new StringBuffer("Spring");
		sBuff = sBuff.delete(3,6).insert(2,"umme").deleteCharAt(1);
		System.out.println(sBuff);

		//Static Inner
		FooOuter.BarInner foo = new FooOuter.BarInner();
		foo.sayIt();
		AppendixB hey = new AppendixB();
		

		if(hey.bandMember == Members.VIVEK){
			System.out.println("Cool");			
		}

		//Anonymous Inner Class
		//JButton button = new JButton("Close");
		//button.addActionListener(new ButtonListener());-------Usual Method
		//button.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) { System.exit(0);}})-----Create an unnamed class which implements ActionListener Interface and use the actionPerformed method.

		//Enums

		
	}
}