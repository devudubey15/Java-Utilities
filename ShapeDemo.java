// Abstract Classes: Create an abstract class with abstract methods. 
// Implement this abstract class in multiple concrete classes.
// Create an array or list of the abstract class type and demonstrate late binding by 
// calling the abstract methods on different objects of implementing classes.

// 9)Define a class “Shape” with “draw()” function . Now derive  classes like “Circle”, “Polygon”,”Rectangle”
//  etc. from “Shape” and override “draw()” function. Define a class “ShapeDemo” in which  write  
//  main()  function. In the main function create a reference to Shape class referring to any of the sub class.
//   Using this reference, call “draw()” and check the result.

// both questions

abstract class Shape
{
    abstract void Area();//contract method
    abstract void Draw(); //contract method
} 
class Circle extends Shape
{
    void Draw()
    {
        System.out.println("drawing circle");//defining here
    }
    void Area()
    {
        System.out.println("area of circle");//defining here
    }
}
class Rectangle extends Shape
{
    void Draw()
    {
        System.out.println("drawing rectangle");//defining here
    }
    void Area()
    {
        System.out.println("area of rectangle");//defining here
    }
}
class Polygon extends Shape
{
    void Area()
    {
        System.out.println("area of polygon");//defining here
    }
    void Draw()
    {
        System.out.println("draw of polygon");//defining here
    }
    void fillColor()
    {
        System.out.println("fill color"); //new function
    }
}
public class ShapeDemo
{
    void perform(Shape shape)
    {
        shape.Draw();
        shape.Area();
        if(shape instanceof Polygon)
        {
            ((Polygon)shape).fillColor();
        }
    }
    public static void main(String args[])
    {
        ShapeDemo shape = new ShapeDemo();
        
        shape.perform(new Circle());
        shape.perform(new Rectangle());
        shape.perform(new Polygon());
    }
}