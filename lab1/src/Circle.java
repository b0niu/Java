public class Circle extends Figure implements Printable {

    public double r;

    public Circle(double pr){
        r=pr;
    }

    @Override
    public double calculateArea() {
        return Math.PI*r*r;
    }

    @Override
    public double calculatePerimeter() {
        return 2*Math.PI*r;
    }

    @Override
    public void print() {
        System.out.println("Pole kola "+calculateArea());
        System.out.println("Obwod kola "+calculatePerimeter());

    }
}
