package Cat.src;

public class Main {
    public static void main(String[] args) {
        Cat barsik = new Cat(3000, "Barsik", 1, "Grey");
        barsik.printParametr();
        Cat bigCat = new Cat(5500, "Murka", 2, "Black");
        bigCat.printParametr();
        Cat smallCat = new Cat(1000, "Kuzya", 1, "White");
        smallCat.printParametr();
        bigCat.setName("Pushok");
        System.out.println("The name of big cat is " + bigCat.getName());
        System.out.println("The name of small cat is" + smallCat.getName());

    }
}
