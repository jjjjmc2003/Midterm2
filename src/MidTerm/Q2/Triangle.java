package MidTerm.Q2;


class Triangle extends Shape {
    public double base;
    public double height;

    public Triangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String describeShape() {
        return "\nTriangle Time!!!!" + "\nColor: " + getColor() + " \nBase: " + base + " \nHeight: " + height;
    }
}