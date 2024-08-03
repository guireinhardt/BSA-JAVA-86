package entities;

public class Triangulo implements FiguraGeometrica {

    private double base,lado,altura;
    public Triangulo(double base, double lado,double altura){
        System.out.println("Triangulo criado!");
        this.base = base;
        this.lado = lado;
        this.altura = altura;
    }


    public double getBase() {
        return base;
    }

    public double getLado() {
        return lado;
    }
    public double getAltura(){
        return altura;
    }
    @Override
    public double calcularArea(){
        return (base * altura)/2;
    }
    @Override
    public double calcularPerimetro(){
        return 2 * lado + base;
    }


    @Override
    public String toString() {
        return String.format("A área do triangulo é igual a: %.2f e o perimetro do triangulo é %.2f",calcularArea(),calcularPerimetro());
    }
}
