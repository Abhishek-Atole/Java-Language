import java.util.*;

class AgeInvalid extends Exception {
    public AgeInvalid(String str) {
        super(str);
    }
}

class UserDefined {
    public static void main(String Arg[]) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Your Age : ");

        int iAge = 0;

        if (sobj.hasNextInt()) {
            iAge = sobj.nextInt();
        } else {
            System.out.println("No input provided. Using default age: 18");
            iAge = 18; // Default value or handle appropriately
        }

        try {
            if (iAge < 18) {
                AgeInvalid aobj = new AgeInvalid("Your Age is Below 18.");
                throw aobj;
            } else {
                System.out.println("Login Successful....");
            }
        } catch (AgeInvalid obj) {
            System.out.println("Inside Catch Block.");
            System.out.println(obj);
        }
    }
}