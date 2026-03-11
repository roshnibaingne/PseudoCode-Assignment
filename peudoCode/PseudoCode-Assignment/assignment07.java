//pseudoCode

//DECLARE uid: STRING
//DECLARE pass: STRING
//
//READ uid
//READ pass
//
//IF uid = "admin" AND pass = "1234" THEN
//PRINT "Login Successful"
//ELSE
//PRINT "Invalid ID or Password"
//END IF
//

// Code

public class assignment07 {
    public static void main(String[] args) {


        String id = "admin";
        String password = "1234";

        if (id.equals("admin") && password.equals("1234")) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Invalid ID or Password");
        }
    }
}
