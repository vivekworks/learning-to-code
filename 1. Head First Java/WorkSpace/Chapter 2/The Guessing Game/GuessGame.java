class GuessGame{
	Player P1;
	Player P2;
	Player P3;
	void gamePlay(){
		P1 = new Player();
		P2 = new Player();
		P3 = new Player();
		
		int compNo = (int)(Math.random()*10);
		boolean p1Right = false, p2Right = false, p3Right = false;
		while(true){
			P1.guess();
			P2.guess();
			P3.guess();
			if(P1.number == compNo)
				p1Right = true;
			if(P2.number == compNo)
				p2Right = true;
			if(P3.number == compNo)
				p3Right = true;
			if(p1Right || p2Right || p3Right){
				System.out.println("We found a winner!");
				System.out.println("System GenX No. "+compNo);
				System.out.println("P1 guessed "+P1.number);
				System.out.println("P2 guessed "+P2.number);
				System.out.println("P3 guessed "+P3.number);
				break;
			}
			else{
				System.out.println("Keep repeating!");
				System.out.println("System GenX No. "+compNo);
				System.out.println("P1 guessed "+P1.number);
				System.out.println("P2 guessed "+P2.number);
				System.out.println("P3 guessed "+P3.number);
			}
		}
	}
}