public class Tank {
    int position = 0;
    int turn = 0;

    public Tank() {
        this.position = position;
        this.turn = turn;
    }
    public void goForward(int forward) {
        this.position += forward;
    }

    public void goBackward(int backward) {
        this.position -= backward;
    }

    public void printPosition() {
        if (turn != 0) {
            System.out.println("The Tank is at " + position + ", " + turn + " now.");
        } else System.out.println("The Tank is at " + turn + ", " + position + " now.");
    }
    public void turnRight(){
            position = 0;

    }
}
