public class StrBuild {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            sb.reverse();
        }
        System.out.println((System.currentTimeMillis() - startTime));
    }
}
