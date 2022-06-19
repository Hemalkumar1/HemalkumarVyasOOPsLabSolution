package OOPsLabSolution.service;

import OOPsLabSolution.pojo.Employee;

public class CredentialService{
	
	Employee emp;
	
	public CredentialService(Employee emp)
	{
		this.emp = emp;
	}
	
	private String password = "";
	private String emailAddress = "";
	
	public String generatePassword() {
		int rand = (int)(Math.random()*9);
		password += rand;
		
		do {
			rand = (int)(Math.random()*90);
		}
		while (rand < 65);
		char c = (char)(rand);
		password += c;
		
		do {
			rand = (int)(Math.random()*61);
		}
		while (rand < 35);
		c = (char)(rand);
		password += c;
		
		do {
			rand = (int)(Math.random()* 126);
		}
		while (rand < 97);
		
		c = (char)(rand);
		password += c;
		
		rand = (int)(Math.random()* 126);
		password += rand;
		
		rand = (int)(Math.random()* 126);
		password += rand;
		
		rand = (int)(Math.random()* 126);
		password += rand;
		
		rand = (int)(Math.random()* 126);
		password += rand;
		
		return password;
	}
	
	public String generateEmailAddress() {
		emailAddress = emp.getFirstName() + emp.getLastName() + "@" + emp.getDepartment();
		emailAddress += ".GreatLearning.com";
		return emailAddress;
	}

	public void showCredentials() {
		
		System.out.println("Email    --> " + generateEmailAddress());
		System.out.println("Password --> " + generatePassword());
		
	}
}
