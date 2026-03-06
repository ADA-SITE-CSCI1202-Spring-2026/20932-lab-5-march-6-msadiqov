public class TestMovable {
    public static void main(String[] args) {

        Point p = new Point(3,4);
        p.moveUp();
        p.moveRight();
        System.out.println(p);

        Circle c = new Circle(new Point(5,5), 10);
        c.moveLeft();
        c.moveDown();
        System.out.println(c);
    }
}