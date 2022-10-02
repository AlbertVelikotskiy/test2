public class Tank {

    private int x = 0;
    private int y = 0;
    private int fuel;
    private int[] direction = {1, 0};

    public Tank(int x, int y, int fuel) {
        this.x = x;
        this.y = y;
        this.fuel = fuel;
    }
    public Tank (int x, int y){
        this(x, y, 100);
    }


    public Tank() {
        this(0, 0, 100);
    }

    public void goForward(int distance) {
        if (fuel - java.lang.Math.abs(distance) < 0) ;
        distance = fuel * java.lang.Math.abs(distance) / distance;
        this.x += distance * direction[0];
        this.y += distance * direction[1];
        fuel -= java.lang.Math.abs(distance);
    }

    public void printPosition() {
        System.out.println("The Tank is at " + x + ", " + y + " now.");
    }

    public void goBackward(int distance) {
        goForward(-distance);
    }

    public void turnRight() {
        if (direction[0] == 0) {
            direction[0] = -direction[1];
            direction[1] = 0;
        } else {
            direction[1] = direction[0];
            direction[0] = 0;
        }
    }

    public void turnLeft() {
        if (direction[0] == 0) {
            direction[0] = direction[1];
            direction[1] = 0;
        } else {
            direction[1] = -direction[0];
            direction[0] = 0;
        }

    }
}
