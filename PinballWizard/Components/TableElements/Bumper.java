package PinballWizard.Components.TableElements;

public class Bumper implements TableElement {

    private boolean isLightOn = false;

    @Override
    public void isHit() {
        //Do the Command Mister AF
        isLightOn = true;
    }

    @Override
    public void doAction() {

    }
}
