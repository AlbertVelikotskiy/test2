public class test {
    public static void main(String[] args) {
        final Cat bigCat = new Cat(5500, "Murka", 2, "Black");
        Cat smallCat = new Cat(1000, "Kuzya", 1, "White");
        bigCat.setName("Kuzya");
        bigCat = new Cat(500, "Garfild", 3, "White");
        bigCat=smallCat;
    }
}
