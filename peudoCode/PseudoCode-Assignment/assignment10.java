import java.util.Scanner;

//*******PseudoCode*************

//DECLARE x: INTEGER
//DECLARE y: INTEGER
//        READ x, y
//IF x > 0 AND y > 0 THEN
//PRINT "First Quadrant"
//ELSE IF x < 0 AND y > 0 THEN
//PRINT "Second Quadrant"
//ELSE IF x < 0 AND y < 0 THEN
//PRINT "Third Quadrant"
//ELSE IF x > 0 AND y < 0 THEN
//PRINT "Fourth Quadrant"
//ELSE IF x = 0 AND y = 0 THEN
//PRINT "Origin"
//ELSE IF x = 0 THEN
//PRINT "On Y-axis"
//ELSE
//PRINT "On X-axis"
//END IF

//***********Code*****************

public class assignment10 {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int x = sc.nextInt();
            int y = sc.nextInt();

            if (x > 0 && y > 0) {
                System.out.println("First Quadrant");
            }
            else if (x < 0 && y > 0) {
                System.out.println("Second Quadrant");
            }
            else if (x < 0 && y < 0) {
                System.out.println("Third Quadrant");
            }
            else if (x > 0 && y < 0) {
                System.out.println("Fourth Quadrant");
            }
            else if (x == 0 && y == 0) {
                System.out.println("Origin");
            }
            else if (x == 0) {
                System.out.println("On Y-axis");
            }
            else {
                System.out.println("On X-axis");
            }
        }
    }

