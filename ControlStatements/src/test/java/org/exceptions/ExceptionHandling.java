package org.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionHandling {
	
	public static void arithmeticException() {
		
		int numerator = 10;
		int denominator = 0;
		
		try {
			
			int result = numerator/denominator;
			System.out.println("Result - " + result);
			
		} catch (Exception e) {
	
			System.out.println("Error - " + e.getMessage());
		}
		
		
	}
	
	public static void fileReader() {
		try {
			FileReader reader = new FileReader("src\\main\\resources\\Simple poem.txt");
			int data = reader.read();
			while(data != -1) {
			System.out.print((char)data);
			data = reader.read();
			}
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	public static void fileWriter() {
		
		try {
			FileWriter writer = new FileWriter("src\\main\\resources\\Simple poem.txt");
			//writer.write("kfjbda;jNEWIFJfWK'Fokfwpokfok");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws IOException {
		//arithmeticException();
		//fileWriter();
		//fileReader();
	
		File file = new File("Simple.txt");
		
		if(file.exists()) {
			file.createNewFile();
		}
	}
}
