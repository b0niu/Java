import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double bok, pod;
        while (true) {
            System.out.println("Wybierz Figure");
            System.out.println("1->2D, 2->Granistoslop");
            Scanner scanner = new Scanner(System.in);
            int f = scanner.nextInt();
            switch (f) {
                case 1: {
                    System.out.println("Wybierz figure");
                    System.out.println("1->kwadrat, 2->kolo, 3->trojkat");
                    f = scanner.nextInt();
                    switch (f) {
                        case 1: {
                            System.out.println("Podaj bok");
                            bok = scanner.nextInt();
                            Square kwa = new Square(bok);
                            kwa.print();
                        }
                        break;
                        case 2: {
                            System.out.println("Podaj promien");
                            bok = scanner.nextInt();
                            Circle kol = new Circle(bok);
                            kol.print();
                        }
                        break;
                        case 3: {
                            System.out.println("Podaj bok");
                            bok = scanner.nextInt();
                            Triangle tro = new Triangle(bok);
                            tro.print();
                        }
                        break;
                    }
                }
                break;
                case 2:
                    {
                        try{
                    System.out.println("Podaj bok podstawy");
                    bok = scanner.nextDouble();
                    System.out.println("Podaj wyskosc");
                    pod = scanner.nextDouble();
                    Prism gra = new Prism(bok,pod);
                    gra.print();}
                        catch(InputMismatchException w){System.exit(0);}
                    }
                break;
                default:
                {
                    System.exit(1);
                }
            }
        }
    }
}
