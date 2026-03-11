
//PseudoCode

//SET INTEGER x=2
//    INTEGER y=24
//    INTEGER z=2
//    z=(x^z)^x
//    y=y MOD 2
// Display x+y+z

//Code

public class assignment03 {
        public static void main(String[] args) {

            int x = 2;
            int y = 24;
            int z = 2;

            z = (x ^ z) ^ x;
            y = y % 2;

            System.out.println(x + y + z);
        }
    }

