// DECLARE n : INTEGER
// DECLARE a : INTEGER
// DECLARE d : INTEGER
// DECLARE COUNT : INTEGER
// SET COUNT:= 0
// READ n,d
//  WHILE n>0
// a:=n MOD 10
// n:n/10
// IF a==d THEN
// INCREMENT COUNT
// ENDIF
// ENDWHILE
// PRINT(COUNT)


public class assignment24 {
    public static void main(String[] args) {

        int n = 1223432;   
        int d = 2;         
        int a;
        int count = 0;

        while (n > 0) {
            a = n % 10;
            n = n / 10;

            if (a == d) {
                count++;
            }
        }

        System.out.println("Count = " + count);
    }
}
