package PinballWizard;

import static PinballWizard.States.GameState.game;
import static PinballWizard.States.GameState.machine;

public class Player {

    private static Player instance = null;

    private Player() {
    }

    public static Player Instance() {
        if (instance == null) {
            instance = new Player();
        }
        return instance;
    }

    public void insertCoins(int amount) {
        machine.setCredit(amount);
    }

    public void startGame() {
        machine.addBalls();
        machine.removeCredit();
        game.nextState();
        machine.shootBall();
    }

    public void hitLeftFlipper() {
        machine.hitLeftFlipper();
    }

    public void hitRightFlipper() {
        machine.hitRightFlipper();
    }
}
