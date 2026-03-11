
//***********PseudoCode*********

//INTEGER p,q,r
//SET p=9, q=7, r=9
//        p=(1+5) & p
//        p=p+p
//        p=(3+9) ^q
//        r=3+p
//        print p+q+r


public class assignment08 {
    public static void main(String[] args) {
        int p = 9, q = 7, r = 9;

        p = (1 + 5) & p;
        p = p + p;
        p = (3 + 9) ^ q;
        r = 3 + p;

        System.out.println(p + q + r);
    }
}
