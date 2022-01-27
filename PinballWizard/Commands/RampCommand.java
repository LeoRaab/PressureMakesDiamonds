package PinballWizard.Commands;

import PinballWizard.Components.Ball;
import PinballWizard.Components.TableElements.Ramp;

public class RampCommand implements HitElementCommand {
    private final Ramp ramp = new Ramp();

    public void execute(Ball ball) {
        ramp.isHit();
        ramp.doAction(ball);
    }
}