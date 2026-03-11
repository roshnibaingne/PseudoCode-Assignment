import java.util.Scanner;

//*******PseudoCode*************

// DECLARE num:INTEGER
// INTEGER i
// SET sum=0
// READ num
// FOR i=1 TO num LOOP
// sum:=sum+i
// END FOR
// PRINT SUM
//***********Code*****************

public class assignment14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
         
    }
}
