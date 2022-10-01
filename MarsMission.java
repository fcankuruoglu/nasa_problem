import java.util.Scanner;

public class MarsMission {
    public MarsMission(){

    }
    // Initializing Plateau and Rover classes. Creating 2 Rover Class Objects. Then starting moving to rovers.
    public static void startMission(){
        Plateau plateau = new Plateau();
        Rover[] rovers = new Rover[2];
        for(int i = 0; i < rovers.length; i++){
            rovers[i] = new Rover();
            checkCoordinates(plateau,rovers[i]);
            startMoving(rovers[i]);
        }

        for(Rover rover : rovers){
            checkCoordinates(plateau, rover);
            System.out.println(rover.getFinalPosition());
        }
    }
    private static void startMoving(Rover rover){
        Scanner scanner = new Scanner(System.in);

        // Reading string from terminal and storing them char list.
        char[] controlCharList = scanner.next().toUpperCase().toCharArray();
        // Creating ControlType array and storing all control type according to sent char list.
        ControlType[] controls = new ControlType[controlCharList.length];
        for(int i = 0; i < controlCharList.length; i++) {
            controls[i] = ControlType.getControlType(controlCharList[i]);
        }
        // Starting to control rover according to control types.
        for (ControlType control : controls){
            control.controlRover(rover);
        }
    }
    // Checking that Rover is on plateau or not.
    private static void checkCoordinates(Plateau plateau, Rover rover){
        if (!(rover.getX() <= plateau.getX()) || !(rover.getY() <= plateau.getY())) {
            throw new IllegalArgumentException("Rover is not on plateau. Coordinates: "+ rover.getFinalPosition());
        }
    }
}

