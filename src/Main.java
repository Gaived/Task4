public class Main {
    public static void main(String[] args) {
        MagicBox<String> box1 = new MagicBox<>(4);
        MagicBox<Integer> box2 = new MagicBox<>(2);

        box2.add(1);
        box2.add(2);
        box2.pick();

        box1.add("Один");
        box1.add("Два");
        box1.pick();
        box1.add("Три");
        box1.add("Четыре");
        //box1.pick();
        box1.add("Пять");

    }
}