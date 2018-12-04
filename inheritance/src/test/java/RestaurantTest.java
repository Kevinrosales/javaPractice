import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {

    @Test
    public void testToString(){
        Restaurant zolas = new Restaurant("zolas", "$$", 3);
        String stringifiedZolas = zolas.toString();
        assertEquals("Name of the Restaurant: zolas, rating: 3, on a scale of 1-5 the price is: $$", stringifiedZolas);
    }
    @Test
    public void testAddReview() {

    }
}