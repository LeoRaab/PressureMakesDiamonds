package PinballWizard.Commands;

import PinballWizard.Game;

public class GameCommand implements PlayGameCommandInterface {
    private Game game;

    public GameCommand(Game game) {
        this.game = game;
    }

    public void execute() {
        game.configure();
        game.play();
    }

}
