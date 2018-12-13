import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {

    @Test public void testAddMethod() {
        Restaurant place = new Restaurant("testing test", 2, "$");

        Review kevin = new Review("its Kevin", "kevin", 5);
        String message = "testing test3.5$";
        place.addReview(kevin);

        assertEquals(message, place.toString());

    }
}