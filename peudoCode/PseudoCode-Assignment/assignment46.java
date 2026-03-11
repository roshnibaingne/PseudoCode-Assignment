// DECLARE x : ARRAY [3][3] OF INTEGER
// DECLARE Even : INTEGER
// DECLARE Odd : INTEGER
// SET Even = 0
// SET Odd = 0
// FOR r := 0 TO 2
//     FOR c := 0 TO 2
//         READ x[r][c]
//     END FOR
// END FOR
// FOR r := 0 TO 2
//     FOR c := 0 TO 2
//         IF (x[r][c] MOD 2 == 0) THEN
//             Even ++
//         ELSE
//             Odd ++
//         END IF
//     END FOR
// END FOR
// PRINT even,odd


public class assignment46 {
    public static void main(String[] args) {

        int[][] x = new int[3][3];
        int Even = 0;
        int Odd = 0;

        // Example values
        x[0][0] = 1;
        x[0][1] = 2;
        x[0][2] = 3;
        x[1][0] = 4;
        x[1][1] = 5;
        x[1][2] = 6;
        x[2][0] = 7;
        x[2][1] = 8;
        x[2][2] = 9;

        for (int r = 0; r <= 2; r++) {
            for (int c = 0; c <= 2; c++) {
                if (x[r][c] % 2 == 0) {
                    Even++;
                } else {
                    Odd++;
                }
            }
        }

        System.out.println("Even = " + Even);
        System.out.println("Odd = " + Odd);
    }
}
