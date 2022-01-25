package PinballWizard.States;

public class NoCreditState implements GameState {

    @Override
    public void nextState() {
        game.setState(new ReadyState());
    }

    @Override
    public void previousState() {
        System.out.println("not possible");
    }

    @Override
    public void printState() {
        System.out.println("## NO CREDIT ##");
    }
}
