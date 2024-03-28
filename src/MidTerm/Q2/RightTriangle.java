package MidTerm.Q2;


//TODO SIMILAR IMPLEMENTATION AS TRIANGLE but inherits from Triangle
public class RightTriangle extends Triangle {


    public RightTriangle(String color, double base, double height) {
        super(color, base, height);
    }

    @Override
    public String describeShape() {
        return "\nRight Triangle Moment!!!" + "\nColor:" + color + "\nBase: " + base + "\nHeight: " + height;
    }

}