package day12;

public class LibraryManagement {

	private String title;
	private String author;
	private double price;
	private int numOfCopies;
	
public LibraryManagement(String title,String author,double price,int numOfCopies) {
	this.title=title;
	this.author=author;
    this.price=price;
    this.numOfCopies=numOfCopies;
}
  LibraryManagement(){
	
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public int getNumOfCopies() {
	return numOfCopies;
}

public void setNumOfCopies(int numOfCopies) {
	this.numOfCopies = numOfCopies;
}


public String toString() {
	return "Title\t=\t"+title+" \nAuthor\t=\t"+author+" \nprice\t=\t"+price+"\nnumberOfCopies\t=\t"+numOfCopies;
}
}


