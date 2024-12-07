package day12;
import java.util.Scanner;
public class mainLibrary {
	static LibraryManagement library;
public static void main(String[]args) {
	LibraryManagement library = new LibraryManagement();
	Scanner sc =new Scanner(System.in);
	boolean istrue=true;
	while (true) {
	System.out.println("Enter your Choice :");
	System.out.println("1 for Add");
	System.out.println("2 for Update");
	System.out.println("3 for Show");
	System.out.println("4 for Exit");
	int key = sc.nextInt();
	sc.nextLine();
	
	switch (key){
	case 1: {
	System.out.println("Enter Title :");
	String title=sc.nextLine();
	
	System.out.println("Enter Author Name :");
	String author=sc.nextLine();
	
	System.out.println("Enter Price :");
	double price=sc.nextDouble();
	
	System.out.println("Enter Number of copies :");
	int numOfCopies=sc.nextInt();
	
	library = new LibraryManagement(title,author,price,numOfCopies);
	break;
}
	case 2:{
		System.out.println("Enter Title :");
		String title=sc.nextLine();
		library.setTitle(title);
		
		System.out.println("Enter Author Name");
		String author=sc.nextLine();
		library.setAuthor(author);
		
		System.out.println("Enter Price");
		double price=sc.nextDouble();
		library.setPrice(price);
		
		System.out.println("Enter Number of Copies");
		int numOfCopies=sc.nextInt();
		library.setNumOfCopies(numOfCopies);
		break;
  }
	case 3:{
		System.out.println(library);
		break;
	}
	case 4:{
		istrue=false;
		System.out.println("Thank you");
		break;
	}
	default:
		System.out.println("Enter Correct Choice");
	break;
		}
	
}
}
}
