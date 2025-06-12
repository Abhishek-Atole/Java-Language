public class Array1 {
    public static void main(String Arg[]) {
        int Arr1[] = { 11, 20, 30, 40, 50 };

        int Arr2[] = new int[4]; // Dynamic Array : the Memeory for this array is allocated dynamically
        Arr2[0] = 10;
        Arr2[1] = 20;
        Arr2[2] = 30;
        Arr2[3] = 40;

        System.out.println("The Length of the Array is " + Arr1.length);
        System.out.println("The Length of the Array is " + Arr2.length);

        int iCnt = 0;
        for (iCnt = 0; iCnt < Arr1.length; iCnt++) {
            System.out.println(Arr1[iCnt]);
        }
        for (iCnt = 0; iCnt < Arr2.length; iCnt++) {
            System.out.println(Arr2[iCnt]);
        }
    }

}
