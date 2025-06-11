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
        int iAge = sobj.nextInt();
        try {
            if (iAge < 18) {
                AgeInvalid aobj = new AgeInvalid("Your Age is Below 18.");
                throw aobj;
            } else {
                System.out.println("Login Succesful....");
            }
        } catch (AgeInvalid obj) {
            System.out.println("Inside Catch Block .");
            System.out.println(obj);
        }
    }

}
