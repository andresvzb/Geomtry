///////////////////////////////////////////////////////////////////////////////
//                   
// Title:            GeomtricShape
// Files:            GeometricShape.java
// Semester:         COP2250 Spring 2017
//
// Author:           5766946
// Instructor’ Name: Charters
// Lab Section:      UO1
// Description of Pgm: Setters and Getters for Geometric driver.
// 
//
//////////////////// PAIR PROGRAMMERS COMPLETE THIS SECTION ////////////////////
//                   PAIR-PROGRAMMING IS ALLOWED ONLY for Labs 
//
// Pair Partner:     (id# of your pair programming partner)
//
//////////////////////////// 80 columns wide/////////////////////////////////
public class GeometricShape 
{
    private double side1, side2, side3; //These are the variables necessary to calculat the perimeter of a triangle
    private double radius; //Radius is needed to calculate the perimeter of a circle
    private double length, width; //Length and Width are needed to calculate the perimeter of a rectangle
    private boolean triangle = false;
    private boolean rectangle = false;
    private boolean circle = false;
    
    //Constructor for a triangle
    public GeometricShape(double aSide1, double aSide2, double aSide3)
    {
        side1 = aSide1;
        side2 = aSide2;
        side3 = aSide3;
        triangle = true;
    }
    
    //Constructor for a rectangle
    public GeometricShape(double aLength, double aWidth)
    {
        length = aLength;
        width = aWidth;
        rectangle = true;
    }
    
    //Constructor for a circle
    public GeometricShape(double aRadius)
    {
        radius = aRadius;
        circle = true;
    }
    
    public double getRadius()
    {
        return radius;
    }
    
    public double getSide1()
    {
        return side1;
    }
    
    public double getSide2()
    {
        return side2;
    }
    
    public double getSide3()
    {
        return side3;
    }
    
    public double getLength()
    {
        return length;
    }
    
    public double getWidth()
    {
        return width;
    }
    
    public void setRadius(double aRadius)
    {
        radius = aRadius;
    }
    
    public void setSide1(double aSide1)
    {
        side1 = aSide1;
    }
     
    public void setSide2(double aSide2)
    {
        side2 = aSide2;
    }
      
    public void setSide3(double aSide3)
    {
        side3 = aSide3;
    }
       
    public void setLength(double aLength)
    {
        length = aLength;
    }
        
    public void setWidth(double aWidth)
    {
        width = aWidth;
    }
    
    public double getPerimeter()
    {
        //Calculate the perimeter of the Geometric object depending on what the object is.
        //Remember the following formulas:
        //Perimeter of a Triangle = Side1 + Side2+ Side3
        //Perimeter of a Rectangle = (2 * length)  + (2 * width)
        //Perimeter of a Circle = 2 * Math.PI * radius
        
        if (triangle == true)
        {
         return side1 + side2 + side3;  
        }
//complete formula  
        else if(rectangle == true) 
        {
         return (2 * length) + (2 * width);      
        }
        else if(circle == true)
        {
         return 2 * Math.PI * radius;
        }
        else        
        {
          return 0;  
        }
        //Continue with the rest of the else if logic here.
        
       //change return statement to match the perimeter of the shape 
       
               
    }

    
    
    
    public String toString()
    {
        if(triangle == true)
        {
            return "The triangle's dimensions are: " + "side 1 " + side1 + "side 2"
                    + side2 + "side 3 " + side3;
        }
        else if(rectangle == true)
        {
            return "The rectangle's dimensions are: " + "Length " + length + "\nWidth " 
                    + width;
        }
        else if (circle == true)
        {
            return "The circles dimensions are " + circle;
        }
        
        
        return " ";
        
//return the content of the Geometric object, depending on what the Geometric object is...
    }
     
}
