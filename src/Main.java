import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Created by zapio on 06.03.2017.
 */

public class Main {
    public static void main(String[] args) throws IncorrectDataException {
        boolean end = false;
        int choice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witaj w Kalkulatorze!");
        while(!end){
            System.out.println("Wybierz figure:");
            System.out.println("1. Kolo");
            System.out.println("2. Kwadrat");
            System.out.println("3. Trojkat");
            System.out.print("Podaj cyfre: ");
            choice = scanner.nextInt();
            switch(choice){
                case 1:
                    double crd1, crd2, r;
                    System.out.println("Wybrales kolo!");
                    System.out.print("Podaj pierwsza wspolrzedna srodka okregu: ");
                    try {
                        crd1 = scanner.nextDouble();
                    } catch (InputMismatchException e){
                        crd1 = errorHandling(scanner);
                    }
                    System.out.print("Podaj druga wspolrzedna srodka okregu: ");
                    try {
                        crd2 = scanner.nextDouble();
                    } catch (InputMismatchException e){
                        crd2 = errorHandling(scanner);
                    }
                    System.out.print("Podaj dlugosc promienia okregu: ");
                    try {
                        r = scanner.nextDouble();
                    } catch (InputMismatchException e){
                        r = errorHandling(scanner);
                    }
                    if( r > 0 ){
                        Circle circle = new Circle(crd1, crd2, r);
                        circle.print();
                    }
                    else {
                        throw new IncorrectDataException("Nie stworzono obiektu! Promien okregu musi byc wiekszy od 0");
                    }
                    break;
                case 2:
                    double a;
                    System.out.println("Wybrales kwadrat!");
                    System.out.print("Podaj dlugosc boku kwadratu: ");
                    try {
                        a = scanner.nextDouble();
                    } catch (InputMismatchException e){
                        a = errorHandling(scanner);
                    }
                    if( a > 0 ) {
                        Square square = new Square(a);
                        square.print();
                    }
                    else{
                        throw new IncorrectDataException("Nie stworzono obiektu! Bok kwadratu musi byc wiekszy od 0");
                    }
                    break;
                case 3:
                    double x, y, z;
                    System.out.println("Wybrales trojkat!");
                    System.out.print("Podaj dlugosc pierwszego boku trojkata: ");
                    try {
                        x = scanner.nextDouble();
                    } catch (InputMismatchException e){
                        x = errorHandling(scanner);
                    }
                    System.out.print("Podaj dlugosc drugiego boku trojkata: ");
                    try {
                        y = scanner.nextDouble();
                    } catch (InputMismatchException e){
                        y = errorHandling(scanner);
                    }
                    System.out.print("Podaj dlugosc trzeciego boku trojkata: ");
                    try {
                        z = scanner.nextDouble();
                    } catch (InputMismatchException e){
                        z = errorHandling(scanner);
                    }
                    if( (x > 0) && (y > 0) && (z > 0) ){
                        if( ( (x + y ) > z) && ( (x + z ) > y) && ( (y + z ) > x) ){
                            Triangle triangle = new Triangle(x, y, z);
                            triangle.print();
                        }
                        else{
                            throw new IncorrectDataException("Nie stworzono obiektu! Suma dwoch bokow musi byc wieksza od trzeciego boku");
                        }
                    }
                    else{
                        throw new IncorrectDataException("Nie stworzono obiektu! Boki trojkata musza byc wieksze od 0");
                    }
                    break;
                default:
                    System.out.println("Podano liczbe ze zlego zakresu!");
                    break;
            }
            System.out.println("Czy chcesz wyjsc z programu?");
            System.out.println("0 - NIE, 1 - TAK");
            choice = scanner.nextInt();
            if (choice == 1){
                end = true;
            }
        }
    }
    public static double errorHandling(Scanner s){
        System.out.println("Podano liczbe w zlym formacie! Zostanie ustawiona domyslna liczba (1)");
        s.nextLine();
        return 1;
    }
}