package PinballWizard.Components;

import PinballWizard.Commands.HitElementCommand;

public class Ball {

    private HitElementCommand hitElementCommand;

    public void roll() {
        // lol wtf is the ball doing here
    }

    public void setHitElement(HitElementCommand hitElementCommand) {
        this.hitElementCommand = hitElementCommand;
    }

    public void hitElement(){
        hitElementCommand.execute();
    }
}
