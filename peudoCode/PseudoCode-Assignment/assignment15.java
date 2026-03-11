
// DECLARE n: INTEGER
// DECLARE num: INTEGER
// DECLARE b: INTEGER
// DECLARE a: INTEGER
// SET b:=0
// READ num
// n:=num
// while n>0
// a:=n MOD 10
// n:=n/10
// b=b+a*a*a
// ENDWHILE
// IF b==num THEN
//     PRINT "ArmStrong"
// ELSE
//     PRINT "Not ArmStrong"
//ENDIF

//***********Code*****************
public class assignment15 {
    public static void main(String[] args) {
       
        int num = 101;
        int n = num;
        int a;
        int b = 0;
        while (n > 0) {
            a = n % 10;
            b = b + a * a * a;
            n = n / 10;
        }
        if (b == num) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}
