package PinballWizard.Components.TableElements;

import PinballWizard.Components.Ball;

import static PinballWizard.States.GameState.game;

public class Bumper implements TableElement{

    private boolean isLightOn = false;

    public void isHit() {
        isLightOn = true;
        game.addPoints(200);
        System.out.println("Bumper hit! Your points: " + game.getPoints());
        System.out.println("Bumper light turned on!");
    }
    public void doAction(Ball ball){
        ball.roll();
    }
}
