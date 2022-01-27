package PinballWizard.Components;

import static PinballWizard.States.GameState.machine;

public class Ball {

    public void roll() {
        System.out.println("rolling");
        machine.getRandomHitElement().execute(this);
    }
}
