// Integer a, b, c
// set a = 7, b = 6, c = 5
// b = a + b
// if ((b + c) < (c - b) && 2 < a)
//     c = 11 + a
// End if
// c = (b + a) + 9
// if (c > a && 9 < b)
//     b = (c + a) + c
// end if
// print a + b + c


public class assignment32 {
    public static void main(String[] args) {
        int a = 7, b = 6, c = 5;
        b = a + b;
        if ((b + c) < (c - b) && 2 < a) {
            c = 11 + a;
        }
        c = (b + a) + 9;
        if (c > a && 9 < b) {
            b = (c + a) + c;
        }

        System.out.println(a + b + c);
    }
}

