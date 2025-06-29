class Employee {
    public String Name;
    public int Salary;
    public int Age;
    public String Address;

    Employee(String str, int amount, int A, String addr) {
        this.Name = str;
        this.Salary = amount;
        this.Age = A;
        this.Address = addr;

    }

    protected void finalize() {
        System.out.println("Inside Finilize Methode.....");
    }

    void Display() {
        System.out.println("Employee Name : " + this.Name);
        System.out.println("Employee Salary :" + this.Salary);
        System.out.println("Employee Age :" + this.Age);
        System.out.println("Employee Address :" + this.Address);
    }
}

class FinalizeDemo2 {

    public static void main(String Arg[]) {
        Employee eobj = new Employee("Amit", 78000, 28, "Shinde colony Pune");
        eobj.Display();
        Employee eobj2 = eobj;

        Employee eobj3 = new Employee("Sagar", 85000, 85, "Pune");
        System.out.println("Hash Code of eobj is : " + eobj.hashCode());
        System.out.println("Hash Code of eobj2 " + eobj2.hashCode());
        System.out.println("Hash code of eobj3 : " + eobj3.hashCode());
        eobj = null;

        System.gc();
    }

}