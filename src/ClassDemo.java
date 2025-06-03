class Marvellous {
    public int i;
    public int j;

    public Marvellous() {
        System.out.println("Inside the Default Constructors.");
        this.i = 0;
        this.j = 0;
    }

    public Marvellous(int a, int b) {
        System.out.println("Inside parameterized Constructor");
        this.i = a;
        this.j = b;

    }

    public void Fun() {
        System.out.println("Inside Fun Method");
    }
}

class ClassDemo {
    public static void main(String Arg[]) {
        System.out.println("Inside Main Function");
        Marvellous mobj1 = new Marvellous();
        Marvellous mobj2 = new Marvellous(11, 21);

        System.out.println(mobj1.i);
        System.out.println(mobj2.j);

        mobj2.Fun();

    }

}
