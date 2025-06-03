import java.util.*;

class Arithematic {                                 // Constructor
    public int Value1;
    public int Value2;

    // Arithematic aobj = new Arithematic (No1,No2)
    // Arithematic aobj = new Arithematic (15,7);

    public Arithematic(int a, int b) {
        this.Value1 = a;
        this.Value2 = b;

    }

    public int Addition() {
        int Result = 0;
        Result = this.Value1 + this.Value2;
        return Result;
    }

    public int Substraction() {
        int Result = 0;
        Result = this.Value1 - this.Value2;
        return Result;
    }
}

public class OOP {
    public static void main(String Args[]) {
        int No1 = 0, No2 = 0, Ans = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the First Number : ");
        No1 = sobj.nextInt();
        System.out.println("Enter the Second Number : ");
        No2 = sobj.nextInt();

        Arithematic aobj = new Arithematic(No1, No2);

        Ans = aobj.Addition();
        System.out.println("Addition is : " + Ans);
        Ans = aobj.Substraction();
        System.out.println("Substraction is : " + Ans);
        sobj.close();
    }
}
