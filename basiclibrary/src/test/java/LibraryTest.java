import org.junit.Test;
import java.util.Random;
import static org.junit.Assert.*;

public class LibraryTest {

    @Test public void testRoll() {
        int[] rolls = Library.roll(3);
        Random rnd = new Random();
        int index = rnd.nextInt(rolls.length);
        assertEquals("Length of array should equal # of dice rolls", 3, rolls.length);
        assertTrue("Value at any given index should be 1-6",rolls[index] < 7 && rolls[index] > 0);
    }

    @Test public void testingDups() {
        int[] rolls = {1, 3, 5};
        assertFalse("array should contain no duplicates", Library.containsDuplicates(rolls));
    }
    @Test public void testAverage() {
        int[] numbers = {1, 2, 3, 4};
        assertEquals("Should return the average of all values in the array", 2.5, Library.average(numbers), 0.001);

        int[] moreNumbers = {4, 4, 4, 4};
        assertEquals("Should return the average of all values in the array", 4, Library.average(moreNumbers), 0.001);
    }



}
