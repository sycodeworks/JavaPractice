package conditionalStatements;

import java.util.Scanner;

public class EvenOddWithMethod {
	
	public String checkEvenOdd(int num) {
		if (num % 2 == 0) {
	        return "Even";
	    } else {
	        return "Odd";
	    }
    }

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        EvenOddWithMethod obj = new EvenOddWithMethod();
        System.out.println(obj.checkEvenOdd(num));

        sc.close();
	}

}
