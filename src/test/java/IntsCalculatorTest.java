import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Тестирование: IntsCalculator")
public class IntsCalculatorTest {

    private final IntsCalculator intsCalculator = new IntsCalculator();

    @Test
    @DisplayName("Тестирование метода расчета суммы")
    void sum() {
        Assertions.assertEquals(12, intsCalculator.sum(5, 7));
    }

    @Test
    @DisplayName("Тестирование метода расчета произведения")
    void mult() {
        Assertions.assertEquals(35, intsCalculator.mult(5, 7));
    }

    @Test
    @DisplayName("Тестирование метода расчета возведения в степень")
    void pow() {
        Assertions.assertEquals(78125, intsCalculator.pow(5, 7));
    }
}
