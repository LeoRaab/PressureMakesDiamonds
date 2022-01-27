package PinballWizard;

import PinballWizard.States.NoCreditState;

public class Main {
    public static void main(String[] args) {

        Game game = Game.Instance();
        Player player = Player.Instance();

        game.setState(new NoCreditState());
        player.insertCoins(3);
        game.nextState();

        player.startGame();
    }
}
