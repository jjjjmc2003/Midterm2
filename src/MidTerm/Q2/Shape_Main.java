package MidTerm.Q2;


public class Shape_Main {
    public static void main(String[] args) {
        // Creating instances of shapes

        //TOOD: UNCOMMENT BELOW

        Shape s = new Shape("Blue");
        Circle c = new Circle("Red", 5);
        Triangle t = new Triangle("Green", 10, 20);
        RightTriangle rt = new RightTriangle("White", 10, 15);

        // Printing descriptions
        System.out.println(s.describeShape());
        System.out.println(c.describeShape());
        System.out.println(t.describeShape());
        System.out.println(rt.describeShape());

        System.out.println("Did you uncomment the code above?");
        System.out.println("I sure did Professor, figured I'd make it easier on the eyes with the paragraph spacing");
    }
}