package employeemgmt;
import java.util.Scanner;
import employeemgmt.classes.*;

public class Main {
	
	public static void main(String[] args) {
		EmployeeBean eb = new EmployeeBean();
		Scanner num = new Scanner(System.in);
		Scanner alpha = new Scanner(System.in);
		
		System.out.println("Enter the option: \n1. Insert data\n2. Display data\n3. Exit");
		int choice  = num.nextInt();
		switch(choice) {
		case 1:
			System.out.print("Enter the Employee Id:");
			int empId = num.nextInt();
			eb.setEmpNo(empId);
			System.out.print("Enter the Employee Name:");
			String name = alpha.nextLine();
			eb.setName(name);
			System.out.print("Enter the Employee Dpartment:");
			String dept = alpha.nextLine();
			eb.setDept(dept);
			System.out.print("Enter the Employee Salary:");
			double sal = num.nextDouble();
			eb.setSal(sal);
			System.out.print("Enter the Employee Address:");
			String add = alpha.nextLine();
			eb.setAdd(add);
			System.out.print("Enter the Employee Phone no.:");
			String phoneNo = alpha.nextLine();
			eb.setPhoneNo(phoneNo);
			System.out.print("Enter the Employee EmailId:");
			String emailId = alpha.nextLine();
			eb.setEmailId(emailId);
			EmpDao edao = new EmpDao(eb);
			edao.saveEmp();
			break;
		case 2:
			EmpDao edao1 = new EmpDao(eb);
			edao1.displayAll();
			edao1.calSal();
			break;
		default:
			System.out.println("___EXIT PORTAL___");
		}
		
		num.close();
		alpha.close();
	}
}
