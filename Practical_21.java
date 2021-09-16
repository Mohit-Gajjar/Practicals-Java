// Describe abstract class called Shape which has three subclasses say Triangle, Rectangle, Circle. Define one method area()in the abstract class and override this area() in these three subclasses to calculate for specific object i.e. area() of Triangle subclass should calculate area of triangle etc. Same for Rectangle and Circle
abstract class Shape {
    void area() {
    };
}

class Rectangle extends Shape {
    void area(int l, int b) {
        System.out.println("Area of Rectangle is " + l * b);
    }
}

class Triangle extends Shape {
    void area(int l, int b) {
        System.out.println("Area of Rectangle is " + (l * b) / 2);
    }
}

class Circle extends Shape {
    final float pie = 3.14f;

    void area(int radius) {
        System.out.println("Area of Circle is " + pie * radius * radius);
    }
}

class Practical_21 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.area(2, 3);
        Triangle triangle = new Triangle();
        triangle.area(2, 3);
        Circle circle = new Circle();
        circle.area(3);
    }
}
