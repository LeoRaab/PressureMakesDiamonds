package PinballWizard.Commands;

import PinballWizard.Components.TableElements.Ramp;

public class RampCommand implements HitElementCommand {
    private Ramp ramp;

    public RampCommand(Ramp ramp) {
        this.ramp = ramp;
    }

    public void execute() {
        ramp.isHit();
        ramp.doAction();
    }
}