package PinballWizard.Components.TableElements;

import PinballWizard.Components.Ball;

import static PinballWizard.States.GameState.game;

public class Ramp implements TableElement{

    public void isHit() {
        game.addPoints(1000);
        System.out.println("Ramp hit! Your points: " + game.getPoints());
    }

    public void doAction(Ball ball){
        ball.roll();
    }
}