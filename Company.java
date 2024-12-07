package day11;

public class Company {
	private String empName;
	private int empId;
	private String Dept;
	private long mobNo;
	
public Company(String empName,int empId,String Dept,long mobNo) {
	this.empName=empName;
	this.empId=empId;
    this.Dept=Dept;
    this.mobNo=mobNo;
}
    public Company() {
}
	String getEmpName() {
	    return(empName);
	}
	int getEmpId() {
	    return(empId);
	}
	String getDept() {
		return(Dept);
	}
	long getMobNo() {
		return(mobNo);
	}
	void setEmpName(String empName) {
		this.empName=empName;
	}
	void setEmpId(int empId) {
		this.empId=empId;
	}
	void setDept(String Dept) {
		this.Dept=Dept;
	}
	void setMobileNo(long mobNo) {
		this.mobNo=mobNo;
	}		
    public String toString() {
    	return "Company {empName="+empName+"empId"+empId+"Dept="+Dept+"mobNo"+mobNo+"}";
}
}

