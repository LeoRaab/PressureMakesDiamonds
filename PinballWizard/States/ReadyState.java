package PinballWizard.States;

public class ReadyState implements GameState {
    @Override
    public void nextState() {
        game.setState(new PlayingState());
    }

    @Override
    public void previousState() {
        game.setState(new NoCreditState());
    }

    @Override
    public void printState() {
        machine.displayFactory.displayStartGame();
    }
}
