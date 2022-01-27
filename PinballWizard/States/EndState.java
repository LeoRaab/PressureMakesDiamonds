package PinballWizard.States;

public class EndState implements GameState {

    public EndState() {
        printState();
        nextState();
    }

    @Override
    public void nextState() {
        game.setPoints(0);

        if (machine.getCredit() > 0) {
            game.setState(new ReadyState());
            System.out.println("You have " + machine.getCredit() + " credit(s) left!");
            player.startGame();
        } else {
            game.setState(new NoCreditState());
        }
    }

    @Override
    public void previousState() {
        game.setState(new PlayingState());
    }

    @Override
    public void printState() {
        machine.displayFactory.displayGameOver();
        System.out.println("Your points: " + game.getPoints());
    }
}
