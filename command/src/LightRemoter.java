import interfaces.Command;

/**
 * Invoker
 */
public class LightRemoter {
    private Command onCommand;
    private Command offCommand;

    public void LightOnButton() {
        onCommand.execute();
    }

    public void LightOffButton() {
        offCommand.execute();
    }

    public void setOnCommand(Command command) {
        this.onCommand = command;
    }

    public void setOffCommand(Command command) {
        this.offCommand = command;
    }
}
