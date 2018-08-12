
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle water;


    @Before
    public void before() {
        water = new WaterBottle();
    }

    @Test
    public void volumeIs100() {
        assertEquals(100, water.getVolume());
    }


    @Test
    public void DecreaseBy10() {
        assertEquals(90, water.drink());
    }

    @Test
    public void emptyDrink() {
        assertEquals(0, water.empty());
    }

    @Test
    public void refill() {
        water.drink();
        water.fillUp();
        assertEquals(100, water.getVolume());
    }
}