package PinballWizard.Commands;

import PinballWizard.Components.TableElements.TrapHole;

public class TrapHoleCommand implements HitElementCommand {
    private TrapHole trapHole;

    public TrapHoleCommand(TrapHole trapHole) {
        this.trapHole = trapHole;
    }

    public void execute() {
        trapHole.isHit();
        trapHole.doAction();
    }
}