public class multiplecatch {
    // This program demonstrates the use of multiple catch blocks in Java.
    public static void main(String[] args) { 
        try{
         demo(19);   
        }  
        catch(ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e){
            System.out.println("Caught exception: " + e);
        }
    }
    static void demo(int a){
        if(a<10){
            throw new ArithmeticException("Arithmetic exception occurred");
        } else if(a<20){
            throw new NullPointerException("Null pointer exception occurred");
        } else{
            throw new ArrayIndexOutOfBoundsException("Array index out of bounds exception occurred");
    }
}
}