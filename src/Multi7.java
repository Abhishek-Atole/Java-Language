class Demo extends Thread {
    public void run() {

    }

    synchronized public void Display() {
        // Logic
    }
}

class Multi7 {
    public static void main(String Arg[]) throws Exception {
        System.out.println("Current Thread is : " + Thread.currentThread().getName());

        Demo obj1 = new Demo();
        Demo obj2 = new Demo();

        obj1.setPriority(8);
        obj2.setPriority(10);

        obj1.start();
        obj2.start();
        System.out.println("Priority of obj1 is : " + obj1.getPriority());
        System.out.println("Priority of obj2 is : " + obj2.getPriority());

    }

}
