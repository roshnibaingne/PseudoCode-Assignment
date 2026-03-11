//*******PseudoCode*************

// DECLARE i: INTEGER
// FOR i:=1 TO 10
// IF i==5 THEN
//    BREAK
// ENDIF
// PRINT i
// END FOR

//*************Code***************
public class assignment17 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
    }
}
