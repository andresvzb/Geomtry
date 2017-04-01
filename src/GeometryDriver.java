///////////////////////////////////////////////////////////////////////////////
//                   
// Title:            GeomtricDriver
// Files:            GeometricDriver.java
// Semester:         COP2250 Spring 2017
//
// Author:           5766946
// Instructor’ Name: Charters
// Lab Section:      UO1
// Description of Pgm: Use switch statement in place of if then statements. 
// 
//
//////////////////// PAIR PROGRAMMERS COMPLETE THIS SECTION ////////////////////
//                   PAIR-PROGRAMMING IS ALLOWED ONLY for Labs 
//
// Pair Partner:     (id# of your pair programming partner)
//
//////////////////////////// 80 columns wide/////////////////////////////////
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matt
 */
public class GeometryDriver 
{

    
    public static void main(String[] args) 
    {
        //In main, define local variables to hold the following data:
        // 1.)  userChoice (from a menu of options, 1 = Circle Perimeter;  2 = Rectangle Perimeter;  3 = Triangle Perimeter
        // 2.)  radius
        // 3.)  side1, side2, and side3
        // 4.)  length, width
        // 5.)  perimeter 
        // 6.)  keyboard (a Scanner object)
        double radius, side1, side2, side3, length, width, perimeter;
        
      
        
        Scanner keyboard = new Scanner(System.in);
        int option;
        
        //Display the following menu
        
        System.out.println("Welcome to the Geometry Calculator!\n"
                + "In this program we will use a menu to decide what kind of shape we will create.\n"
                + "\n1.Create and Calculate Perimeter of a Circle"
                + "\n2. Create and Calculate Perimeter of a Rectangle"
                + "\n3. Create and Calculate Perimeter of a Triangle");
        
        
        //Use a switch statement to determine the option that the user selected.
        //Depending on the option that the user selected, ask the user for the appropriate information needed to create the 
        //a specific geometric object.  Then, call the getPerimeter() method to calculate the perimeter for the geometric object created.
        //Print the object created and its perimeter.
        
        
        option = keyboard.nextInt();
        
        switch (option)
        {
            case 1:
                System.out.println("What is the radius of your circle? ");
                radius = keyboard.nextDouble();
                GeometricShape circle = new GeometricShape(radius);
                System.out.println(circle);
                System.out.println("Perimeter: " + circle.getPerimeter());
                //ask user for the radius
                //create a GeometricShape with the radius
                //put logic here to call the perimeter method
                break;
            case 2:
                System.out.println("What is the length of your retangle? ");
                length = keyboard.nextDouble();
                System.out.println("What is the width of your Rectangle? ");
                width = keyboard.nextDouble();
                
                GeometricShape aRectangle = new GeometricShape (length, width);
                System.out.println(aRectangle + "\nthe perimeter of the shape is " + 
                        aRectangle.getPerimeter());
                //ask user for the length and width
                //create a GeometricShape with the length and width
                 //put logic here to call the perimeter method
                break;
            case 3:
                System.out.println("What is the length of your first side? ");
                side1 = keyboard.nextDouble();
                System.out.println("What is the lenght of your second side? ");
                side2 = keyboard.nextDouble();
                System.out.println("What is the lenght of your third side ");
                side3 = keyboard.nextDouble();
                
                GeometricShape aCircle = new GeometricShape (side1, side2, side3);
                System.out.println(aCircle + "\nthe perimeter of the the shaoe is "
                        + aCircle.getPerimeter());
                //ask user for side1, side2, and side3
                //create a GeometricShape with the the 3 sides
                 //put logic here to call the perimeter method
                break;
            default:
                System.out.println("That option is not valid");
                //Give message to user that option is not valid.
        }
        //Print the geometric shape and its perimeter
          
    }

}
