// DECLARE X : ARRAY [2][2] OF INTEGER
// DECLARE sum : INTEGER
// SET sum := 0
// FOR r := 0 TO 1
// FOR c := 0 TO 1
// READ X[r][c]
// END FOR
// END FOR
// FOR r := 0 TO 1
// FOR c := 0 TO 1
// sum := sum + X[r][c]
// END FOR
// PRINT sum
// END FOR

public class assignment45 {
    public static void main(String[] args) {

        int[][] X = new int[2][2];
        int sum = 0;

        // Example input values
        X[0][0] = 1;
        X[0][1] = 2;
        X[1][0] = 3;
        X[1][1] = 4;

        for (int r = 0; r <= 1; r++) {
            for (int c = 0; c <= 1; c++) {
                sum = sum + X[r][c];
            }
            System.out.println(sum);
        }
    }
}

