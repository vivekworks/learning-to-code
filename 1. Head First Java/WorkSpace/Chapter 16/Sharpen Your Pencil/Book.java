class Book implements Comparable{
	String title;
	public Book(String t){
		title = t;
	}
	public int compareTo(Object o){
		Book bookObj = (Book)o;
		return title.compareTo(bookObj.title);
	}

	public String toString(){
		return title;
	}
}