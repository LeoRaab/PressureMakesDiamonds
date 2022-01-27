package PinballWizard.Components;

public class Plunger {

    public void shootBall(Ball ball) {
        System.out.println("Plunger shooting ball!");
        ball.roll();
    }
}
