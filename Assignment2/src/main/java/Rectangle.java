/*
 * class Rectangle creates an object that resembles a rectangle. It holds two 
 * sides, can return the area of a rectangle, and displays basic information
 * about the created object with toString().
 * 
 * Constructor Rectangle() sets all mv's to 0
 * Overridden Rectangle(int, int) sets all mv's to parameters 
 * boolean isSquare() returns true if the object is a perfect square
 * float getArea() returns the length mv * width mv
 * Overridden String toString() displays information about the object
 */

/**
 *
 * @author Trevor Lastelick
 */
public class Rectangle 
{
    private int length;
    private int width;
    
    /**
     * This is the default constructor. It does not accept any parameters.
     * It initializes both mv's to 0;
     */
    Rectangle()
    {
        this.length = 0;
        this.width = 0;
    }//end constructor

    /**
     * Overridden constructor first validates parameters.
     * Then initializes both mv's. 
     * @param length First parameter (a measurement)
     * @param width Second parameter (a second measurement)
     * @return None 
     */
    Rectangle(int length, int width)
    {
        // validate length is greater than 0 or less than 1000
        if (length < 0 || length > 1000)
            throw new IllegalArgumentException("Length cannot be less than 0"
                    + "or greater than 1000\n");
        
        // validate width is greater than 0 or less than 1000
        if (width < 0 || width > 1000)
            throw new IllegalArgumentException("Width cannot be less than 0"
                    + "or greater than 1000\n");
        
        // initialize both mv's
        this.length = length;
        this.width = width;
    }
    
    /**
     * Returns true if length equals width, false otherwise.
     * @param None
     * @return true if length equals width
     * @return false if length does not equal width
     */
    public boolean isSquare()
    {
        if (this.length == this.width)
            return true;
        else 
            return false;
    }
    
    /**
     * Calculates the length mv multiplied by the width mv
     * @param None 
     * @return length mv multiplied by the width mv
     */
    public float getArea()
    {
        return length * width;
    }

    /**
     * prints the length, width, area of an object
     * prints a display telling whether the object is a perfect square or not 
     * @return A String.format of information about the object
     */
    public String toString()
    {
        return String.format("A new object defined %s%s%s%s%s%s%s%s%s\n%s",
                // print length mv
                "\nLength: ", this.length, "in",
                // print width mv
                "\nWidth: ", this.width, "in",
                // print getArea() 
                "\nArea: ", getArea(), "in",
        // prints a prompt telling whther the object is a perfect square or not
                // if isSquare() function true print display1 else print display2
                (this.isSquare()==true ? "This object is a square\n" //display1
                        : "This object is NOT a square\n")); //display2
    }
    
}// end class
