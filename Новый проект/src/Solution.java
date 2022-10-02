import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(br.readLine());
        double height = Double.parseDouble(br.readLine());
        Body.masslndex(weight,height);
    }
    public static class Body{
        public static void masslndex(double weight, double height) {
            double masslndex = weight/(height*height);
            if (masslndex < 18.5){
                System.out.println("Недовес! поднажми на питание");
            }
            if (masslndex >= 18.5 && masslndex <= 24.9){
                System.out.println("Нормальный индекс! Так держать");
            }
            if (masslndex >= 25 && masslndex <= 29){
                System.out.println("Ну ты и жиробас");
            }
            if (masslndex >= 30){
                System.out.println("Ну нельзя же так, зашей рот");
            }
        }
    }
}
