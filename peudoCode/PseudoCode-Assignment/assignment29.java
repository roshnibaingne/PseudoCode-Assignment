// Set a = 1, b = 5, c = 7
// if ((c + b) < (a + c))
//     b = a + b
// else
//     if ((c + 9 + b) < (b + c))
//         c = (3 + 8) + c
//     end if
// end if
// Print a + b + c


public class assignment29 {

    public static void main(String[] args) {

        int a = 1, b = 5, c = 7;

        if ((c + b) < (a + c)) {
            b = a + b;
        } else {
            if ((c + 9 + b) < (b + c)) {
                c = (3 + 8) + c;
            }
        }

        System.out.println(a + b + c);
    }
}
