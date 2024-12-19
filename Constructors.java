public class Constructors {
    //constructors are functions but with the same name as of the class and hhave no return type
    public static void main(String[] args){
        sum s = new sum(2,4);
        diff d = new diff();
        diff d2 = new diff(5,7);
    }
}
class sum{
      sum(int a,int b){ //parameterized constructor one
        System.out.println(a+b);
      }
      sum(int a, int b ,int c){ //parameterized constructor two
        c = a + b;
        System.out.println(c);
      }
    //constructors are overloaded here
    //since methods and constructors are fundamentally the same , overloading also applies to functions as well
    
}
class diff{
    diff(int a , int b){
        System.out.println(b-a);
    }
    diff()//default constructor for the diff class
    {
        System.out.println("no parameters passed");
    }
}
