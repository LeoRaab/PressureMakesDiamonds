package PinballWizard.Commands;

import PinballWizard.Components.TableElements.Bumper;

public class BumperCommand implements HitElementCommand {
    private Bumper bumper;

    public BumperCommand(Bumper bumper) {
        this.bumper = bumper;
    }

    public void execute() {
        bumper.isHit();
        bumper.doAction();
    }
}