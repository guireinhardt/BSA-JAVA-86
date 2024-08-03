package entities;

public class Quadrado implements FiguraGeometrica{
    public Quadrado(double quadrado){
        System.out.println("Quadrado criado!!");
        this.quadrado = quadrado;
    }

    public double getQuadrado() {
        return quadrado;
    }

    //atributos
    private double quadrado;

    //Métodos
    @Override
    public double calcularArea(){
        return Math.pow(quadrado,2);
    }
    @Override
    public double calcularPerimetro(){
        return 4 * quadrado;
    }
    @Override
    public String toString(){
        return String.format("A área do quadrado é: %.2f e o perimetro do quadrado é %.2f",calcularArea(),calcularPerimetro());
    }
}
