// INTEGER P, Q, R
// SET P=6, Q=4, R=4
// R = (R + P) + Q

// IF ((Q + P) < (10 - Q))
//     R = 12 + Q
// END IF

// P = R + R
// Q = (Q + 4) + R

// PRINT P + Q + R

public class assignment40 {
    public static void main(String[] args) {

        int P, Q, R;

        Q = 30;
        P = 10;
        R = 20;

        if (R > (R + P)) {
            Q = 1;
        } else {
            P = P - 2;
            R = R - 2;
        }

        if ((R > (Q + P)) || true) {
            Q = (0 ^ 5);
        } else {
            P = P + 2;
            R = P + 2;
        }

        System.out.println(P + Q + R);
    }
}
