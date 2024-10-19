public class datatype {
    //this program defines the type of data types in java and various ways to input and index them
    public static void main(String[] args) {
        //primitives
        int a = 2;
        byte b = 34;
        long c = 3333;
        char x ='x';
        float f = 1330.25f;
        double y = 13333.44444;
        String name = "shashank";
        boolean status = true; //primitive  data types.

        //user defined data types
        int[] arr = new int[a];
        //defines an array
        int[][] arr2 = new int[3][3];
        //defines a 2d array or a 3 by 3 matrix

        //typecasting
        //1.auto typecasting
        int n = b;
        double m = f;
        //manual type casting 
        byte b = (byte)a;

        //storing bases other than 10 on a number 
        int bin = 0b1010;//stores 10;
        int hex = 0x133;//stores in hexadecimal
        //multiplying by a power 
        float f2 = 24.44E3;  //multiplies 23.44 with 10 power 3;
        //there are also certain escape sequences in java which you should read about ..
        //escape sequences in java are characters preceded be \ that perfrom a special funcion.

    }
}
