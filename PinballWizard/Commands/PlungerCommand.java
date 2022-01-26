package PinballWizard.Commands;

import PinballWizard.Components.Plunger;

public class PlungerCommand implements HitElementCommand {
    private Plunger plunger;

    public PlungerCommand(Plunger plunger) {
        this.plunger = plunger;
    }

    public void execute() {
        plunger.shootBall();
    }

}