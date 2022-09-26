import java.util.InputMismatchException;
import java.util.Scanner;

public class Plateau {
    int x;
    int y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Plateau(){
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter plateau's coordinates: ");
        int plateauX = scanner.nextInt();
        int plateauY = scanner.nextInt();
        // Checking plateau's top right coordinates. If coordinates are smaller than zero, throws exception.
        if (plateauX < 0 || plateauY < 0) throw new IllegalArgumentException("Top right's coordinates must be bigger than bottom left's coordinates( 0, 0 ).");

        setX(plateauX);
        setY(plateauY);

    }
}
