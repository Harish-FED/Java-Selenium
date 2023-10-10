package org.emp;

public class Employee {

	public void empId() {
		System.out.println("Employee ID: TI016");
	}
	
	public void empName() {
		System.out.println("Employee Name: Harish K");
	}
	
	public void emmDob() {
		System.out.println("DOB: 03-June-1995");
	}
	
	public void empPhone() {
		System.out.println("Phone: 9750912146");
	}
	
	public void empEmail() {
		System.out.println("Email: harish.k@thiinfotech.com");
	}
	
	public void empAddress() {
		System.out.println("Address: No- B1-5/153, 4th Main road, Otteri extension, Vandalur, Chennai - 600048");
	}
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.empId();
		emp.empName();
		emp.emmDob();
		emp.empPhone();
		emp.empEmail();
		emp.empAddress();
		
	}

}
	
