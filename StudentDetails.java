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
		std.qlf = "B.Sc Computer Science";
		System.out.println(std.stName);
		System.out.println(std.age);
		System.out.println(std.gender);
		System.out.println(std.qlf);
		System.out.println(" ");
		
		StudentDetails std1 = new StudentDetails();
		std1.stName = "Loganathan";
		std1.age = 21;
		std1.gender = "Male";
		std1.qlf = "B.Sc Computer Science";
		System.out.println(std1.stName);
		System.out.println(std1.age);
		System.out.println(std1.gender);
		System.out.println(std1.qlf);
		System.out.println(" ");
		
		StudentDetails std2 = new StudentDetails();
		std2.stName = "Ashwin";
		std2.age = 20;
		std2.gender = "Male";
		std2.qlf = "B.sc Computer Science";
		System.out.println(std2.stName);
		System.out.println(std2.age);
		System.out.println(std2.gender);
		System.out.println(std2.qlf);
		System.out.println(" ");
		
		StudentDetails std3 = new StudentDetails();
		std3.stName = "Nivashini";
		std3.age = 21;
		std3.gender = "female";
		std3.qlf = "B.com ISM";
		System.out.println(std3.stName);
		System.out.println(std3.age);
		System.out.println(std3.gender);
		System.out.println(std3.qlf);
		
		}
}
