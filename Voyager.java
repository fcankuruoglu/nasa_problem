import java.util.Scanner;

public class Voyager {
    int x;
    int y;
    Directions direction;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Directions getDirection() {
        return direction;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setDirection(Directions direction) {
        this.direction = direction;
    }
    public Voyager() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter voyager's coordinates and direction(N-S-W-E): ");
        int voyagerX = scanner.nextInt();
        setX(voyagerX);
        int voyagerY = scanner.nextInt();
        setY(voyagerY);
        char voyagerDirection = scanner.next().toUpperCase().charAt(0);
        setDirection(Directions.getDirection(voyagerDirection));

        System.out.println("voyagerX: "+getX() + " voyagerY: "+getY() +" voyagerDirection: "+getDirection().getValue());
    }
}
