import Marvellous.Math;
import Marvellous.Infosystems.Arithematic;

public class PackageDemo {
    public static void main(String Arg[]) {
        Math mobj = new Math();
        Arithematic aobj = new Arithematic();

        int iRet = 0;
        iRet = mobj.Addition(10, 11);
        System.out.println("The Addition is : " + iRet);
        iRet = aobj.Substraction(21, 11);
        System.out.println("The Addition is : " + iRet);

    }

}
