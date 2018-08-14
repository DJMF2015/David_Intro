import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class NumberListTest {

    private NumberList myNumbers;

    @Before
    public void setup(){
        //add to arraylist 4 integers
        ArrayList<Integer> testNumbers = new ArrayList();
        testNumbers.add(1);
        testNumbers.add(2);
        testNumbers.add(3);
        testNumbers.add(5);
        //create new arraylist instance myNumbers to pass vy value(?) to NumberList class
        myNumbers = new NumberList(testNumbers);
    }

    @Test
    public void hasNumberOfEntries(){
        assertEquals(4, myNumbers.getNumberCount());
    }

    @Test
    public void canAddNumberToList(){
        myNumbers.addNumber(12);
        assertEquals(5, myNumbers.getNumberCount());
    }

    @Test
    public void canGetFirstNumber(){
        assertEquals(1, myNumbers.getNumberAtIndex(0));
    }

    @Test
    public void canGetTotal(){
        assertEquals(11, myNumbers.getTotal());
    }
}