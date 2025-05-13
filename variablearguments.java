public class variablearguments {
    public static void main(String[] args) {
        //this method shows the use of variable arguments in amethod both using an array and without an array by using the (...) operator
         int[] arr = {1,2,3,4,5};
            printnum(arr); // this will call the method with an array as an argument
            printnum2(1,2,3,4,5); // this will call the method with variable arguments as an argument
            printnum3("hello",1,2,3,4,5); // this will call the method with variable arguments along with normal arguments as an argument
    }
    static void printnum(int[] arr){ //this method shows the use of array as an argument
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]+" --printed using array as an argument");
        }
    }
    static void printnum2(int...arr){ //this method shows the use of variable arguments as an argument
        for(int i =0 ;i<arr.length;i++){
            System.out.println(arr[i]+" --printed using variable arguments as an argument");
        }

    }
    static void printnum3(String a , int...v){ //this method shows the use of variable arguments along with normal arguments as an argument
        System.out.println("the string element passed is "+a);
        for(int i =0;i<v.length;i++){
            System.out.println(v[i]+" --printed using variable arguments along with normal arguments as an argument");
        }
    }
}
