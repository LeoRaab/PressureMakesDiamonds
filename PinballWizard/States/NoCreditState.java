package PinballWizard.States;

public class NoCreditState implements GameState {

    public NoCreditState() {
        printState();
    }

    @Override
    public void nextState() {
        game.setState(new ReadyState());
    }

    @Override
    public void previousState() {
        machine.displayFactory.displayError();
    }

    @Override
    public void printState() {
        machine.displayFactory.displayNoCredit();
    }
}
