package PinballWizard.Components.TableElements;

import PinballWizard.Components.Ball;

import static PinballWizard.States.GameState.machine;

public class TrapHole implements TableElement{

    public void isHit() { System.out.println("TrapHole hit!"); }
    public void doAction(Ball ball){
        machine.handleLostBall();
    }
}