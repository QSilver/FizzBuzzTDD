import org.example.FizzBuzzGenerator;
import org.example.PrintService;
import org.junit.jupiter.api.Test;


import static org.mockito.Mockito.mock;

public class FizzBuzzTest {
    private final PrintService mockPrintService = mock(PrintService.class);
    private final FizzBuzzGenerator underTest = new FizzBuzzGenerator();

    @Test
    void fizzTest() {

    }
}
