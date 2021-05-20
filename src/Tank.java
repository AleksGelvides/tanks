public class Tank {

    int x, y;
    int dir;

    public void goForward(int i) {
        if (dir == 0) x += i;
        else if (dir == 1) y += i;
        else if (dir == 2) x -= i;
        else y -= i;
    }
    public void goBackward(int i) {
        goForward(-i);
    }

    public void printPosition() {
        System.out.println("The Tank is at " + x +", " + y + " now.");
    }

    public void turnLeft() {
        dir--;
        if (dir == -1) dir = 3;
    }

    public void turnRight() {
        dir++;
        if (dir == 4) dir = 0;
    }
}
