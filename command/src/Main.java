public class Main {

    public static void main(String[] args) {
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        LightRemoter lightRemoter = new LightRemoter();
        lightRemoter.setOnCommand(lightOnCommand);
        lightRemoter.setOffCommand(lightOffCommand);
        lightRemoter.LightOnButton();
        lightRemoter.LightOffButton();
    }

}
