package evan;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);		
		System.out.println("enter a number to check palindrome");
		int num=in.nextInt(); ///12345 ===>54321  1234
		int bk=num;//123
		int sum=0;
		int quo=0;
		
		
		while(num>=1)
		{
			int rem=num %10; //4
			 quo= num/10;  //123
			 sum = (sum * 10) + rem;//5
			 num=quo;//1234
		}
		
		if(bk==sum)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
		

	}

}
