package PinballWizard;

import PinballWizard.Commands.PlayGameCommandInterface;
import PinballWizard.Commands.UseMachineCommandInterface;
import PinballWizard.Machine;

import static PinballWizard.States.GameState.game;
import static PinballWizard.States.GameState.machine;

public class Player {
    public void insertCoins(int amount) {
        machine.setCredit(amount);
    }

    public void startGame() {
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
