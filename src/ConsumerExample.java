import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> d=
                name -> System.out.println("Hi, "+ name);
        d.accept("Ekta Kumari!");

    }
}

