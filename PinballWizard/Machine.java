package PinballWizard;

import PinballWizard.Commands.*;
import PinballWizard.Components.Ball;
import PinballWizard.Components.Flipper;
import PinballWizard.Components.Plunger;
import PinballWizard.Components.TableElements.Bumper;
import PinballWizard.Components.TableElements.Ramp;
import PinballWizard.Components.TableElements.TableElement;
import PinballWizard.Components.TableElements.TrapHole;
import PinballWizard.Display.DisplayFactory;
import PinballWizard.Display.DisplayFontBanner;

import java.util.ArrayList;

public class Machine {

    public DisplayFactory displayFactory = new DisplayFontBanner();
    private static Machine instance = null;
    private int credit;

    private ArrayList<TableElement> tableElements = new ArrayList<>();
    private Flipper flipperLeft = new Flipper();
    private Flipper flipperRight = new Flipper();
    private Plunger plunger = new Plunger();
    private ArrayList<Ball> balls = new ArrayList<>();

    private Machine() {
        tableElements.add(new Bumper());
        tableElements.add(new Bumper());
        tableElements.add(new Bumper());
        tableElements.add(new Ramp());
        tableElements.add(new TrapHole());
        tableElements.add(new TrapHole());
        tableElements.add(new TrapHole());
    }

    public static Machine Instance() {
        if (instance == null) {
            instance = new Machine();
        }
        return instance;
    }

    public void setCredit(int credit) {
        this.credit += credit;
    }

    public int getCredit() {
        return credit;
    }

    public void removeCredit() {
        credit --;
    }

    public void addBalls() {
        balls.add(new Ball());
        balls.add(new Ball());
        balls.add(new Ball());
    }

    /**
     * TODO: was passiert, wenn keiner mehr da ist
     Rosi
     */
    public void removeBall() {

        balls.remove(balls.size() - 1);
    }

    public int getNumberOfBalls() {
        return balls.size();
    }

    public void shootBall() {
        plunger.shootBall();
        
        Ball ball = new Ball();
        ball.setHitElement(new PlungerCommand(plunger));
        ball.hitElement();

        ball.setHitElement(new TrapHoleCommand(new TrapHole()));
        ball.hitElement();
    }

    public void hitLeftFlipper() {
        flipperLeft.flip();
    }

    public void hitRightFlipper() {
        flipperRight.flip();
    }

}
