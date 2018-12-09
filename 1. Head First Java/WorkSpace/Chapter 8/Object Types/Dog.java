class Dog extends Animal{
	void bark(){
		System.out.println("Dog Barks");
	}
	public static void main(String[] args){
		Animal ani = new Dog();
		Dog doggy = null;
		if(ani instanceof Dog){
			doggy = (Dog)ani;
			doggy.bark();
		}
	}
}