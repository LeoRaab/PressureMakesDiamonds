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
import PinballWizard.Display.DisplayFontSwampLand;
import PinballWizard.States.EndState;

import java.util.ArrayList;

public class Machine {

    private static Machine instance = null;
    private final Game game = Game.Instance();

    public DisplayFactory displayFactory = new DisplayFontBanner();
    private final ArrayList<HitElementCommand> hitElements = new ArrayList<>();
    private final ArrayList<Ball> balls = new ArrayList<>();
    private final FlipperCommand flipperLeft = new FlipperCommand();
    private final FlipperCommand flipperRight = new FlipperCommand();
    private final PlungerCommand plunger = new PlungerCommand();

    private int credit;
    private Ball currentBall;

    private Machine() {
        hitElements.add(new BumperCommand());
        hitElements.add(new BumperCommand());
        hitElements.add(new BumperCommand());
        hitElements.add(new RampCommand());
        hitElements.add(new TrapHoleCommand());
        hitElements.add(new TrapHoleCommand());
    }

    public static Machine Instance() {
        if (instance == null) {
            instance = new Machine();
        }
        return instance;
    }

    public void shootBall() {
        currentBall = balls.get(balls.size() - 1);

        displayFactory.displayBallText(balls.size());
        plunger.execute(currentBall);
    }

    public void handleLostBall() {
        switch (balls.size()) {
            case 3, 2 -> {
                removeBall();
                shootBall();
            }
            case 1 -> {
                removeBall();
                shootExtraBall();
            }
            case 0 -> {
                game.nextState();
            }
            default -> {
                displayFactory.displayError();
                game.nextState();
            }
        }
    }

    private void shootExtraBall() {
        displayFactory.displayExtraBall();
        plunger.execute(new Ball());
    }

    public void setCredit(int credit) {
        this.credit += credit;
    }

    public int getCredit() {
        return credit;
    }

    public void removeCredit() {
        credit--;
    }

    public void addBalls() {
        balls.add(new Ball());
        balls.add(new Ball());
        balls.add(new Ball());
    }

    public void removeBall() {
        balls.remove(balls.size() - 1);
    }

    public HitElementCommand getRandomHitElement() {
        return hitElements.get((int) Math.floor(Math.random() * hitElements.size()));
    }

    public void hitLeftFlipper() {
        flipperLeft.execute(currentBall);
    }

    public void hitRightFlipper() {
        flipperRight.execute(currentBall);
    }

}
