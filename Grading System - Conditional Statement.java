package javafundamentals;

import java.util.Scanner;

public class ConditionalStatements {

	public static void main(String[] args) {
		
	//GRADING SYSTEM
		
		int hci;
		int ge;
		int rs;
		int programming;
		int pathfit;
		int modern;
		int discrete;
		int ethics;
		int css;
		int nstp;
		int ans;
		int answer;
		
			System.out.println("                                                GRADING SYSTEM                                  ");
			System.out.println();
			System.out.println("                 	Note: Please enter your grades to the respective subject below!            ");
			
			System.out.println();
			System.out.println();
			
			Scanner a = new Scanner(System.in);
			System.out.print("HCI: ");
			hci = a.nextInt();  
			
			System.out.println();
			
			Scanner b = new Scanner(System.in);
			System.out.print("GE: ");
			ge = b.nextInt();  
			
			System.out.println();
			
			Scanner c = new Scanner(System.in);
			System.out.print("RS: ");
			rs = c.nextInt();
			
			System.out.println();
			
			Scanner d = new Scanner(System.in);
			System.out.print("Intro to Programming: ");
			programming = d.nextInt();  
			
			System.out.println();
			
			Scanner e = new Scanner(System.in);
			System.out.print("PATHFIT: ");
			pathfit = e.nextInt();  
			
			System.out.println();
			
			Scanner f = new Scanner(System.in);
			System.out.print("MODERN: ");
			modern = f.nextInt();  
			
			System.out.println();
			
			Scanner g = new Scanner(System.in);
			System.out.print("DISCRETE: ");
			discrete = g.nextInt();  
			
			System.out.println();
			
			Scanner h = new Scanner(System.in);
			System.out.print("ETHICS: ");
			ethics = h.nextInt();  
			
			System.out.println();
			
			Scanner i = new Scanner(System.in);
			System.out.print("CSS NCII: ");
			css = i.nextInt();  
			
			System.out.println();
			
			Scanner j = new Scanner(System.in);
			System.out.print("NSTP(R.O|CWTS): ");
			nstp = j.nextInt();  
			
			ans = hci + ge + rs + programming + pathfit + modern + discrete + ethics + css + nstp;
			answer = ans / 10;
			
			System.out.println();
			
			if(answer >= 93) {
				System.out.println("Your GPA: " + answer + " | " + "You can avail 50% discount!");
			}else {
				System.out.println("Your GPA: " + answer + " | " + "Better luck next time!");
			}
			
		
			
			
	
			
			
			
	}

}
