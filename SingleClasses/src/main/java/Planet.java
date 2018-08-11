public class Planet {

    private String name;
    private int size;

    private Planet(String name, int size) {
        this.name = name;
        this.size = size;

    }

    private String getName() {
        return name;
    }

    private int getSize() {
        return size;
    }

    private void explode() {

        System.out.print("Boom!" + this.name + " has exploded");
    }

    public static void main(String args[]) {

        Planet mars = new Planet("Mars", 908973);

        System.out.println(mars.getName() + " is " + mars.getSize());
        mars.explode();
    }
}
