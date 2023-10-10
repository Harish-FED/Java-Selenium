package org.emp;

import org.client.Client;
import org.company.Company;
import org.project.Project;

public class Employee {
	
	public void empName() {
		System.out.println("Emloyee Name: Harish K");
	}
	
	public static void main(String[] args) {
		Employee em = new Employee();
		Company cm = new Company();
		Client cl = new Client();
		Project pr = new Project();
		
		em.empName();
		cm.companyName();
		cl.clientName();
		pr.projectName();
	}
}
