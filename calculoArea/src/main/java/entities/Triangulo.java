package entities;

public class Triangulo {
    public double baseMenor,baseMaior, altura;

    public double areatriangulo() {
        return (baseMenor * altura) / 2;
    }

    public double perimetrotriangulo() {
        return baseMenor + baseMaior + altura;
    }
}
