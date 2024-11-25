
public class Rectangulo extends Figura {
    private int largo;
    private int alto;

    public Rectangulo(int alto, int largo) {
        this.alto = alto;
        this.largo = largo;
    }

    public Rectangulo() {}

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAlto() {
        return alto;
    }

    public int getLargo() {
        return largo;
    }
    @Override
    public double area() {
        return (this.alto * this.largo);
    }
    @Override
    public double perimetro() {
        return (this.alto * 2 + this.largo * 2);
    }
    @Override
    public void imprimir() {
        System.out.println("Rectangulo:");
        System.out.println("Largo :" + this.largo);
        System.out.println("Alto: " + this.alto);
        System.out.println("Area " + this.area());
        System.out.println("Perimetro " + this.perimetro());
    }
   
}