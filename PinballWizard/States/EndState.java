package PinballWizard.States;

public class EndState implements GameState {

    @Override
    public void nextState() {
        game.setPoints(0);
        game.setState(new NoCreditState());
    }

    @Override
    public void previousState() {
        game.setState(new PlayingState());
    }

    @Override
    public void printState() {
        System.out.println("## GAME OVER ##");
    }
}
