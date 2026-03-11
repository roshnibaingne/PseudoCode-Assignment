//*******PseudoCode*************

// DECLARE i: INTEGER
// FOR i:=1 TO 10
// IF i==5 THEN
//    CONTINUE
// ENDIF
// PRINT i
// END FOR

//*************Code**************

public class assignment18 {
    static void main(String[] args) {
      for (int i = 1; i <= 10; i++) {
        if (i == 5) {
            continue;
        }
        System.out.println(i);
    }
  }
}
