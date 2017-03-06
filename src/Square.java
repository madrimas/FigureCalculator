/**
 * Created by zapio on 06.03.2017.
 */
public class Square extends Figure
    implements Print{
    double x;
    Square(double a){
        x = a;
    }
    public double calculateArea(){
        double area;
        area = x*x;
        return area;
    }
    public double calculatePerimeter(){
        double perimeter;
        perimeter = 4*x;
        return perimeter;
    }
    @Override
    public void print() {
        System.out.println("Bok kwadratu wynosi: " + x);
        System.out.println("Pole kwadratu wynosi: " + calculateArea());
        System.out.println("Obwod kwadratu wynosi: " + calculatePerimeter());
    }
}
