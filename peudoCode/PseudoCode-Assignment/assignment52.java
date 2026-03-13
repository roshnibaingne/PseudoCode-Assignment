// FUNCTION abs(n:INTEGER):INTEGER
// IF n>0 THEN
// RETURN n
// ELSE
// RETURN -n
// ENDIF
// END FUNCTION
// PRINT abs(5)
// PRINT abs(-5)

public class assignment52 {
    public static int abs(int n){
        if(n>0)
            return n;
        else 
            return -n;
    }
    public static void main(String[] args) {
        System.out.println(abs(-5));
    }
}
