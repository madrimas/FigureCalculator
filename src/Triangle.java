import static java.lang.Math.sqrt;

/**
 * Created by zapio on 06.03.2017.
 */
public class Triangle extends Figure
        implements Print {
    double x;
    double y;
    double z;
    Triangle(double a, double b, double c){
        x = a;
        y = b;
        z = c;
    }
    public double calculateArea(){
        double area;
        double semiperimeter;
        semiperimeter = calculatePerimeter()/2;
        area = semiperimeter*(semiperimeter-x)*(semiperimeter-y)*(semiperimeter-z);
        area = sqrt(area);
        return area;
    }
    public double calculatePerimeter(){
        double perimeter;
        perimeter = x+y+z;
        return perimeter;
    }
    @Override
    public void print() {
        System.out.println("Boki trojkata wynosza: " + x + ", " + y + ", " + z);
        System.out.println("Pole trojkata wynosi: " + calculateArea());
        System.out.println("Obwod trojkata wynosi: " + calculatePerimeter());
    }
}

