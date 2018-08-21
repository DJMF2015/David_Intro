import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    Person destination;
    BusStop queue;
    Person person;

    @Before
    public void before() {
        queue = new BusStop();
        person = new Person();

    }

    @Test
    public void canAddPassenger() {
        queue.addPassenger(person);
        assertEquals(1, queue.noOfPassengers());
    }
    @Test
    public void canPickUpPassenger(){
        queue.pickUp(person);
        assertEquals(2, queue.noOfPassengers());
    }
    @Test
    public void addDestination() {
       queue.addDestination();
       assertEquals("Glasgow", queue.addDestination());
    }
    @Test
    public void canGetPassenger(){
        queue.addPassenger(person);
        queue.pickUp(person);
        queue.removePassenger();
        assertEquals(2, queue.noOfPassengers());
    }
}