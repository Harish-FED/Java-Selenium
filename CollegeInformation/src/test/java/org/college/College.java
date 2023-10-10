package org.college;

public class College {

	public void collegeName() {
		System.out.println("College Name: GTN Arts College");
	}
	
	public void collegeCode() {
		System.out.println("College Code: 072 ");
	}
	
	public void collegeRank() {
		System.out.println("College Rank: 7");
	}
	
	public static void main(String[] args) {
		College cl = new College();
		Student st = new Student();
		Hostel hs = new Hostel();
		Dept dt = new Dept();
		
		//College
		cl.collegeName();
		cl.collegeCode();
		cl.collegeRank();
		//Student
		st.studentName();
		st.studentDept();
		st.studentId();
		//Hostel
		hs.hostelName();
		//Dept
		dt.deptName();
	}
}
