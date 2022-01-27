package PinballWizard.Commands;

import PinballWizard.Components.Ball;
import PinballWizard.Components.TableElements.TrapHole;

public class TrapHoleCommand implements HitElementCommand {
    private final TrapHole trapHole = new TrapHole();

    public void execute(Ball ball) {
        trapHole.isHit();
        trapHole.doAction(ball);
    }
}