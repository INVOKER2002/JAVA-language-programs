public class varargsoverload {
    public static void main(String[] args) {
        print(1,2,3);
        print("hello","shashank","world");
    }
    //this code shows how functions with vvariable arguments can be overloaded 
    static void print(int...numbers) {
        System.out.println("int varargs method called");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
    static void print(String...strings) {
        System.out.println("String varargs method called");
        for (String string : strings) {
            System.out.print(string + " ");
        }
        System.out.println();
    }
}
