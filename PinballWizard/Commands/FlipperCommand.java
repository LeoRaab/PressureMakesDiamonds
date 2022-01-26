package PinballWizard.Commands;

import PinballWizard.Components.Flipper;

public class FlipperCommand implements HitElementCommand {
    private Flipper flipper;

    public FlipperCommand(Flipper flipper) {
        this.flipper = flipper;
    }

    public void execute() {
        flipper.flip();
    }
}