// DECLARE a : ARRAY[0:4] OF INTEGER
// DECLARE sum : INTEGER
// SET sum := 0

// FOR i := 0 TO 4
//     READ a[i]
// END FOR

// FOR i := 0 TO 4
//     sum := sum + a[i]
//     PRINT sum  
// END FOR

public class assignment42 {
    public static void main(String[] args) {

        int[] a = new int[5];
        int sum = 0;

        // Input values
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;

        for (int i = 0; i <= 4; i++) {
            sum = sum + a[i];
            System.out.println(sum);
        }
    }
}
