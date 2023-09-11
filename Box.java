import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;



public class Box<T extends Fruit>  {

    // Коллекция для хранения фруктов (3c)
    ArrayList<T> fruits;


    public Box() {
        this.fruits = new ArrayList<>();
    }

    public Box(Collection<T> fruits) {
        this.fruits = new ArrayList<>(fruits);
    }

    public Box(T fruits) {
        this.fruits = new ArrayList<>(Arrays.asList(fruits));
    }

  
    /**
     * Получить вес всех фруктов, находящихся в коробке (3d)
     * @return - вес фруктов
     */
    public double getWeight() {
        if (fruits.isEmpty()) return 0;
        // Кол-во фруктов (кол-во элементов коллекции) * вес фрукта (можем взять с первого элемента)
        return fruits.size() * fruits.get(0).getWeight();
    }

    /**
     * Сравнить вес коробки, с коробкой, подаваемой на вход ввиде параметра (3e)
     * @param other - другая коробка
     * @return - результат сравнения веса коробок (погрешность 0.001)
     */
    public boolean compare(Box<?> other) {
        return Math.abs(getWeight() - other.getWeight()) < 0.001;
    }

    /**
     * Переместить все фрукты из другой коробки в текущую (3f)
     * @param other - другая коробка
     */
    public void replaceAll(Box<T> other) {
        other.getFruits().addAll(fruits);
        fruits.clear();
    }

    /**
     * Получить количество яблок в коробке
     * @return
     */
    public int sizeBox(){
        return fruits.size();
    }

    /**
     * Получить все фрукты в коробке (вспомогательный метод, 3f)
     * @return
     */
    public ArrayList<T> getFruits() {
        return fruits;
    }

    /**
     * Метод добавления фрукта в коробку (3g)
     * @param fruit - фрукт
     */
    public void add(T fruit) {
        fruits.add(fruit);
    }

}

