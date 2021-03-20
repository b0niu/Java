public class Triangle extends Figure implements Printable {

    public double a;

    public Triangle(double bok){
        a=bok;
    }


    @Override
    public double calculateArea() {
        return (a*a*Math.sqrt(3))/2;
    }


    @Override
    public double calculatePerimeter() {
        return 3*a;
    }

    @Override
    public void print() {
        System.out.println("Pole trojkatu "+calculateArea());
        System.out.println("Obwod trojkatu "+calculatePerimeter());

    }

}
