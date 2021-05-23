public class Tank {

    int x, y;
    int dir;
    int fuel = 100;
    public Tank(){
        this.fuel = fuel;
        this.x = 0;
        this.y = 0;
    }
    public Tank (int x, int y, int fuel){
        this.fuel = fuel;
        this.x = x;
        this.y = y;
    }
    public Tank (int x, int y){
        this.x = x;
        this.y = y;
    }
    public void goForward(int i) {
        if(i < 0){
            this.fuel *= -1;
            if(i < this.fuel) i = this.fuel;
            this.fuel += i;
        } else if(i > 0){
            if(i > this.fuel) i = this.fuel;
            this.fuel -= i;
        }
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
