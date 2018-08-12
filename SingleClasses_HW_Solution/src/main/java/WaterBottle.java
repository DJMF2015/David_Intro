
public class WaterBottle {

    //  instance variables
    private int volume;


    public WaterBottle() {
        this.volume = 100;
    }

    public int getVolume() {
        return this.volume;
    }

    public int setVolume(int volume) {

        return this.volume = volume;
    }

    public int drink() {
        return this.volume -= 10;
    }

    public int empty() {
        return volume = 0;
    }

    public int fillUp() {
        return this.volume = 100;
    }

}
