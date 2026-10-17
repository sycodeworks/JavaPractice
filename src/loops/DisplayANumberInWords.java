package loops;
import java.util.*;

public class DisplayANumberInWords 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();

        String s = "";

        if (n == 0) {
            System.out.println("Zero");
        } else {
            while (n > 0) {
                int r = n % 10;

                switch (r) {
                    case 0: s = "Zero " + s; break;
                    case 1: s = "One " + s; break;
                    case 2: s = "Two " + s; break;
                    case 3: s = "Three " + s; break;
                    case 4: s = "Four " + s; break;
                    case 5: s = "Five " + s; break;
                    case 6: s = "Six " + s; break;
                    case 7: s = "Seven " + s; break;
                    case 8: s = "Eight " + s; break;
                    case 9: s = "Nine " + s; break;
                }

                n = n / 10;
            }

            System.out.println(s);
        }
    }
}
