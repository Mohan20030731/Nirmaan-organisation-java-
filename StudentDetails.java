package day7;

public class StudentDetails {
	String stName =" ";
	int age =0;
	String gender =" ";
	String qlf =" ";
	int dayp =0;
	public static void main(String[] args) { 
		
		StudentDetails std = new StudentDetails();
		std.stName = "Mohan kumar";
		std.age = 21;
		std.gender = "Male";
		std.qlf = "B.sc computer science";
		System.out.println(std.stName);
		System.out.println(std.age);
		System.out.println(std.gender);
		System.out.println(std.qlf);
		System.out.println(" ");
		
		StudentDetails std1 = new StudentDetails();
		std1.stName = "Loganathan";
		std1.age = 21;
		std1.gender = "Male";
		std1.qlf = "B.sc computer science";
		System.out.println(std1.stName);
		System.out.println(std1.age);
		System.out.println(std1.gender);
		System.out.println(std1.qlf);
		System.out.println(" ");
		
		StudentDetails std2 = new StudentDetails();
		std2.stName = "Ashwin";
		std2.age = 20;
		std2.gender = "Male";
		std2.qlf = "B.sc computer science";
		System.out.println(std2.stName);
		System.out.println(std2.age);
		System.out.println(std2.gender);
		System.out.println(std2.qlf);
		
		}
}
