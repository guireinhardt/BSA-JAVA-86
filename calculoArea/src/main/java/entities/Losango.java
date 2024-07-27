package entities;

public class Losango {
    public double dMaior, dMenor,lado;

    public double arealosango() {
        return (dMaior * dMenor) / 2;
    }

    public double perimetrolosango() {
        return 4 *lado;
    }
}
