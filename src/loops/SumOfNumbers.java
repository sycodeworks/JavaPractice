package loops;
import java.util.*;
public class SumOfNumbers {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int x= sc.nextInt();
		int sum=0;
		
		for(int i=1; i<=x; i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum of number is "+ (sum));
	}

}
