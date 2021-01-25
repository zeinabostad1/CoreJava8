import java.util.function.Consumer;
import java.util.Arrays;
import java.util.List;

public class ConsumerEx {

    public static void main(String[] args) {

    	
        Consumer<String> printer = x -> System.out.println(x);
        
        System.out.println("Print 1 ");

        printer.accept("yes");
        System.out.println("----------------------------------");
        
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);

        // implementation of the Consumer's accept methods.
        System.out.println("Test 2: ");
        Consumer<Integer> consumer = (Integer x) -> System.out.println(x);
        consumerTest(list1, consumer);
        System.out.println("----------------------------------");

        System.out.println("Test 2 (different method): ");
        // or call this directly
        consumerTest(list1, (Integer x) -> System.out.println(x));
        System.out.println("----------------------------------");

        List<String> list2 = Arrays.asList("Zizi", "b", "s");
        System.out.println("Test 3: ");

        consumerTest(list2, (String x) -> System.out.println(x.length()));

    }

    static <T> void consumerTest(List<T> list, Consumer<T> consumer)
    {
        for (T t : list) 
        {
            consumer.accept(t);
        }
    }

}