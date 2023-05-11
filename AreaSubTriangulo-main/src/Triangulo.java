import java.util.Scanner;

public class Triangulo {
    private Punto punto1;
    private Punto punto2;
    private Punto punto3;

    public Triangulo() {
    }

    public Triangulo(Punto punto1, Punto punto2, Punto punto3) {
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
    }

    public void ingresarPuntos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese las coordenadas del primer punto (x, y): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        System.out.println("Ingrese las coordenadas del segundo punto (x, y): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        System.out.println("Ingrese las coordenadas del tercer punto (x, y): ");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        punto1 = new Punto(x1, y1);
        punto2 = new Punto(x2, y2);
        punto3 = new Punto(x3, y3);
    }

    public boolean esRectangulo() {
        double lado1 = calcularDistancia(punto1, punto2);
        double lado2 = calcularDistancia(punto2, punto3);
        double lado3 = calcularDistancia(punto3, punto1);

        // Comprobamos si es un triángulo rectángulo utilizando el teorema de Pitágoras
        return (lado1 * lado1 == lado2 * lado2 + lado3 * lado3) ||
                (lado2 * lado2 == lado1 * lado1 + lado3 * lado3) ||
                (lado3 * lado3 == lado1 * lado1 + lado2 * lado2);
    }

    public Punto getBaricentro() {
        double xBaricentro = (punto1.getX() + punto2.getX() + punto3.getX()) / 3.0;
        double yBaricentro = (punto1.getY() + punto2.getY() + punto3.getY()) / 3.0;
        return new Punto(xBaricentro, yBaricentro);
    }

    public double calcularArea() {
        double lado1 = calcularDistancia(punto1, punto2);
        double lado2 = calcularDistancia(punto2, punto3);
        double lado3 = calcularDistancia(punto3, punto1);
        double semiperimetro = (lado1 + lado2 + lado3) / 2.0;

        return Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
    }

    private double calcularDistancia(Punto punto1, Punto punto2) {
        double dx = punto2.getX() - punto1.getX();
        double dy = punto2.getY() - punto1.getY();
        return Math.sqrt(dx * dx + dy * dy * dy);
    }
    public Punto getPunto1() {
        return punto1;
    }

    public Punto getPunto2() {
        return punto2;
    }

    public Punto getPunto3() {
        return punto3;
    }
}

