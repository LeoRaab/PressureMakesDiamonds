package PinballWizard.States;

import PinballWizard.Game;
import PinballWizard.Machine;
import PinballWizard.Player;

public interface GameState {
    Game game = Game.Instance();
    Machine machine = Machine.Instance();
    Player player = Player.Instance();
    void nextState();
    void previousState();
    void printState();
}
