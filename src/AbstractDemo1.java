abstract class Demo {
    public int a;
    public int b;

    public Demo() {
        System.out.println("Inside Demo Class Constructor");
        this.a = 0;
        this.b = 0;

    }

    abstract void fun();
    // virtual void fun() = 0 /// Same as C++ pure virtual function

    void gun() {
        System.out.println("Inside gun function");
    }

}

class Hello extends Demo {
    public Hello() {
        System.out.println("Inside Hello Constructor");
    }

    public void fun() {
        System.out.println("Inside Fun of Hello");
    }
}

class AbstractDemo1 {
    public static void main(String Args[]) {
        // Demo aobj = new Demo(); error we can not create the object of the abstrct
        // class bu we can inherit

        Hello hobj = new Hello();
        hobj.fun();
        hobj.gun();
    }
}