import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ball extends Thread {

    private Graphics paper;
    private int x = 7, xChange;
    private int y = 0, yChange;
    private int diameter = 10;
    private int width = 200, height = 200;
    private int delayInterval = 10;

    public Ball(Graphics graphics) {
        paper = graphics;
        xChange = 3;    // or pick a random no 1-10?
        yChange = 1;    // or pick a random no 1-10?
    }

    public void run() {
        //for (int n = 1; n < 100; n++) {
        while (true) {
            move();
            draw();
            testCollision();
            delay();
            delete();
        }
    }

    private void move() {
        x = x + xChange;
        y = y + yChange;
    }

    private void testCollision() {
        if (x <= 0 || x  >= width-diameter)
            xChange = -xChange;

        if (y <= 0 || y >= height-diameter)
            yChange = -yChange;
       }

    private void delay() {
        try {
            Thread.sleep(delayInterval);
        }
        catch (InterruptedException e) {
            return;
        }
    }

    private void draw() {
        paper.setColor(Color.red);
        paper.fillOval(x, y, diameter, diameter);
    }

    private void delete() {
        paper.setColor(Color.white);
        paper.fillOval (x, y, diameter, diameter);
    }

    public void faster() {
        if (delayInterval > 10) delayInterval = delayInterval - 2;
    }

    public void slower() {
        delayInterval = delayInterval + 2;
    }

}

