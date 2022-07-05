/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Trevor Lastelick
 */
public class RectangleTest {
    public static void main(String[] args) {
        
        // create a perfect-square of Rectangle
        Rectangle square = new Rectangle(10,10);
        // display information of square object
        System.out.printf("%s\n", square);
        
        // create second Rectangle object
        Rectangle den = new Rectangle(47,100);
        // display information of den object
        System.out.println(den);
        
        // create third Rectangle object
        Rectangle kitchen = new Rectangle(20, 50);
        // display information of kitchen object
        System.out.print(kitchen);
        
    }// end main
}// end class
