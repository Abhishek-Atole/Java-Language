class Base {
    public int A;
    public int B;

    public Base() {
        System.out.println("Inside the Base Class Constructor.");
    }

    public void Fun() {
        System.out.println("Inside the Base Class Fun Function");
    }
}

class Derived extends Base {
    public int C;
    public int D;
    public char E;

    public Derived() {
        System.out.println("Inside the Derived Class Constructor");
    }

    public void Gun() {
        System.out.println("Inside the Derived Class Gun Function.");
    }
}

class DerivedX extends Base {
    public int F;
    public int G;
    public char H;

    public DerivedX() {
        System.out.println("Inside the DerivedX Class Constructor");
    }

    public void Run() {
        System.out.println("Inside the Derived Class Run Function.");
    }
}

public class Hirarchal {
    public static void main(String Args[]) {
        DerivedX aobj = new DerivedX();
        aobj.Fun();
        aobj.Run();
    }
}

/*
 * Output :- 
 * 
 * Inside the Base Class Constructor.
 * Inside the DerivedX Class Constructor
 * Inside the Base Class Fun Function
 * Inside the Derived Class Run Function.
 */