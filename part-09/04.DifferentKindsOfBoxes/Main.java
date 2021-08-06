public class Main {

    public static void main(String[] args) {
        // You can test your program here
        BoxWithMaxWeight coffeeBox = new BoxWithMaxWeight(10);
        coffeeBox.add(new Item("Saludo", 5));
        coffeeBox.add(new Item("Pirkka", 5));
        coffeeBox.add(new Item("Kopi Luwak", 5));

        System.out.println(coffeeBox.isInBox(new Item("Saludo")));
        System.out.println(coffeeBox.isInBox(new Item("Pirkka")));
        System.out.println(coffeeBox.isInBox(new Item("Kopi Luwak")));

        System.out.println("---");

        OneItemBox box = new OneItemBox();
        box.add(new Item("Saludo", 5));
        box.add(new Item("Pirkka", 5));

        System.out.println(box.isInBox(new Item("Saludo")));
        System.out.println(box.isInBox(new Item("Pirkka")));

        System.out.println("---");

        MisplacingBox missBox = new MisplacingBox();
        missBox.add(new Item("Saludo", 5));
        missBox.add(new Item("Pirkka", 5));

        System.out.println(missBox.isInBox(new Item("Saludo")));
        System.out.println(missBox.isInBox(new Item("Pirkka")));
    }
}

