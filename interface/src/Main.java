import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> val = Arrays.asList(11,12,13,14,15);
        //filtering for finding a number is even/Odd
        Stream<Integer> s1= val.stream();
        Stream<Integer> s2 = s1.filter(n -> n%2 !=0);
        Stream<Integer> s3 = s2.map(n -> n+10);

        //for the reduce v can use in normal way too or can use stream also
    /*  int res = s3.reduce(0,(a,b) -> a+b);
    // System.out.println(res);*/

        //s2.forEach(i -> System.out.println(i));
        s3.forEach(i -> System.out.println(i));


    }
}
/*interface A{
    static void show(){
        System.out.println("Hello");
    }
}
interface B{
    default void show(){
        System.out.println("Hii");
    }
}
public class Main implements A,B{
    public static void main(String[] args) {
    Main obj = new Main();
        A.show();
        // IF BOTH METHODS ARE DEFAULT WE CAN ONLY ACCESS THE ONE METHOD
        // IF both are static then v can access both methods
        // if one is default and one is static then both can be accessed
        obj.show();

    }
}*/