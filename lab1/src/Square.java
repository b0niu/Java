public class Square extends Figure implements Printable{

    public double a;

    public Square(double bok){
        a=bok;
    }

    @Override
    public double calculateArea() {
        return a*a;
    }

    @Override
    public double calculatePerimeter() {
        return 4*a;
    }

    @Override
    public void print() {
        System.out.println("Pole kwadratu "+calculateArea());
        System.out.println("Obwod kwadratu "+calculatePerimeter());

    }
}
