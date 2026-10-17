package loops;
import java.util.*;

public class ArithmeticProgression {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first term");
		int a= sc.nextInt();
		
		System.out.println("Enter the difference d: ");
		int d= sc.nextInt();
		
		System.out.println("Enter the number of terms: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			System.out.println(a+ " ");
			a= a+d;
		}
	}

}
