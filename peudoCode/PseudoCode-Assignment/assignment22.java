
// DECLARE n : INTEGER
// DECLARE b : INTEGER
// DECLARE a : INTEGER
// DECLARE sum : INTEGER

// SET b := 0
// SET sum := 0

// READ n

// WHILE n > 0
//     a := n MOD 10
//     n := n / 10
//     sum := sum + a
// END WHILE

// PRINT sum

import java.util.Scanner;

public class assignment22 {
    public static void main(String[] args) {

        int n, a, sum = 0;
Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        n = sc.nextInt();

        while (n > 0) {
            a = n % 10;
            sum = sum + a;
            n = n / 10;
        }

        System.out.println("Sum of digits = " + sum);

        sc.close();   
    }
}
