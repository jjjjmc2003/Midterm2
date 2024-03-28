package MidTerm.Q2;

public class Shape {
    public String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String describeShape() {
        return "Shape's color: " + color;
    }
}