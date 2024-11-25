
public class Triangulo extends Figura {
    private int base;
    private int altura;

    public int getBase() {
        return base;
    }

    public Triangulo() {
    }

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public double area() {
        return (this.base * this.altura / 2);
    }
    @Override
    public double perimetro() {
      return Math.sqrt(base * base + altura * altura)+base+altura;
    }
    @Override
    public void imprimir() {
        System.out.println("Triangulo");
        System.out.println("Base " + this.base);
        System.out.println("Altura: " + this.altura);
        System.out.println("Area: " + this.area());
        System.out.println("Perimetro " + this.perimetro());
    }

}
