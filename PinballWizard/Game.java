package PinballWizard;

import PinballWizard.States.GameState;
import PinballWizard.States.NoCreditState;

public class Game {

    private static Game instance = null;
    private GameState state;
    private Integer points = 0;

    private Game() {

    }

    public static Game Instance() {
        if (instance == null) {
            instance = new Game();
        }
        return instance;
    }

    public void previousState() {
        state.previousState();
    }

    public void nextState() {
        state.nextState();
    }

    public void printState() {
        state.printState();
    }

    public void setState(GameState state) {
        this.state = state;
    }

    public void addPoints(Integer points) {
        this.points += points;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }
}
