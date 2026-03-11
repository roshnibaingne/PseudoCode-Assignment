
// DECLARE n : INTEGER
// DECLARE a: INTEGER
// DECLARE d: INTEGER
// DECLARE found : BOOLEAN
// SET sum := 0 ,found=FALSE
// READ n,d
// WHILE n>0
// a:=n MOD 10
// n:n/10
// IF a==d THEN
// found:=TRUE
//  BREAK
// ENDIF
// ENDWHILE
// IF found == TRUE
//   PRINT ("search successful")
// ELSE 
//   PRINT("search unsuccessful")


public class assignment23 {
     public static void main(String[] args) {

        int n = 12345;   
        int d = 3;       
        int a;
        boolean found = false;

        while (n > 0) {
            a = n % 10;
            n = n / 10;

            if (a == d) {
                found = true;
                break;
            }
        }

        if (found == true) {
            System.out.println("search successful");
        } else {
            System.out.println("search unsuccessful");
        }
    }
}
