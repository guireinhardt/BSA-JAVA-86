package entities;

public class Quadrado {
    public double lado;

    public double areaquadrado() {
        return Math.pow(lado,2);
    }
    public double perimetroquadrado() {
        return 4 * lado;
    }
}
