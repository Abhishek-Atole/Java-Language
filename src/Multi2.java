class Demo implements Runnable {
    public void run() {
        System.out.println("Thread is Running......");
    }
}

class Multi2 {
    public static void main(String Arg[]) {
        System.out.println("Inside Main Thread....");

        Demo obj1 = new Demo();
        Thread T1 = new Thread(obj1);
        Demo obj2 = new Demo();
        Thread T2 = new Thread(obj2);
        T1.start();
        T2.start();
    }

}
