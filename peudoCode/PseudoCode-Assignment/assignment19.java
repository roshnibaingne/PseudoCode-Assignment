//*******PseudoCode*************

//DECLARE n : INTEGER
//READ n
//FOR i := 2 TO n-1
//IF n MOD i = 0 THEN
//PRINT "Not Prime Number"
//    BREAK
//END IF
// END FOR
//  IF n==i THEN
// PRINT "prime number"
// ENDIF


//*******Code*************

public class assignment19 {
    public static void main(String[] args) {

        int n = 9;
        int i;
        for (i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                System.out.println("Not Prime Number");
                break;
            }
        }

        if (i == n) {
            System.out.println("Prime Number");
        }
    }

}
