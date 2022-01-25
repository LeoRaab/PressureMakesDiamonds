package PinballWizard.States;

import PinballWizard.Game;
import PinballWizard.Machine;

public interface GameState {
    Game game = Game.Instance();
    Machine machine = Machine.Instance();
    void nextState();
    void previousState();
    void printState();
}
