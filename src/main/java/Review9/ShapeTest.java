package Review9;

public class ShapeTest {
    public static void main(String[] args) {
       Triangle tr = new Triangle("triangle","purple",12,18);
       tr.print();
       System.out.println("The area of triangle is: "+tr.calculateArea());
       tr.printInfo();
       Rectangle rectangle = new Rectangle("rectangle","green",10,20);
       rectangle.printInfo();
       System.out.println("Area of rectangle is: "+rectangle.calculateArea());

        Shape shape = new Triangle("triangle","purple",12,18);
        shape.printInfo();
        System.out.println(shape.calculateArea());

        Shape[] arr = {new Triangle("triangle","pink",200,300),
                       new Rectangle("rectangle","blue",10,200),
                       new Rectangle("rectangle","brown",100,200)};
        for(Shape element:arr){
            element.printInfo();
            double area = element.calculateArea();
            System.out.println("the area of "+element.type+" = "+area);
        }
    }
}
