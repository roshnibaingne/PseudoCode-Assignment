
// DECLARE n:INTEGER
// DECLARE prev:INTEGER
// DECLARE next:INTEGER
// DECLARE sum:INTEGER
// SET prev:=0
// SET next:=1
// sum:=0
// PRINT prev
// PRINT next
// WHILE sum<=n
// sum:=prev+next
// PRINT sum
// prev:=next
// next:=sum
// ENDWHILE


import java.util.*;
public class assignment20 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

        int n;
        int prev = 0;
        int next = 1;
        int sum = 0;

        System.out.print("Enter n: ");
        n = sc.nextInt();

        System.out.println(prev);
        System.out.println(next);

        while (sum <= n) {
            sum = prev + next;
            
            if(sum > n){
                break;
            }

            System.out.println(sum);

            prev = next;
            next = sum;
        }
         
    }
     
}
