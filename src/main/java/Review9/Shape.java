package Review9;
interface Drawable{
    boolean DRAW=true;
    void drawing();
}

public abstract class Shape {//____________SHAPE CLASS
   public String type;
   protected String color;

    Shape(String type,String color){
        this.type=type;
        this.color=color;
    }
   public void printInfo(){
        System.out.println("We build "+color+" "+type);
    }
   public abstract double calculateArea();
}
class Triangle extends Shape{//_________________TRIANGLE CLASS
    int base;
    int height;
    Triangle(String type,String color,int base,int height){
        super(type,color);
        this.base=base;
        this.height=height;
    }
    public double calculateArea(){
        return (base*height)/2;
    }
    public void print(){
        System.out.println(type +" has dimension as "+base+" "+height);
    }
}
     class Rectangle extends Shape{//_________________________RECTANGLE CLASS
        double length;
        double width;
        Rectangle(String type,String color,double length,double width){
        super(type,color);
        this.length=length;
        this.width=width;
        }
        public double calculateArea(){
            return length*width;
        }
}





