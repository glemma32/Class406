package classroom406;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class AgeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int day,month,birthyear,age;
		
		
		
		System.out.println("Enter your date of birth");
		System.out.println("Enter the day");
		Scanner dayInput = new Scanner(System.in);
		day =  dayInput.nextInt();
		System.out.println("Enter the month");
		Scanner monthInput = new Scanner(System.in);
		month =  monthInput.nextInt();
		System.out.println("Enter the year");
		
		Scanner yearInput = new Scanner(System.in);
		birthyear =  yearInput.nextInt();
		
		Calendar now = Calendar.getInstance();
		int currentYear = now.get(Calendar.YEAR); 
		
		age = currentYear-birthyear;
		System.out.println("You are "+ age +" years old");
		
		}

}
