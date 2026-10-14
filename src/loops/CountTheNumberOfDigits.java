package loops;
import java.util.*;

public class CountTheNumberOfDigits {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int x= sc.nextInt();
		
		while(x>0)
		{
			int r=x%10;
			x=x/10;
			System.out.println(r);
		}
	}

}
