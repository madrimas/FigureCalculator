/**
 * Created by zapio on 06.03.2017.
 */
public class Circle extends Figure
    implements Print{
    double x;
    double y;
    double radius;
    Circle(double a, double b, double rad){
        x = a;
        y = b;
        radius = rad;
    }
    public double calculateArea(){
        double area;
        area = 2*3.14*radius*radius;
        return area;
    }
    public double calculatePerimeter(){
        double perimeter;
        perimeter = 2*3.14*radius;
        return perimeter;
    }
    @Override
    public void print() {
        System.out.println("Srodek okregu ma wspolrzedne: (" + x + ", " + y + ")");
        System.out.println("Promien okregu wynosi: " + radius);
        System.out.println("Pole okregu wynosi: " + calculateArea());
        System.out.println("Obwod okregu wynosi: " + calculatePerimeter());
    }
}
