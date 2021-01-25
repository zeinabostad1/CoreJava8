import java.util.function.Function;


public class FunctionEx {

    public static void main(String[] args) {

        Function<String, Integer> func1 = x -> x.length();
        Function<Integer, Integer> func2 = x -> x * 2;
        
        Integer test1 = func1.apply("Zizi"); 
        System.out.println("Print 1: ");
        System.out.println(test1);
        System.out.println("--------------------");
        
        
        Integer test2 = func1.andThen(func2).apply("Zizi"); 
        System.out.println("Print 1: ");
        System.out.println(test2);
    }
}