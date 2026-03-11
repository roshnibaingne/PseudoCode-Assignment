// INTEGER p, q, r
//   SET p=4, q=6, r=5
//   q = (r ^ p) & q
//   if ((6 + p) & (7 ^ r) > (p ^ r))
//     p = p + q
//   END IF
// Print p + q + r
public class assignment41 {
    public static void main(String[] args) {

        int p, q, r;

        p = 4;
        q = 6;
        r = 5;

        q = (r ^ p) & q;

        if (((6 + p) & (7 ^ r)) > (p ^ r)) {
            p = p + q;
        }

        System.out.println(p + q + r);
    }
}
