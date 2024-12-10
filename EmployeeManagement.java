package day14;

public class EmployeeManagement {
	
	private String empName;
	private int empId;
	private String dept;
	private long mobNo;
	
public EmployeeManagement(String empName,int empId,String dept,long mobNo ) {
	this.empName=empName;
	this.empId=empId;
    this.dept=dept;
    this.mobNo=mobNo;
}
  EmployeeManagement(){
	
}

public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public long getMobNo() {
	return mobNo;
}
public void setMobNo(long mobNo) {
	this.mobNo = mobNo;
}
public String toString() {
	return "Employee Name \t:"+empName+"\nEmployee Id \t:"+empId+"\nDepartment \t:"+dept+"\nMobile Number \t:"+mobNo;
}
}





