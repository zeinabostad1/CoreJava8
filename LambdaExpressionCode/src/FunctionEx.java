import java.util.function.Function;


public class FunctionEx {

    public static void main(String[] args) {

        Function<String, Integer> func1 = x -> x.length();
        Function<Integer, Integer> func2 = x -> x * 2;
        
        // take a string and return the length of the string
        Integer test1 = func1.apply("akshay");   // 6
        System.out.println("Test 1: ");
        System.out.println(test1);
        System.out.println("--------------------");
        
        
        //chain function with andThen().
        Integer test2 = func1.andThen(func2).apply("akshay");   // 12
        System.out.println("Test 1: ");
        System.out.println(test2);
    }
}