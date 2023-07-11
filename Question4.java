package javamock2;

interface Drawable {
    void draw();
}

class Circle1 implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle1 implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class Question4 {
    public static void main(String[] args) {
        Drawable circle = new Circle1();
        Drawable rectangle = new Rectangle1();

        circle.draw(); // Output: Drawing a circle
        rectangle.draw(); // Output: Drawing a rectangle
    }
}
