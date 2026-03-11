
//  Integer a, b, c
// set a = 7, b = 8, c = 9
// if ((a ^ b ^ c) < (b + c + a))
//     b = 6 + a
// end if
// a = 8 ^ b
// Print a + b + c

public class assignment27 {
    public static void main(String[] args) {

        int a, b, c;

        a = 7;
        b = 8;
        c = 9;

        if ((a ^ b ^ c) < (b + c + a)) {
            b = 6 + a;
        }

        a = 8 ^ b;

        System.out.println(a + b + c);
    }
}

