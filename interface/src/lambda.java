import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
//for each method using lambda function
//Consumer is an interface that has aceept method
//anonymous class :
/*class cons implements Consumer<Integer>{
    public void accept(Integer i){
        System.out.println(i);
    }
}*/
public class lambda {
    public static void main(String[] args) {
        List<Integer> value = Arrays.asList(1,2,3,4,5,6);
        value.forEach(i -> System.out.println(i));
    }
}
