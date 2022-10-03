public class Main {
    public static void main(String[] args) {

       Tank justTank = new Tank(0, 0, 100);
       Tank anywareTank = new Tank(10, 10, 100);
       Tank customTank = new Tank (20, 30, 200);
       justTank.goForward(200);
       justTank.printPosition();
       anywareTank.goBackward(-200);
       anywareTank.printPosition();
       customTank.goForward(201);
       customTank.printPosition();
    }

    public void printPosition(){
        System.out.println("the tank is at");
    }
}
hgmghmghm