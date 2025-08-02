import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
    String value();
    int val();
}
class anno{
    @MyAnnotation(value="shashank",val=28)
    public static void MyMeth(String str , int i){
        anno object = new anno();
        try {
            Class<?> c = object.getClass();
            Method m = object.getMethod("MyMeth", String.class , int.class);
            MyAnnotation annotation = object.getAnnotation(MyAnnotation.class);
            
        } catch ( NoSuchMethodException e) {
            System.out.println("no such method found");
        }

    }
    public static void main(String[] args) {
        MyMeth("test",10);
    }
}