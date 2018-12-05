import org.junit.Test;
import static org.junit.Assert.*;

public class ShopTest {

    @Test
    public void testToString() {
        Shop basspro = new Shop("bass pro", "sports and outdoor", "$$");
        String stringifiedBassPro = basspro.toString();
        assertEquals("Name of the Shop: bass pro, description: sports and outdoor, on a scale of 1-5 $'s the price is: $$", stringifiedBassPro);
    }


}