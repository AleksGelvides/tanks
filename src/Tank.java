public class Tank {
    int position = 0;
    public Tank(){
        this.position = position;
    }
    public void goForward (int forward){
        this.position += forward;
    }
    public void goBackward(int backward){
        this.position -= backward;
    }
    public void printPosition (){
        System.out.println("The tank is at " + this.position + " now.");
    }
}
