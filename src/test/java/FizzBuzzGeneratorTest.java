import org.example.FizzBuzzGenerator;
import org.example.PrintService;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class FizzBuzzGeneratorTest {
    private final PrintService mockPrintService = mock(PrintService.class);
    private final FizzBuzzGenerator underTest = new FizzBuzzGenerator(mockPrintService);

    // test % 3 -> fizz
    // test % 5 -> buzz
    // test % 3,5 -> fizzbuzz
    // test else -> n

    @Test
    void testFizz() {
        underTest.generate(3);

        verify(mockPrintService).print("fizz");
    }

    @Test
    void testBuzz() {
        underTest.generate(5);

        verify(mockPrintService).print("buzz");
    }

    @Test
    void testPop() {
        underTest.generate(7);

        verify(mockPrintService).print("pop");
    }

    @Test
    void testFizzBuzz() {
        underTest.generate(15);

        verify(mockPrintService).print("fizzbuzz");
    }

    @Test
    void testFizzPop() {
        underTest.generate(21);

        verify(mockPrintService).print("fizzpop");
    }

    @Test
    void testBuzzPop() {
        underTest.generate(35);

        verify(mockPrintService).print("buzzpop");
    }

    @Test
    void testNumber() {
        underTest.generate(2);

        verify(mockPrintService).print("2");
    }
}
