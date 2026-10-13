package loops;
import java.util.*;

public class DisplayTheDigitsOfANumber 
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int x= sc.nextInt();
		
		for(; x>0; x= x/10)  
		 {
			 System.out.println(x%10);
		 }
	}

}
