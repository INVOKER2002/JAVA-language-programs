public class chainedexceptons {
    // This is a simple program to demonstrate the use of chained exceptions in Java.
    public static void main(String[] args) {
        try {
            demo(33);
        } catch (NullPointerException e) {
            System.out.println("Caught exception: " + e);
            System.out.println("Cause of exception: " + e.getCause());
        }
    }
    static void demo(int a){
        NullPointerException e = new NullPointerException("Null pointer exception occurred");
        e.initCause(new ArithmeticException("Arithmetic exception occurred is the cause"));
        // The above line creates a new NullPointerException and initializes it with an ArithmeticException as the cause.   
        if(a > 25){
            throw e;
        }
        else{
            System.out.println("No exception thrown since a is withing boundaries of 25");
        }
    }
}
