interface Circle { // Only the structure is defined in the intefaces and the real execution is in
                   // the implementation class.
    float PI = 3.14f; // all the methods are by deafalut public
                    // By Default the characteristics is  public static final

    float Area(float Radius);

    float Circumference(float Radius);
}

class PPA implements Circle {
    public float Area(float Radius) {
        return PI * Radius * Radius;
    }

    public float Circumference(float Radius) {
        return 2 * PI * Radius;
    }
}

public class InterfaceDemo1 {
    public static void main(String Args[]) {
        PPA pobj = new PPA();
        System.out.println("Value of PI : " + Circle.PI);
        float fRet = 0.0f;
        fRet = pobj.Area(10.7f);
        System.out.println("Area is : " + fRet);
        fRet = pobj.Circumference(10.7f);
        System.out.println("Circumference is : " + fRet);
    }

}
