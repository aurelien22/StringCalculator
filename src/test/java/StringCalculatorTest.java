import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {

    @Test
    void shouldSumToZeroFromNull() {
        Assertions.assertThat(StringCalculator.add(null)).isEqualTo("0");
    }

    @Test
    void shouldSumToZeroFromEmptyNumbers() {
        Assertions.assertThat(StringCalculator.add("")).isEqualTo("0");
    }

    @Test
    void shouldSumToTwoFromTwo() {
        Assertions.assertThat(StringCalculator.add("2")).isEqualTo("2");
    }

    @Test
    void shouldSumFourAndTwo() {
        Assertions.assertThat(StringCalculator.add("4,2")).isEqualTo("6");
    }

    @Test
    void shouldSumOnePointOneAndTwoPointTwo() {
        Assertions.assertThat(StringCalculator.add("1.1,2.2")).isEqualTo("3.3");
    }

}
