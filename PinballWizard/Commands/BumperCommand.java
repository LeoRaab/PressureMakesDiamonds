package PinballWizard.Commands;

import PinballWizard.Components.Ball;
import PinballWizard.Components.TableElements.Bumper;

public class BumperCommand implements HitElementCommand {
    private final Bumper bumper = new Bumper();

    public void execute(Ball ball) {
        bumper.isHit();
        bumper.doAction(ball);
    }
}