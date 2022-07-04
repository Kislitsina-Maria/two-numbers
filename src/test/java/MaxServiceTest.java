import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxServiceTest {

    @Test
    public void shouldFindMax() {
        MaxServise service = new MaxServise();

        int a = 5;
        int b = 7;

        int expected = 7;
        int actual = service.max(a, b);

        Assertions.assertEquals(expected, actual);
    }
}
