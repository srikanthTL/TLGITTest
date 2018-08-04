package week1.HomeWorkDay2;

import java.util.Scanner;

public class ArithmeticOperationsWithInput 

{
	static String[] ArithOperations = {"Addition", "Multiply", "Subtract", "Multiply Number one by 2", "Divide Number two by 10"};
	static int res=0;;
	
	public static void addition(int numberone, int numbertwo) 
	{
		System.out.println("\n Sum of Two Number : \n");
		System.out.println(numberone  + numbertwo);
	}  
	 
	public static void multiply(int numberone, int numbertwo) 
	{
		System.out.println("\n Product of Two Number : \n");
		System.out.println(numberone  * numbertwo);
	}  
	
	public static void subtract(int numberone, int numbertwo) 
	{
		//Conditional or Relational operators
		\\comit
		
		System.out.println("\n Diference of Two Number : \n");
		if (numberone >= numbertwo)
		{
			res = numberone  - numbertwo;
		}
		else if (numberone <= numbertwo)
		{
			res = numbertwo - numberone;
		}
		else if (numberone == numbertwo)
		{
			System.out.println("Both number are same \n");
			res = numberone  - numbertwo;
		}
		System.out.println(res);
	}  
	
	public static void multiplyNoBy2(int numberone, int numbertwo) 
	{
		System.out.println("\n First number multiplied by 2 :\n ");
		System.out.println(numberone  * 2);
	}  
	
	public static void divideNoTwoByTen(int numberone, int numbertwo)
	{
		System.out.println("\n Second number divided by 10 : \n");
		System.out.println(numbertwo  / 10);
	} 

	public static void main(String[] args)
	{
		
		for (int i=0;i<=4;i++)
		{
			int n = i+1;
			System.out.println("Type " + n + " to the arithmetic operation : " +ArithOperations[i]);
		}
		
		Scanner Scr = new Scanner(System.in);
		
		System.out.println("Type the option to select the arithmetic operation:  \n");
		int or =Scr.nextInt();
		System.out.println();
		
		System.out.println("Type the first number : \n");
		
		int numberone=Scr.nextInt();
		System.out.println();
		
		System.out.println("Type the second number : \n");
		int numbertwo=Scr.nextInt();
		System.out.println();
		
		System.out.println("The following are the available arithmetic operations: \n");
		System.out.println();
		
		switch (or)
		{
		case 1:
			addition(numberone, numbertwo);
			break;
			
		case 2:
			multiply(numberone, numbertwo);
			break;
			
		case 3:
			subtract(numberone, numbertwo);
			break;
			
		case 4:
			multiplyNoBy2(numberone, numbertwo);
			break;
			
		case 5:
			multiplyNoBy2(numberone, numbertwo);
			break;
			
		default:
			System.out.println("Invalid Option");
		}
	}
}
