class Arithematic {
    public int Addition(int A, int B) {
        return A + B;
    }

    public int Addition(int A, int B, int C) {
        return A + B + C;
    }

    public double Addition(double A, double B) {
        return A + B;
    }
}

public class Overloading {

    public static void main(String Arg[]) {
        Arithematic aboj = new Arithematic();
        int iRet = 0;
        double dRet = 0.0;

        iRet = aboj.Addition(10, 11);
        System.out.println("The Addition is : " + iRet);
        iRet = aboj.Addition(20, 30, 40);
        System.out.println("The Addition is : " + iRet);
        dRet = aboj.Addition(10.52, 11.48);
        System.out.println("The Addition is : " + dRet);
    }
}