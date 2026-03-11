// INTEGER value, n
//       SET value := 32, n := 1
//       WHILE value GREATER THAN OR EQUAL TO n LOOP
//           value := value >> 1
//       END LOOP
//       PRINT value

public class assignment34 {
    public static void main(String[] args) {

        int value = 32;
        int n = 1;

        while (value >= n) {
            value = value >> 1;
        }

        System.out.println(value);
    }
}
