// DECLARE a : ARRAY[10] OF INTEGER
// DECLARE min : INTEGER

// FOR i := 0 TO 9
//     READ a[i]
// END FOR

// SET min := a[0]

// FOR i := 0 TO 9
//     IF a[i] < min THEN
//         min := a[i]
//     END IF
// END FOR

// PRINT min

public class assignment44 {
    public static void main(String[] args) {

        int[] a = new int[10];
        int min;

        // Example input values
        a[0] = 8;
        a[1] = 5;
        a[2] = 12;
        a[3] = 3;
        a[4] = 9;
        a[5] = 6;
        a[6] = 15;
        a[7] = 2;
        a[8] = 7;
        a[9] = 10;

        min = a[0];

        for (int i = 0; i <= 9; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }

        System.out.println(min);
    }
}
