import java.util.Scanner;

public class Rover {
    int x;
    int y;
    Direction direction;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
    public Rover() {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter voyager's coordinates and direction(N-S-W-E): ");
        int roverX = scanner.nextInt();
        int roverY = scanner.nextInt();
        char voyagerDirection = scanner.next().toUpperCase().charAt(0);

        setX(roverX);
        setY(roverY);
        setDirection(Direction.getDirection(voyagerDirection));

    }
    public String getFinalPosition() {
        //System.out.println(this.getX() + " " +this.getY() + " " +this.getDirection().getValue());
        return (this.getX() + " " + this.getY() + " "+ this.getDirection().getValue());
    }
}
