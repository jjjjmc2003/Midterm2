package MidTerm.Q2;

class Circle extends Shape {
    private double radius;

    public Circle(String color) {
        super(color);
    }

    //TODO: Constructor that takes color and radius
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    // TODO: Getter and overridden describeShape() method
    @Override
    public String describeShape() {
        return "\n Circle Time" + "\nRadius of Circle: " + radius + "\n Color of Circle: " + color;
    }


}