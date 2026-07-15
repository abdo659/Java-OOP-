package Task2;

public class main {
    public static void main(String[] args) {

        // Store them in an array of type Shape
        Shape[] shapes = {new Circle(), new Square(), new Triangle()};

        // Loop through the array and call draw() on each object
        for (Shape currentShape : shapes) {
            currentShape.draw();
        }
    }
}