import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
//predicate// boolean result 
public class predicateExample {

    public static void main(String[] args) {
    	// check to pass true or false
    	Predicate<String> checkLength=str->str.length()>4;
    	System.out.println(checkLength.test("Alexi"));
    	System.out.println(checkLength.test("Alex"));
    	
        Predicate<Integer> biggerThan5 =  x -> x > 5;
        Predicate<Integer> lessThan10 = x -> x < 10;
        Predicate<Integer> even = x -> x % 2 == 0;
        
        List<Integer> list = Arrays.asList(1, 12, 43, 89, 13, 8, 2, 8);

        List<Integer> pTest1 = list.stream()
                .filter(biggerThan5)
                .collect(Collectors.toList());

        System.out.println(pTest1); // 7, 20, 77, 14, 6

        List<Integer> pTest2 = list.stream()
                .filter(x -> (x % 2 == 0) && (x < 10)).collect(Collectors.toList());

        System.out.println(pTest2); //2, 6

        List<Integer> pTest3 = list.stream()
                .filter(biggerThan5.and(lessThan10).and(even))
                .collect(Collectors.toList());
        
        System.out.println(pTest3); // 6

    }

}