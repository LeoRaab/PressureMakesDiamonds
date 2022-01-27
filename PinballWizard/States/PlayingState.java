package PinballWizard.States;

public class PlayingState implements GameState {

    public PlayingState() {
        printState();
    }

    @Override
    public void nextState() {
        game.setState(new EndState());
    }

    @Override
    public void previousState() {
        game.setState(new ReadyState());
    }

    @Override
    public void printState() {
        machine.displayFactory.displayPlaying();
    }
}
