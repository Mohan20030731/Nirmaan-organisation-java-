package day11;

public class MainCompany {
public static void main(String[] args) {
	
	Company co=new Company();
	
	co.setEmpName("Mohan Kumar");
	co.setEmpId(22207808);
	co.setDept("Frontend Development");
	co.setMobileNo(9940243245l);
	
	System.out.println("Employee Name \t: "+co.getEmpName());
	System.out.println("Employee ID \t: "+co.getEmpId());
	System.out.println("Department \t: "+co.getDept());
	System.out.println("mobileNo \t: "+co.getMobNo());
	
}
}


