package OOPsLabSolution.app;
import java.util.Scanner;

import OOPsLabSolution.pojo.Employee;
import OOPsLabSolution.service.CredentialService;

public class EmployeeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		Employee emp = new Employee(); 
		
		System.out.println("Enter your first name");
		emp.setFirstName(in.nextLine());
		
		System.out.println("Enter your last name");
		emp.setLastName(in.nextLine());
		
		System.out.println("Please enter the department from the following:");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		int deptNo = in.nextInt();
		
		switch(deptNo) {
		case 1: emp.setDepartment("Tech");
				break;
		case 2: emp.setDepartment("Admin");
				break;
		case 3: emp.setDepartment("HR");
		        break;
		case 4: emp.setDepartment("Legal");
				break;
		default: emp.setDepartment("Admin");
				break;
		}
		
		CredentialService service = new CredentialService(emp);
		
		System.out.println();
		
		System.out.println("Dear " + emp.getFirstName() + " your generated credentials are as follows");
		service.showCredentials();
	}
}

