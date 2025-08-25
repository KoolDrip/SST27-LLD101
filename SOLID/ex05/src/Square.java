public class Square implements Shape {
    private int side;

    public void setSide(int s) { this.side = s; }

    @Override
    public int area() { return side * side; }
}
