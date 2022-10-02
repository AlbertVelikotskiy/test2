public class Svetofor {
    public static void main(String[] args) {
        char chred = 'r';
        char chyellow = 'y';
        char chgreen = 'g';

        System.out.println(decode(chgreen));
    }

    public static String decode(char ch) {
        String result = "";
        switch (ch) {
            case 'r':
                result = "Stop!";
                break;
            case 'y':
            case 'm':
            case 'k':
                result = "Vnimanie!";
                break;
            case 'g':
                result = "Vpered";
                break;
            default:
                result = "I don`t know these symbols:(";
        }
        return result;
    }
}

