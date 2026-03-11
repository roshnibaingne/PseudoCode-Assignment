
// DECLARE n:INTEGER
// DECLARE b:INTEGER
// DECLARE a:INTEGER
// SET b:=0
// READ n
// WHILE n>0
//   a:=n MOD 10
//  n:=n/10
// b:=b*10+a
// ENDIF


public class assignment21 {
    public static void main(String[] args) {

        int n = 1234;  
        int a;
        int b = 0;

        while (n > 0) {
            a = n % 10;       
            n = n / 10;       
            b = b * 10 + a;   
        }

        System.out.println("Reversed number: " + b);
    }
}
    
