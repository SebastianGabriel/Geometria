
import java.util.Scanner;

public class Main {
    static private Figura figura = null;
    static private Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int op;
        do {
            menu();
            op = Integer.parseInt(sc.nextLine());
            switch (op) {
                case 1:
                    limpiarPantalla();
                    figura = crearRectangulo();
                    limpiarPantalla();
                    break;
                case 2:
                    limpiarPantalla();
                    figura = crearTriangulo();
                    limpiarPantalla();
                    break;
                case 3:
                    limpiarPantalla();
                    System.out.println("Ingrese el radio");
                    int radio = Integer.parseInt(sc.nextLine());
                    figura = new Circulo(radio);
                    limpiarPantalla();
                    break;
                case 4:
                    if (figura != null) {
                        limpiarPantalla();
                        figura.imprimir();
                        System.out.println("+---------------------+");
                    } else
                        System.out.println("No se creo ninguna figura");
                    break;
                case 5:
                    if (figura != null) {
                        limpiarPantalla();
                        figura.dibujar();
                        System.out.println("+---------------------+");
                    } else
                        System.out.println("No se creo ninguna figura");
                    break;
                default:
                    break;
            }
        } while (op != 0);
        sc.close();
    }

    public static void menu() {
        System.out.println("""
                Ingrese una opcion:
                0.Salir
                1.Rectangulo.
                2.Triangulo
                3.Circulo
                4.Mostrar
                5.Dibujar""");
        if (figura != null)
            System.out.println("Figura creada: " + figura.getClass().getSimpleName());
        else
            System.out.println("Figura sin crear");
    }

    public static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static Rectangulo crearRectangulo() {
        System.out.println("Ingrese el largo");
        int largo = Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese el alto");
        int alto = Integer.parseInt(sc.nextLine());
        return (new Rectangulo(alto, largo));
    }

    public static Triangulo crearTriangulo() {
        System.out.println("Ingrese la base");
        int base = Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese el alto");
        int alto2 = Integer.parseInt(sc.nextLine());
        return (new Triangulo(base, alto2));
    }
}
