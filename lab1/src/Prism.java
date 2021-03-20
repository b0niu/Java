import java.util.Scanner;

public class Prism implements Printable{

    Figure base;
    double h;

    public Prism(double w, double b){
        System.out.println("Wybierz podstawe");
        System.out.println("1->kwadrat, 2->kolo, 3->trojkat");
        Scanner scanner = new Scanner(System.in);
        int ch = scanner.nextInt();
        switch(ch){
            case 1:
                { base = new Square(b);}
            break;
            case 2:
                { base = new Circle(b);}
            break;
            case 3:
                { base = new Triangle(b);}
            break;
            default:
                {System.out.println("Nie wybrales podstawy");
                    base = new Square(b);}
            }
        h = w;
    }

    public double Obj(){
        return (base.calculateArea()*h);
    }

    public double Pole(){
        return (2*(base.calculateArea())+(base.calculatePerimeter())*h);
    }
    @Override
    public void print() {
        System.out.println("Objetosc to "+Obj());
        System.out.println("Pole to "+Pole());

    }
}
