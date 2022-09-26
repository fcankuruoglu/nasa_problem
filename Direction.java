// An enum class for the four cardinal direction.
public enum Direction {
    NORTH('N'){
        @Override
        public void turnLeft(Rover rover){
            rover.setDirection(Direction.WEST);
        }
        @Override
        public void turnRight(Rover rover){
            rover.setDirection(Direction.EAST);
        }
        @Override
        public void moveForward(Rover rover){
            rover.setY(rover.getY() + 1);
        }
    }, SOUTH('S'){
        public void turnLeft(Rover rover){
            rover.setDirection(Direction.EAST);
        }
        public void turnRight(Rover rover){
            rover.setDirection(Direction.WEST);
        }
        public void moveForward(Rover rover){
            rover.setY(rover.getY() - 1);
        }
    }, WEST('W'){
        public void turnLeft(Rover rover){
            rover.setDirection(Direction.SOUTH);
        }
        public void turnRight(Rover rover){
            rover.setDirection(Direction.NORTH);
        }
        public void moveForward(Rover rover){
            rover.setX(rover.getX() - 1);
        }
    }, EAST('E'){
        public void turnLeft(Rover rover){
            rover.setDirection(Direction.NORTH);
        }
        public void turnRight(Rover rover){
            rover.setDirection(Direction.SOUTH);
        }
        public void moveForward(Rover rover){
            rover.setX(rover.getX() + 1);
        }
    };
    private final char value;

    Direction(char c) {this.value = c;}

    public char getValue() {
        return value;
    }
    public static Direction getDirection(char c){
        if (c == 'N'){
            return NORTH;
        } else if (c == 'S') {
            return SOUTH;
        } else if (c == 'W') {
            return WEST;
        } else if (c == 'E') {
            return EAST;
        }else {
            throw new IllegalArgumentException(c+" key is not representing one of the four cardinal direction!");
        }
    }

    public abstract void turnLeft(Rover rover);
    public abstract void turnRight(Rover rover);
    public abstract void moveForward(Rover rover);
}
