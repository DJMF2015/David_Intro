import java.util.ArrayList;

public class Person {
    private String destination ;
    private ArrayList <Person> person;

    public Person(){
       this.person = new ArrayList <Person>();
            this.destination = "Edinburgh Waverley";
    }
    public String getDestination(){
        return destination;
    }

}