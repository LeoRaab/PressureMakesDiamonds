package PinballWizard.Commands;

import PinballWizard.Machine;

public class MachineCommand implements UseMachineCommandInterface {
    private Machine machine;

    public MachineCommand(Machine machine) {
        this.machine = machine;
    }

    public void execute() {
        machine.configure();
        machine.play();
    }

}
