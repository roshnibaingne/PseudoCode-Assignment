// DECLARE x : ARRAY [3][3] OF INTEGER
// DECLARE y : ARRAY [3][3] OF INTEGER
// DECLARE z : ARRAY [3][3] OF INTEGER
// FOR r := 0 TO 2
//     FOR c := 0 TO 2
//         READ x[r][c]
//         READ y[r][c]
//     END FOR
// END FOR
// FOR r := 0 TO 2
//     FOR c := 0 TO 2
//         z[r][c] := x[r][c] + y[r][c]
//     END FOR
// END FOR
// FOR r := 0 TO 2
//     FOR c := 0 TO 2
//         PRINT z[r][c]
//     END FOR
// END FOR

public class assignment47{
    public static void main(String[] args) {

        int[][] x = new int[3][3];
        int[][] y = new int[3][3];
        int[][] z = new int[3][3];

        x[0][0] = 1; x[0][1] = 2; x[0][2] = 3;
        x[1][0] = 4; x[1][1] = 5; x[1][2] = 6;
        x[2][0] = 7; x[2][1] = 8; x[2][2] = 9;

        y[0][0] = 9; y[0][1] = 8; y[0][2] = 7;
        y[1][0] = 6; y[1][1] = 5; y[1][2] = 4;
        y[2][0] = 3; y[2][1] = 2; y[2][2] = 1;

        for (int r = 0; r <= 2; r++) {
            for (int c = 0; c <= 2; c++) {
                z[r][c] = x[r][c] + y[r][c];
            }
        }

        for (int r = 0; r <= 2; r++) {
            for (int c = 0; c <= 2; c++) {
                System.out.print(z[r][c] + " ");
            }
            System.out.println();
        }
    }
}
