class Base {
    public int A;
    public int B;

    public Base() {
        System.out.println("Inside Base");
    }

    public void Fun() {
        System.out.println("Inside Fun Function");
    }
}

class Deriverd extends Base {
    public int C;
    public int D;

    public Deriverd() {
        System.out.println("Inside Derived Class Constructor.");
    }

    public void Sun() {
        System.out.println("Insie Derievrd Sun Function.");
    }
}

public class Single {
    public static void main(String Angs[]) {
        Deriverd aobj = new Deriverd();
        aobj.Fun();
        aobj.Sun();
    }
}

/*
 * Output : -
 * Inside Base
 * Inside Derived Class Constructor.
 * Inside Fun Function
 * Insie Derievrd Sun Function.
 */