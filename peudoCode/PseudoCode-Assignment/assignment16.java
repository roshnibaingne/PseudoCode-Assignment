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
// b:=b*10+a
// ENDWHILE
// IF b==num THEN
//    PRINT "Palindrome"
// ELSE
//    PRINT "Not Palindrome"
//ENDIF

//**********Code*************
public class assignment16 {
    public static void main(String[] args) {
        int num = 121;
        int n = num;
        int a;
        int b = 0;
        while (n > 0) {
            a = n % 10;
            b = b * 10 + a;
            n = n / 10;
        }
        if (b == num) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
