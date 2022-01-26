package PinballWizard;

public class Main {
    public static void main(String[] args) {

        Machine machine = Machine.Instance();
        Game game = Game.Instance();

        Player player = new Player();

        player.insertCoins(3);
        game.nextState();

        player.startGame();
    }
}
