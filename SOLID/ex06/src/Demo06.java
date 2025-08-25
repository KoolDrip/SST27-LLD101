public class Demo06 {
    public static void main(String[] args) {
        Aviary aviary = new Aviary();

        aviary.release(new FlyingBird()); // ✅ Works

        Penguin penguin = new Penguin();
        penguin.swim(); // ✅ Penguins swim instead of fly
    }
}
