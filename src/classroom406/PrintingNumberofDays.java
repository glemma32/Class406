package classroom406;

import java.util.Scanner;

public class PrintingNumberofDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.out.println("Enter the month");
		
		Scanner scannerInput = new Scanner(System.in);
	 
		int monthSelected =  scannerInput.nextInt();
		  		
	    while(true)
	    {
		if(monthSelected==1)
		{
			System.out.println("The number of days in month 1 is: 31");
		}
		else if(monthSelected==2)
		{
			System.out.println("The number of days in month 2 is: 28");
		}
		else if(monthSelected==3)
		{
			System.out.println("The number of days in month 3 is: 31");
		}
		else if(monthSelected==4)
		{
			System.out.println("The number of days in month 4 is: 30");
		}
		else if(monthSelected==5)
		{
			System.out.println("The number of days in month 5 is: 31");
		}
		else 
			{
				System.out.println("You enter an invalid number");
				System.exit(1);
			}

	}

}
}
