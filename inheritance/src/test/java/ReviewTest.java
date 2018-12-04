import org.junit.Test;
import static org.junit.Assert.*;

public class ReviewTest {

    @Test
    public void testToString(){
        Review kevin = new Review("kevin is pretty cool", "chad", 3);
        String stringifiedKevin = kevin.toString();
        assertEquals("kevin is pretty cool, written by: chad, stars: 3", stringifiedKevin);
    }

}