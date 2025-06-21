class StringDemo {
    public static void main (String Arg[])
    {
        String str1 = "Hello";
        String str2 = new String("Hello"); //Heap Section
        String str3 = "Hello";              //String Constant Pool : It Checks that IF the Same String is Already stored or not if Not Mthen Store New 
        String str4 = "Marvellous";         //String Constant Pool
        String str5 = new String("Hello");     //Heap Secction  : Allocates the Memory for Each String.
        String str6 = new String("World");      //Heap Section
        String str7 = "World";                  //String Constant Pool
        String str8 = "World";  //String constant Pool
        System.out.println("Length of Str1 is : "+str1.length());
        System.out.println(str1.toUpperCase());
    }
}