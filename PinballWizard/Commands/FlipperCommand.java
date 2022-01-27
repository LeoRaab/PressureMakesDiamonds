package PinballWizard.Commands;

import PinballWizard.Components.Ball;
import PinballWizard.Components.Flipper;

public class FlipperCommand implements HitElementCommand {
    private final Flipper flipper = new Flipper();

    public void execute(Ball ball) {
        flipper.flip();
    }
}