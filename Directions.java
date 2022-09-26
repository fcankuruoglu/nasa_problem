public enum Directions {
    NORTH('N'), SOUTH('S'), WEST('W'), EAST('E');
    private final char value;

    Directions(char c) {this.value = c;}

    public char getValue() {
        return value;
    }
    public static Directions getDirection(char c){
        if (c == 'N'){
            return NORTH;
        } else if (c == 'S') {
            return SOUTH;
        } else if (c == 'W') {
            return WEST;
        } else if (c == 'E') {
            return EAST;
        }else {
            throw new IllegalArgumentException();
        }
    }
}
