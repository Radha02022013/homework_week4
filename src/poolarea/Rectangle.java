package poolarea;

/**
 * 20. The Swimming Company has asked you to write an application that calculates the volume of cuboid
 * shaped pools.
 * 1. Write a class with the name Rectangle. The class needs two fields (instance variable) with name
 * width and length both of type double.
 * The class needs to have one constructor with parameters width and length both of type double and it
 * needs to initialize the fields.
 * In case the width parameter is less than 0 it needs to set the width field value to 0.
 * In case the length parameter is less than 0 it needs to set the length field value to 0.
 * Write the following methods (instance methods):
 * ●  Method named getWidth without any parameters, it needs to return the value of the width
 * field.
 * ●  Method named getLength without any parameters, it needs to return the value of the length
 * field.
 * ● Method named getArea without any parameters, it needs to return the calculated area
 * (width * length).
 */
public class Rectangle {
    //instance variable
    double width, length;

    //constructor with parameters
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    //method without parameter with return type
    public double getWidth() {
        if (width < 0) {
            return this.width = 0;
        } else {
            return this.width;
        }
    }

    //method without parameter with return type
    public double getLength() {
        if (length < 0) {
            return this.length = 0;
        } else {
            return this.length;
        }
    }

    ////method without parameter with return type
    public double getArea() {
        double area = (width * length);
        return area;
    }
}
