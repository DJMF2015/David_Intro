import java.util.ArrayList;

public class BusStop {

    private String destination;
    private int capacity;
    private ArrayList <Person> queue;

    public BusStop() {
        this.queue = new ArrayList <Person>();
    }

    //    Create a method to add a passenger onto the bus only if the passenger count is less than the capacity.
    public void addPassenger(Person person) {
        if (queue.size() <= capacity) {
            this.queue.add(person);
            System.out.println(this.capacity++);
        }
    }

    public void pickUp(Person person) {
        this.queue.add(person);
        this.queue.add(person);

    }

    //return no of passengers in queue
    public int noOfPassengers() {
        return this.queue.size();
    }

    //remove a passenger from queue
    public Person removePassenger() {
        return this.queue.remove(0);
    }

    //add passenger's destination
    public String addDestination() {
        this.destination = "Glasgow";
        return destination;
    }
}
