
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Figura figura = null;
        int op;
        do {  
            System.out.println("""
            Ingrese una opcion: 
            0.Salir 
            1.Rectangulo. 
            2.Triangulo 
            3.Circulo 
            4.Mostrar
            5.Dibujar""");
            if(figura!=null)
            System.out.println("Figura creada: "+figura.getClass().getSimpleName());
            else
            System.out.println("Figura sin crear");
            op = Integer.parseInt(sc.nextLine());
            switch (op) {
                case 1:
                    System.out.println("Ingrese el largo");
                    int largo = Integer.parseInt(sc.nextLine());
                    System.out.println("Ingrese el alto");
                    int alto = Integer.parseInt(sc.nextLine());
                    figura = new Rectangulo(alto, largo);
                    break;
                case 2:
                    System.out.println("Ingrese la base");
                    int base = Integer.parseInt(sc.nextLine());
                    System.out.println("Ingrese el alto");
                    int alto2 = Integer.parseInt(sc.nextLine());
                    figura = new Triangulo(base, alto2);
                    break;
                case 3:
                    System.out.println("Ingrese el radio");
                    int radio = Integer.parseInt(sc.nextLine());
                    figura = new Circulo(radio);
                    break;
                case 4:
                    if (figura != null)
                        figura.imprimir();
                    else
                        System.out.println("No se creo ninguna figura");
                    break;
                default:
                    break;
            }
        } while (op != 0);
        sc.close();
    }
}
