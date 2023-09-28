import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EquivalencePatitioningTest {

    @Test
    public void test1() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            CheckConditions.driveRegistration(-10.0, true);
        });
        assertEquals("Year old cannot be negative", exception.getMessage());
    }

    @Test
    public void test2() {
        boolean result = CheckConditions.driveRegistration(16.0, true);
        assertEquals(false, result);
    }

    @Test
    public void test3() {
        boolean result = CheckConditions.driveRegistration(21.0, true);
        assertEquals(true, result);
    }

    @Test
    public void test4() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            CheckConditions.driveRegistration(-7.0, false);
        });
        assertEquals("Year old cannot be negative", exception.getMessage());
    }

    @Test
    public void test5() {
        boolean result = CheckConditions.driveRegistration(13.0, false);
        assertEquals(false, result);
    }

    @Test
    public void test6() {
        boolean result = CheckConditions.driveRegistration(32.0, false);
        assertEquals(false, result);
    }
}
