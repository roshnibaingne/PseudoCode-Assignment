
//PseudoCode

//DECLARE a: INTEGER
//DECLARE b: INTEGER
//DECLARE c: INTEGER
//a:= 8, b:= 5, c:= 2
//c:= (a^b)^a
//b:= b MOD 4
//print a+b+c

// Code

public class assignment01 {
    static void main(String[] args) {
                int a = 8;
                int b = 5;
                int c = 2;

                c = (a ^ b) ^ a;  // XOR operation
                b = b % 4;

                System.out.println(a + b + c);
            }
        }


