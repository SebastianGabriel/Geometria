
public class Circulo {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public Circulo() {
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double area() {
        return (Math.PI * Math.pow(this.radio, 2));
    }

    public double perimerto() {
        return (Math.PI * this.radio * 2);
    }

    public void imprimir() {
        System.out.println("Circulo");
        System.out.println("Radio : " + this.radio);
        System.out.println("Area :" + this.area());
        System.out.println("Perimetro " + this.perimerto());
    }

}