import org.junit.Test;
import static org.junit.Assert.*;

public class ReviewTest {

    @Test
    public void testToString() {
        Review mulan = new Review("lets get down to business ", "the one guy from mulan ", 3);
        String message = "the one guy from mulan lets get down to business 3";
        assertEquals(message, mulan.toString());
    }



}