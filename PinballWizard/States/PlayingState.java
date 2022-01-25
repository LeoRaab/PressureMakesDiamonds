package PinballWizard.States;

public class PlayingState implements GameState {

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
        //Je nachdem welcher Ball gerade im Spiel ist
        machine.displayFactory.displayBallThree();
    }
}
