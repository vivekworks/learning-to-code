class SharpenYourPencil{
	public static void main(String[] args){
		Dog[] pets;
		pets = new Dog[7];
		pets[0] = new Dog();
		pets[1] = new Dog();
		System.out.println(pets[0]);
		System.out.println(pets[1]);
		System.out.println(pets[2]);
		pets[3] = pets[0];
		System.out.println(pets[3]);
	}
}