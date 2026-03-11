
// INT p, q, r, s
// SET p = 4, q = 2, r = 1
// s = (p AND q) OR (r + 1)
// PRINT s

public class assignment37 {
     public static void main(String[] args) {

        int p = 4, q = 2, r = 1;
        int s;

        s = (p & q) | (r + 1);

        System.out.println(s);
    }
}
