import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DecisionTableTest {

    @Test
    public void test1() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            CheckConditions.driveRegistration(-5.0, true);
        });
        assertEquals("Year old cannot be negative", exception.getMessage());
    }

    @Test
    public void test2() {
        boolean result = CheckConditions.driveRegistration(10.0, true);
        assertEquals(false, result);
    }

    @Test
    public void test3() {
        boolean result = CheckConditions.driveRegistration(20.0, true);
        assertEquals(true, result);
    }

    @Test
    public void test4() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            CheckConditions.driveRegistration(-5.0, false);
        });
        assertEquals("Year old cannot be negative", exception.getMessage());
    }

    @Test
    public void test5() {
        boolean result = CheckConditions.driveRegistration(10.0, false);
        assertEquals(false, result);
    }

    @Test
    public void test6() {
        boolean result = CheckConditions.driveRegistration(20.0, false);
        assertEquals(false, result);
    }
}
