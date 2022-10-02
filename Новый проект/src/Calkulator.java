import java.util.Scanner;
public class Calkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Vibirite punkt");
            System.out.println("1.Slojenie");
            System.out.println("2.Vichetanie");
            System.out.println("3.Umnojenie");
            System.out.println("4.Delenie");
            System.out.println("5.Exit");
            int operand = (char) scanner.nextInt();
            int result;
            if (operand == 5) {
                break;
            } else if (operand == 1) {
                System.out.println("Vvedite celoe chislo");
                int a = scanner.nextInt();
                System.out.println("Vvedite vtoroe celoe chislo");
                int b = scanner.nextInt();
                System.out.println("a : " + a);
                System.out.println("b : " + b);
                result = a + b;
                System.out.println("Otvet : " + result);
            } else if (operand == 2) {
                System.out.println("Vvedite celoe chislo");
                int a = scanner.nextInt();
                System.out.println("Vvedite vtoroe celoe chislo");
                int b = scanner.nextInt();
                System.out.println("a : " + a);
                System.out.println("b : " + b);
                result = a - b;
                System.out.println("Otvet :" + result);
            } else if (operand == 3) {
                System.out.println("Vvedite celoe chislo");
                int a = scanner.nextInt();
                System.out.println("Vvedite vtoroe celoe xhislo");
                int b = scanner.nextInt();
                System.out.println("a : " + a);
                System.out.println("b : " + b);
                result = a * b;
                System.out.println("Otvet : " + result);
            } else if (operand == 4) {
                System.out.println("Vvedite celoe chislo");
                int a = scanner.nextInt();
                System.out.println("Vvedite vtoroe celoe chislo");
                int b = scanner.nextInt();
                System.out.println("a : " + a);
                System.out.println("b : " + b);
                result = a / b;
                System.out.println("Otvet : " + result);
            } else {
                System.out.println("Oshibka");
            }
        }
        System.out.println("Programma zavershena");
    }
}