import java.math.BigDecimal;
import java.util.Arrays;

public final class StringCalculator {

    private StringCalculator(){
    }

    public static String add(String numbers) {
        if (noNumbers(numbers)) {
            return "0";
        }

        return Arrays.stream(numbers.split(","))
                .map(BigDecimal::new)
                .reduce(BigDecimal.ZERO, BigDecimal::add)
                .toPlainString();

    }

    private static boolean noNumbers(String numbers) {
        return numbers == null || numbers.isBlank();
    }
}
