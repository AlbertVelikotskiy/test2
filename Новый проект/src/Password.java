import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vvedite imiy poilsovatelia");
        String name = sc.nextLine();
        System.out.println("Sozdajte parol`");
        String PW = sc.nextLine();
        if (PW.length()<8||PW.length()>15){
            do {
                System.out.println("Dlina paroliy dpljna sostavliyt` ot 8 do 15 simvolov");
                PW = sc.nextLine();
            }while (PW.length()<8||PW.length()>15);
            }
        System.out.printf("%s, Vash novij parol: %s", name, PW);
        }

    }
