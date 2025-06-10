import java.util.*;

public class ExceptionDemo1X {
    public static void main(String Arg[]) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int iNo1 = sobj.nextInt();
        System.out.println("Enter Second Number : ");
        int iNo2 = sobj.nextInt();
        int iAns = 0;
        try {
            System.out.println("Inside Try Section");
            iAns = iNo1 / iNo2;
        } catch (ArithmeticException obj) {
            System.out.println("Inside catch Section " + obj);
        } finally {
            System.out.println("Inside finally Section");

        }
        System.out.println("Division is : " + iAns);
    }

}
