ackage chapter6classesandobjects;

/**
 *
 * @author Tutor
 */
public class Rectangle {

// Privates fields can be accesses from within the class
    private double length;
    private double width;

    /**
     * setLength method stores a value in the length field.
     *
     * @param len The value to store in length
     */
    
    /** Contructor 
     * 
     * @param len the length of the rec
     * @param w  the width of the rec
     */
    
    
    
    

    public Rectangle(double len, double w) {
        length= len;
        width =w;
    
    }

    public void setLength(double len) {
        length = len;
    }

    /**
     * setwidth method stores a value in the width field.
     *
     * @param len The value to store in length
     */
    public void setWidth(double w) {
        width = w;
    }

    public double getLength() {

        //size=box.setLength();
        return length;
    }

    public double getWidth() {

        // size=box.setWidth();
        return width;
    }

    public double getArea() {

        return length * width;
    }

}
