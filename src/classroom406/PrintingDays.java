package classroom406;

import java.util.Scanner;

public class PrintingDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		System.out.println("Enter the month");
		
		Scanner scannerInput = new Scanner(System.in);
		int monthSelected =  scannerInput.nextInt();
		
		if(monthSelected==1)
		{
			System.out.println("January has 31 days");
		}
		else if(monthSelected==2)
		{
			System.out.println("Feburary has 28 days");
		}
		else if(monthSelected==3)
		{
			System.out.println("March has 30 days");
		}
		else if(monthSelected==4)
		{
			System.out.println("April has 31 days");
		}
		else if(monthSelected==5)
		{
			System.out.println("May has 30 days");
		}
		else if(monthSelected==6)
		{
			System.out.println("June has 30 days");
		}
		else if(monthSelected==7)
		{
			System.out.println("July has 30 days");
		}
		else if(monthSelected==8)
		{
			System.out.println("August has 30 days");
		}
		else if(monthSelected==9)
		{
			System.out.println("September has 30 days");
		}
		else if(monthSelected==10)
		{
			System.out.println("October has 30 days");
		}
		else if(monthSelected==11)
		{
			System.out.println("November has 30 days");
		}
		else if(monthSelected==12)
		{
			System.out.println("December has 30 days");
		}
		else 
			{
				System.out.println("You enter an invalid number");
			}
	}

}
