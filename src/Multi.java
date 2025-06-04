class MainBase {
    public int A;
    public int B;

    public MainBase() {
        System.out.println("Inside the MainMainBase Class Constructor.");
    }

    public void Fun() {
        System.out.println("Inside the MainBase Class Fun Function");
    }
}

class Derived2 extends MainBase {
    public int C;
    public int D;
    public char E;

    public Derived2() {
        System.out.println("Inside the Derived2 Class Constructor");
    }

    public void Gun() {
        System.out.println("Inside the Derived2 Class Gun Function.");
    }
}

class DerivedX3 extends Derived2 {
    public int F;
    public int G;
    public char H;

    public DerivedX3() {
        System.out.println("Inside the DerivedX3 Class Constructor");
    }

    public void Run() {
        System.out.println("Inside the Derived2 Class Run Function.");
    }
}

public class Multi {
    public static void main(String Args[]) {
        DerivedX3 aobj = new DerivedX3();
        aobj.Fun();
        aobj.Gun();
        aobj.Run();
    }
}

/*
 * Output :- 
 * Inside the MainBase Class Constructor.
 * Inside the Derived2 Class Constructor
 * Inside the DerivedX3 Class Constructor
 * Inside the MainBase Class Fun Function
 * Inside the Derived2 Class Gun Function.
 * Inside the Derived2 Class Run Function.
 */