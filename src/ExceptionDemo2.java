import java.util.*;

public class ExceptionDemo2 {
    public static void main(String Arg[]) {
        Scanner sobj = new Scanner(System.in);
        int Arr[] = { 10, 20, 30, 40, 50, 60 };

        System.out.println("Enter the Index Form Where you Want to Fetch the data. ");
        int iIndex = sobj.nextInt();
        System.out.println("Data is : " + Arr[iIndex]);
    }
}
