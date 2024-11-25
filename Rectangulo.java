
public class Rectangulo {
    private int largo;
    private int alto;

    public Rectangulo(int alto, int largo) {
        this.alto = alto;
        this.largo = largo;
    }

    public Rectangulo() {
    }

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

    public int area() {
        return (this.alto * this.largo);
    }

    public int perimetro() {
        return (this.alto * 2 + this.largo * 2);
    }

    public void imprimir() {
        System.out.println("Rectangulo:");
        System.out.println("Largo :" + this.largo);
        System.out.println("Alto: " + this.alto);
        System.out.println("Area " + this.area());
        System.out.println("Perimetro " + this.perimetro());
    }
}