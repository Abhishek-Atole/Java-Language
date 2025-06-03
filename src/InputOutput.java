import java.util.*; //Means Java package madil util madhil srv kahi import kra Becaue this has scanner function
// * Import all

public class InputOutput {

    public static void main(String Args[]) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the First Number : ");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter the Second Number : ");
        int iNo2 = sobj.nextInt();

        int Ans = 0;
        Ans = iNo1 + iNo2;

        System.out.println("Addition is : " + Ans);     // + Concate = (Means Combines the Data)
        sobj.close();
    }
}
