package PinballWizard.Components.TableElements;

public class Bumper implements TableElement{

    private boolean isLightOn = false;

    public void isHit() {
        isLightOn = true;
        System.out.println("Bumper hit!");
        System.out.println("Bumper light turned on!");
    }
    public void doAction(){ System.out.println("Bumper does action!"); }
}
