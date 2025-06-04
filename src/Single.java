class Main {
    public int A;
    public int B;

    public Main() {
        System.out.println("Inside Main");
    }

    public void Fun() {
        System.out.println("Inside Fun Function");
    }
}

class Deriverd extends Main {
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
 * Inside Main
 * Inside Derived Class Constructor.
 * Inside Fun Function
 * Insie Derievrd Sun Function.
 */