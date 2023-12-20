package interfejsy.zad14;

public class TestDrawable {

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.display();
        c1.draw();
        System.out.println(Drawable.getType());
    }
}
