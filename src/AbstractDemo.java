abstract class Demo {
    public int a;
    public int b;

    public Demo() {
        System.out.println("Inside Demo Class Constructor");
        this.a = 0;
        this.b = 0;

    }

    abstract void fun(); 
    //virtual void fun() = 0        /// Same as C++ pure virtual function

    void gun() {
        System.out.println("Inside gun function");
    }

}

class AbstractDemo {
    public static void main(String Args[]) {
        //Demo aobj = new Demo();
    }
}