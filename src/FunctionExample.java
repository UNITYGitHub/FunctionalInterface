import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<Integer,Double> f= x-> x/2.0;
        System.out.println(f.apply(10));
    }
}
