package loops;
import java.util.*;

public class Factorial {
	public static void main (String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int x= sc.nextInt();
		// 3!= 3*2*1
		int fact= 1;
		for(int i=1; i<=x; i++)
		{
			fact= fact*i;
		}
		System.out.println("Factorial is " +fact);
	}

}
