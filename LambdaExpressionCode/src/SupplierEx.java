import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;

public class SupplierEx {

    private static final DateTimeFormatter dateAndTime = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");

    public static void main(String[] args)
    {

        Supplier<String> supplierTest = () -> dateAndTime.format(LocalDateTime.now());
        String today = supplierTest.get();

        System.out.println(today);

    }

}