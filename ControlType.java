// An enum class for control types. Rotate left, rotate right or move forward.
public enum ControlType {
    ROTATE_LEFT('L'){
        @Override
        public void controlRover(Rover rover){
            rover.direction.turnLeft(rover);
        }
    }, ROTATE_RIGHT('R'){
        @Override
        public void controlRover(Rover rover){
            rover.direction.turnRight(rover);
        }
    }, MOVE_FORWARD('M'){
        @Override
        public void controlRover(Rover rover){
            rover.direction.moveForward(rover);
        }
    };
    private final char value;

    ControlType(char c) {
        this.value = c;
    }

    public char getValue() {
        return value;
    }
    public static ControlType getControlType(char c ){
        if (c == 'L'){
            return ROTATE_LEFT;
        } else if (c == 'R') {
            return ROTATE_RIGHT;
        } else if (c == 'M') {
            return MOVE_FORWARD;
        }else {
            throw new IllegalArgumentException("There is not type of movement with this key  " + c + "!");
        }
    }

    public abstract void controlRover(Rover rover);
}
