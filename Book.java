package day21;

public class Book {
	private int id;
	private String title;
	private String author;
	private int copies;
	private double price;
	
	
	public Book() {
		
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
	public int getCopies() {
		return copies;
	}
	public void setCopies(int copies) {
		this.copies = copies;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Book(int id, String title, String author, int copies, double price) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.copies = copies;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", copies=" + copies + ", price=" + price
				+ "]";
	}
	
	}
