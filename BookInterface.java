package day21;

import java.util.ArrayList;
import java.util.Scanner;

public class BookInterface {
	public static void main(String[] args) {
		Book book = new Book();
		
		ArrayList<Book> al = new ArrayList<Book>();
		
		Scanner an = new Scanner(System.in);
		boolean isTrue=true;
	while(isTrue) {
		System.out.println("Enter your choice :");
		System.out.println("1 for Add");
		System.out.println("2 for Show");
		System.out.println("3 for Update");
		System.out.println("4 for Remove");
		System.out.println("0 for Exit");
		int key =an.nextInt();
		an.nextLine();
	
		if(key==1) {
			System.out.println("Enter Book I'D ");
			int id=an.nextInt();
			an.nextLine();
			System.out.println("Enter Book Title");
			String title=an.nextLine();
			
			System.out.println("Enter Author Name");
			String author=an.nextLine();
			
			System.out.println("Enter No of Copies");
			int copies=an.nextInt();
			
			System.out.println("Enter the price");
			double price=an.nextDouble();
			al.add(book=new Book(id, title, author, copies, price));
			
		}else if(key==2) {
			System.out.println(al);
		}
		else if(key==3) {
			System.out.println("Enter Book I'D :");
			int id =an.nextInt();
			an.nextLine();
			boolean isThere=false;
			 for (Book book1 : al) {
				 if(id==book1.getId()) {
					 isThere=true;
					 System.out.println("Rename your Book title ");
					 String name=an.nextLine();
					 book1.setTitle(name);
					 
					 System.out.println("Rename author");
					 String author=an.nextLine();
					 book1.setAuthor(author);
					 
					 System.out.println("Re-Enter No of Copies");
					 int copies=an.nextInt();
					 book1.setCopies(copies);
					 an.nextLine();
					 
					 System.out.println("Re-Enter the price");
					 double price=an.nextDouble();
					 book1.setPrice(price);
				 }	 
				 } 
			 
			 if(!isThere) {
				 System.out.println("Book not there");
			 }
			 
				 }else if (key==4) {
					System.out.println("Enter Book I'D : ");
					int id=an.nextInt();
					for (Book book1 : al) {
						 if(id==book1.getId()){
							al.remove(book1);
							break;
						}
						}
					}
				 else if(key==0) {
							
							isTrue=false;
							System.out.println("Ended");
							break;
						}		
	}
	}
}


	
