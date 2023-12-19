abstract class Shape{
    abstract void numberOfSides();
}

class Rectangle extends Shape{
       void numberOfSides(){
           System.out.println("Rectangle have 4 sides");
       }
}

class Triangle extends Shape{
       void numberOfSides(){
           System.out.println("Triangle have 3 sides");
       }
}

class Hexagon extends Shape{
       void numberOfSides(){
           System.out.println("Hexagon have 6 sides");
       }
}

public class polymorphism{
    public static void main(String[] args){
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();
        Shape hexagon = new Hexagon();
        
        rectangle.numberOfSides();
        triangle.numberOfSides();
        hexagon.numberOfSides();
    }
}

