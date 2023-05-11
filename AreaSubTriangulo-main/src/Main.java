// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Triangulo exterior = new Triangulo();
        exterior.ingresarPuntos();
        if (exterior.esRectangulo()){
            Punto baricentro = exterior.getBaricentro();
            Triangulo interior = new Triangulo(exterior.getPunto1(),exterior.getPunto2(),baricentro);
            double areaExterior = exterior.calcularArea();
            double areaInterior = interior.calcularArea();
            double area = areaExterior - areaInterior;
            System.out.println("El área entre los dos triangulos es: "+area);
        }else{
            System.out.println("El triángulo no es rectangulo");
        }
    }
}