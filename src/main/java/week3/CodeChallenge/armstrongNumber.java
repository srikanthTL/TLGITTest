package week3.CodeChallenge;

public class armstrongNumber {

	public static void main(String[] args) {
		
		for ( int i=100; i <=1000; i++)
		{
			int num = i;
			int armStrongNum = 0;
			int reminder = 0;
			
			while (num !=0)
			{
				reminder = num % 10;
				num = num / 10;
				armStrongNum = armStrongNum + (reminder * reminder * reminder);
				
			}
			
			if (armStrongNum == i )
			{
				System.out.println(i +" is a armstrong number \n");
			}
				
		}

	}

}
