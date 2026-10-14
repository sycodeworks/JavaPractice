package loops;
import java.util.Scanner;

class Palindrome
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n, temp, rem, rev = 0;
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        temp = n;

        while (n > 0)
        {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }

        if (temp == rev)
            System.out.println("Palindrome number");
        else
            System.out.println("Not a palindrome number");
    }
}