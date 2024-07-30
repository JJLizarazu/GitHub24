import java.util.*;
public class Figuras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle circle1 = new Circle(1);
        Rectangle rectangle1 = new Rectangle(3, 4);
        Square square1 = new Square(3);
        Triangle triangle1 = new Triangle(3,4);
        Diamond diamond1 = new Diamond(4, 6);
        Trapeze trapeze1 = new Trapeze(3, 3, 4);
        //
        resourcesShapes.aSeparators();
        System.out.println("   -> CÍRCULO <-");
        resourcesShapes.aSeparators();
        System.out.println(" | Área  : " + circle1.circleArea());
        System.out.println(" | Perímetro : " + circle1.circlePerimeter());
        //
        resourcesShapes.aSeparators();
        System.out.println("  -> RECTÁNGULO <-");
        resourcesShapes.aSeparators();
        System.out.println(" | Área : " + rectangle1.rectangleArea());
        System.out.println(" | Perímetro : " + rectangle1.rectanglePerimeter());
        //
        resourcesShapes.aSeparators();
        System.out.println("   -> CUADRADO <-");
        resourcesShapes.aSeparators();
        System.out.println(" | Área : " + square1.squareArea());
        System.out.println(" | Perímetro : " + square1.squarePerimeter());
        //
        resourcesShapes.aSeparators();
        System.out.println("   -> TRIÁNGULO <-");
        resourcesShapes.aSeparators();
        System.out.println(" | Área : " + triangle1.triangleArea());
        System.out.println(" | Perímetro : " + triangle1.trianglePerimeter());
        triangle1.typeTriangle();
        //
        resourcesShapes.aSeparators();
        System.out.println("   -> ROMBO <-");
        resourcesShapes.aSeparators();
        System.out.println(" | Área : " + diamond1.diamondArea());
        System.out.println(" | Perímetro : " + diamond1.diamondPerimeter());
        //
        resourcesShapes.aSeparators();
        System.out.println("   -> TRAPECIO <-");
        resourcesShapes.aSeparators();
        System.out.println(" | Área : " + trapeze1.trapezeArea());
        System.out.println(" | Perímetro : " + trapeze1.trapezePerimeter());
        //
        resourcesShapes.aSeparators();
    }
}

class Circle{
    int radius;
    Circle(int radiusCircle){
        this.radius = radiusCircle;
    }
    double circleArea(){
        return Math.PI * Math.pow(radius, 2);
    }
    double circlePerimeter(){
        return 2*Math.PI*radius;
    }
}

class Rectangle{
    int base, high;
    Rectangle(int baseRectangle, int highRectangle){
        this.base = baseRectangle;
        this.high = highRectangle;
    }

    double rectangleArea(){
        return base * high;
    }
    double rectanglePerimeter(){
        return (2 * base) + (2 * high);
    }
}

class Square{
    int lenght;
    Square(int lenghtSquare){
        this.lenght = lenghtSquare;
    }
    double squareArea(){
        return Math.pow(lenght, 2);
    }
    double squarePerimeter(){
        return lenght * 4;
    }
}

class Triangle{
    int base, high;
    Triangle(int baseTriangle, int highTriangle){
        this.base = baseTriangle;
        this.high = highTriangle;
    }
    double triangleArea(){
        return (double) (base * high) / 2;
    }
    double trianglePerimeter(){
        return base + high + hypotenuse();
    }
    double hypotenuse(){
        return Math.sqrt(Math.pow(base, 2) + Math.pow(high, 2));
    }
    void typeTriangle(){
        if((base == high) && (high == hypotenuse()) && (base == high)){
            resourcesShapes.aSeparators();
            System.out.println(" | TRIÁNGULO EQUILÁTERO");
        } else if (base != high && high != hypotenuse() && base != hypotenuse()){
            resourcesShapes.aSeparators();
            System.out.println(" | TRIÁNGULO ESCALENO");
        } else {
            resourcesShapes.aSeparators();
            System.out.println(" | TRIÁNGULO ISÓCELES");
        }
    }
}

class Diamond{
    int minorDiagonal, majorDiagonal;
    Diamond(int minorDiagonal, int majorDiagonal){
        this.minorDiagonal = minorDiagonal;
        this.majorDiagonal = majorDiagonal;
    }
    double diamondArea(){
        return (double) (minorDiagonal * majorDiagonal) / 2;
    }
    double diamondPerimeter(){
        return (double) ((minorDiagonal * 2) + (majorDiagonal * 2));
    }
}

class Trapeze{
    int majorBase, minorBase, high;
    Trapeze(int majorBase, int minorBase, int high){
        this.majorBase = majorBase;
        this.minorBase = minorBase;
        this.high = high;
    }
    double trapezeArea(){
        return (double)((majorBase + minorBase) * high) / 2;
    }
    double trapezePerimeter(){
        return (double)(minorBase + majorBase) + (2 * lengthTrapeze());
    }
    double lengthTrapeze(){
        return (Math.sqrt( (Math.pow(high, 2)) + (Math.pow((double) (majorBase - minorBase) / 2, 2))));
    }
}
class resourcesShapes{
    public static void aSeparators(){
        System.out.println("=====================");
    }
}
