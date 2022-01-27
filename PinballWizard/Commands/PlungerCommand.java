package PinballWizard.Commands;

import PinballWizard.Components.Ball;
import PinballWizard.Components.Plunger;

public class PlungerCommand implements HitElementCommand {
    private final Plunger plunger = new Plunger();

    public void execute(Ball ball) {
        plunger.shootBall(ball);
    }

}