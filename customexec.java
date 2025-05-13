class MyException extends Exception {
    private int detail;
    MyException(int a){
        detail = a;
    }
    String printDetail(){
        return "MyException[" + detail + "]";
    }
}
public class customexec {
    //program to demontrate custom exceptions in java
    static void compute(int a) throws MyException {
        System.out.println("Inside compute method");
        throw new MyException(a);
    }
    public static void main(String[] args) {
        //main method to test the custom exception
        try {
            compute(25);
        } catch (MyException e) {
            System.out.println("Caught" + e.printDetail());
        } finally {
            System.out.println("Finally block executed");
        }
    }

}
