public class Program {
    
    public static void main(String[] args) {

        Box<Apple> box1 = new Box<>();
        for (int i = 0; i < 15; i++) {
            box1.add(new Apple());
        }
        System.out.println("Кол-во яблок: " + box1.sizeBox() + " | вес коробки с яблоками: " + box1.getWeight());

        Box<Apple> box2 = new Box<>();
        for (int i = 0; i < 10; i++) {
            box2.add(new Apple());
        }
        System.out.println("Кол-во яблок: " + box1.getWeight() + " | вес коробки с яблоками: " +  box2.getWeight());

        Box<Orange> box3 = new Box<>();
        for (int i = 0; i < 5; i++) {
            box3.add(new Orange());
        }
        System.out.println("Кол-во апельсинов: " + box3.sizeBox() + " | вес коробки с апельсинами: " + box3.getWeight());


        Box<Orange> box4 = new Box<>();
        for (int i = 0; i < 5; i++) {
            box4.add(new Orange());
        }
        System.out.println("Кол-во апельсинов: " + box4.getWeight() + " | вес коробки с апельсинами: " +  box4.getWeight());

        System.out.println(box1.compare(box1)); // Сравнили коробки

        box2.replaceAll(box1); // Пересыпали яблоки
        //boxApple1.sprinkle(boxOrange1); // Пересыпать апельсины в яблоки нельзя
        System.out.println(box1.sizeBox());
        System.out.println(box2.sizeBox());
    }
}
