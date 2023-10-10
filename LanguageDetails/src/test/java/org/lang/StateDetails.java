package org.lang;

public class StateDetails {
	
	public void southIndia() {
		System.out.println("South India");
	}
	
	public void northIndia() {
		System.out.println("North India");
	}
	
	public static void main(String[] args) {
		StateDetails sd = new StateDetails();
		LanguageInfo li = new LanguageInfo();
		sd.southIndia();
		sd.northIndia();
		li.tamilLanguage();
		li.englishLanguage();
		li.hindiLanguage();
	}
}
