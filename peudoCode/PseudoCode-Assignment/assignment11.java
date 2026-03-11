import java.util.Scanner;

//*******PseudoCode*************
//DECLARE x: INTEGER
//READ x
// CASE OF x:

//1: PRINT "one"
//2: PRINT "two"
//3: PRINT "THREE"

//OTHERWISE
//   PRINT "Wrong"
//ENDCASE


//*******Code*******************
public class assignment11 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            switch(x) {
                case 1:
                    System.out.println("one");
                    break;

                case 2:
                    System.out.println("two");
                    break;

                case 3:
                    System.out.println("THREE");
                    break;

                default:
                    System.out.println("Wrong");
            }
        }
    }

