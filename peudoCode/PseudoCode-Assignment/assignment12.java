//*******PseudoCode*************

//INTEGER p,q,r
//SET p=9 , q=6 , r=10
// IF ((q^p^r) > (r^q))
//r=(11 & 12) +q
//END IF
//IF((q^6^8) > (p^4))
//p=(r+3) & r
//ENDIF
//PRINT p+q+r

//***********Code*****************
public class assignment12 {
    public static void main(String[] args) {
        int p, q, r;
        p = 9;
        q = 6;
        r = 10;
        if ((q ^ p ^ r) > (r ^ q)) {
            r = (11 & 12) + q;
        }
        if ((q ^ 6 ^ 8) > (p ^ 4)) {
            p = (r + 3) & r;
        }
        System.out.println(p + q + r);
    }
}

