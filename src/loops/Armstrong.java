package loops;
import java.util.Scanner;

class Armstrong
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n, temp, digit, sum = 0, count = 0;
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        temp = n;

        // Count the digits
        int x = n;
        while (x > 0)
        {
            count++;
            x = x / 10;
        }

        // Calculate the sum
        x = n;
        while (x > 0)
        {
            digit = x % 10;
            sum += Math.pow(digit, count);
            x = x / 10;
        }

        if (sum == temp)
            System.out.println("Armstrong number");
        else
            System.out.println("Not an Armstrong number");
    }
}