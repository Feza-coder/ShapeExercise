// Define the Shape class
class Shape {
    // Instance variables
    private String shapeName;
    private int numberOfEdges;

    // Basic constructor with no params
    public Shape() {
        this.shapeName = "Undefined shape";
        System.out.println("Shape object created with no params.");
    }

    // Overloaded constructor for Circle (takes radius)
    public Shape(double radius) {
        this.shapeName = "Circle";
        this.numberOfEdges = 0; // Circle has no edges
        System.out.println("Shape object created for a Circle.");
    }

    // Overloaded constructor for Square (takes edges and edgeLength)
    public Shape(int edges, double edgeLength) {
        this.shapeName = "Square";
        this.numberOfEdges = edges;
        System.out.println("Shape object created for a Square.");
    }

    // Overloaded constructor for Rectangle (takes edges and 2 edge lengths)
    public Shape(int edges, double e1, double e2) {
        this.shapeName = "Rectangle";
        this.numberOfEdges = edges;
        System.out.println("Shape object created for a Rectangle.");
    }

    // Overloaded constructor for Triangle (takes edges and 3 edge lengths)
    public Shape(int edges, double e1, double e2, double e3) {
        this.shapeName = "Triangle";
        this.numberOfEdges = edges;
        System.out.println("Shape object created for a Triangle.");
    }

    // Method to return shape details
    public String getShapeDetails() {
        return "Shape: " + shapeName + ", Number of edges: " + numberOfEdges;
    }
}

// Define the testing class
public class TestShape {
    public static void main(String[] args) {
        // Creating Shape objects using different constructors
        Shape undefinedShape = new Shape();
        Shape circle = new Shape(5.0); // radius
        Shape square = new Shape(4, 2.5); // edges, edgeLength
        Shape rectangle = new Shape(4, 2.0, 3.0); // edges, e1, e2
        Shape triangle = new Shape(3, 3.0, 4.0, 5.0); // edges, e1, e2, e3

        // Invoking getShapeDetails() and assigning to String variables
        String undefinedShapeDetails = undefinedShape.getShapeDetails();
        String circleDetails = circle.getShapeDetails();
        String squareDetails = square.getShapeDetails();
        String rectangleDetails = rectangle.getShapeDetails();
        String triangleDetails = triangle.getShapeDetails();

        // Printing the details to the console
        System.out.println(undefinedShapeDetails);
        System.out.println(circleDetails);
        System.out.println(squareDetails);
        System.out.println(rectangleDetails);
        System.out.println(triangleDetails);
    }
}
