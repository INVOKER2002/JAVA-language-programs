public class newtonraphson {
    public static void main(String[] args) {
        double k = root(2,5,0.001);
        System.out.println(k);
        
    }
    static double root(double x,double n,double error){
        double r = (x +n/x)/2; // this is the formula for finding the root of a number using newton raphson method
        if(r-x<=error){
            return r;
        }
        return root(r,n,error);

    }
}
