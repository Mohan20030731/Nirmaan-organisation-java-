package day14;

import java.util.Scanner;

public class MainEmployee {
	static EmployeeManagement employee;
	public static void main(String[]args) {
		EmployeeManagement employee = new EmployeeManagement();
		Scanner sc =new Scanner(System.in);
		boolean istrue=true;
		while (istrue) {
		System.out.println("Enter the Below Options :");
		System.out.println("1 for Add");
		System.out.println("2 for Update");
		System.out.println("3 for Show");
		System.out.println("0 for Exit");
		int key = sc.nextInt();
		sc.nextLine();
		
		switch (key){
		case 1: {
		System.out.println("Enter Name :");
		String empName=sc.nextLine();
		
		System.out.println("Enter Identification No :");
		int empId=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Department :");
		String dept=sc.nextLine();
		
		
		System.out.println("Enter Mobile No :");
		long mobNo=sc.nextLong();
		
		employee = new EmployeeManagement(empName,empId,dept,mobNo);
		break;
	}
		case 2:{
			System.out.println("Enter Name :");
			String empName=sc.nextLine();
			employee.setEmpName(empName);
			
			System.out.println("Enter Identification No :");
			int empId=sc.nextInt();
			employee.setEmpId(empId);
			
			System.out.println("Enter Department :");
			String dept =sc.nextLine();
			employee.setDept(dept);
			sc.nextLine();
			
			System.out.println("Enter Mobile Number :");
			long mobNo=sc.nextLong();
			employee.setMobNo(mobNo);
			break;
	  }
		case 3:{
			System.out.println(employee);
			break;
		}
		case 0:{
			istrue=false;
			System.out.println("Thank you for your Cooperation");
			break;
		}
		default:
			System.out.println("Enter the shown Option Only");
		break;
		}
	}
		sc.close();
	}
	}


