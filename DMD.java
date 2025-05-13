// File Name: DMD.java
public class DMD {
    // This is a simple program to demonstrate dynamic method dispatch in Java.
    public static void main(String[] args) {
       A a = new A(); // A reference and object of A
       B b = new B(); // A reference and object of B
       C c = new C(); // A reference and object of C

            A r; // A reference variable of A type
            r=a; // Upcasting A object to A reference
            r.print(); // A's print method called
         r=b;
         r.print(); // Upcasting B object to A reference
         r=c;
            r.print(); // Upcasting C object to A reference
    }
   static class A{
        void print(){
            System.out.println("A's print method called");
        }
    }
   static class B extends A{
        void print(){
            System.out.println("B's print method called");
        }

    }
   static  class C extends A{
        void print(){
            System.out.println("C's print method called");
        }
    }
}
