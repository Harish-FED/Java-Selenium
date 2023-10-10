package org.company;

public class CompanyInfo {
	
	public void companyName() {
		System.out.println("Company Name: THI Infotech");
	}
	
	public void companyId() {
		System.out.println("Company Id: TN238764567");
	}
	
	public void companyAddress() {
		System.out.println("Company Address: No 158, Raj villa, Chandrasekhar Avenue, Thoraipakkam, Tamil Nadu 600097");
	}

	public static void main(String[] args) {
		CompanyInfo ci = new CompanyInfo();
		ci.companyName();
		ci.companyId();
		ci.companyAddress();
	}
}
