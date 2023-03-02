import java.util.Random;

public class MagicBox<T> {
    private int limit;
    private T[] items;

    public MagicBox(int limit) {
        this.limit = limit;
        items = (T[]) new Object[limit];
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                System.out.println("Элемент добавлен в коробку");
                return true;
            }
        }
        System.out.println("Полна коробочка, больше некуда");
        return false;
    }

    public T pick() throws RuntimeException {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                throw new RuntimeException("В коробке осталось ещё немножко места: " + (limit - i));
            }
        }
        Random random = new Random();
        int randomInt = random.nextInt(limit);
        System.out.println(items[randomInt]);
        return items[randomInt];
    }

}