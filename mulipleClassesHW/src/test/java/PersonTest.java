import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    BusStop queue;
    Person person;
    private String destination;


    @Before
    public void before() {
        queue = new BusStop();
        person = new Person();

    }

    @Test
    public void hasDestination() {

        assertEquals("Edinburgh Waverley", person.getDestination());
    }

}



