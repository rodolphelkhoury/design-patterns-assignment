abstract class Shape {
    protected DrawingAPI drawingAPI;

    protected Shape(DrawingAPI drawingAPI) {
        this.drawingAPI = drawingAPI;
    }

    public abstract void draw();
}

interface DrawingAPI {
    void drawShape(String shape);
}

class Circle extends Shape {
    public Circle(DrawingAPI drawingAPI) {
        super(drawingAPI);
    }

    @Override
    public void draw() {
        drawingAPI.drawShape("Circle");
    }
}

class Rectangle extends Shape {
    public Rectangle(DrawingAPI drawingAPI) {
        super(drawingAPI);
    }

    @Override
    public void draw() {
        drawingAPI.drawShape("Rectangle");
    }
}

class DrawingAPI1 implements DrawingAPI {
    @Override
    public void drawShape(String shape) {
        System.out.println("DrawingAPI1: Drawing " + shape);
    }
}

class DrawingAPI2 implements DrawingAPI {
    @Override
    public void drawShape(String shape) {
        System.out.println("DrawingAPI2: Drawing " + shape);
    }
}

public class BridgePattern {
    public static void run() {
        Shape circle = new Circle(new DrawingAPI1());
        Shape rectangle = new Rectangle(new DrawingAPI2());

        circle.draw();
        rectangle.draw();
    }
}
