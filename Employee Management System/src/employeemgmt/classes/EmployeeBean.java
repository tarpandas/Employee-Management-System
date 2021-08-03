package employeemgmt.classes;

public class EmployeeBean{

	private int empNo;
	private String name;
	private String dept;
	private double sal;
	private String add;
	private String phoneNo;
	private String emailId;
	
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public int getEmpNo() {
		return empNo;
	}
	public String getName() {
		return name;
	}
	public String getDept() {
		return dept;
	}
	public double getSal() {
		return sal;
	}
	public String getAdd() {
		return add;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public String getEmailId() {
		return emailId;
	}
	
}
