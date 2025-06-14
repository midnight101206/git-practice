package javafundamentals;

import java.util.Scanner;

public class ConditionalStatements {

	public static void main(String[] args) {
		
	int age;
	
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your age: ");
		age = s.nextInt();
	
		if(age > 17) {
			System.out.println("You can vote!");
		}else if(age >= 13) {
			System.out.println("You need your parents consent!");
		}else {
			System.out.println("You cannot vote!");
		}
		
		
		
			
			
	
			
			
			
	}

}
