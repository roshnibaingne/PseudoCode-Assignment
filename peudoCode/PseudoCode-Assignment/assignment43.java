// DECLARE a : ARRAY[5] OF INTEGER
// DECLARE max : INTEGER

// FOR i := 0 TO 4
//     READ a[i]
// END FOR

// SET max := a[0]

// FOR i := 0 TO 4
//     IF a[i] > max THEN
//         max := a[i]
//     END IF
// END FOR
// PRINT max

public class assignment43 {
    public static void main(String[] args) {

        int[] a = new int[5];
        int max;

        // Example input values
        a[0] = 3;
        a[1] = 7;
        a[2] = 2;
        a[3] = 9;
        a[4] = 5;

        max = a[0];

        for (int i = 0; i <= 4; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }

        System.out.println(max);
    }
    }
