package entities;

public class Circulo {
    public double raio;


    public double areacirculo() {
        // A = pi * r2
        return Math.PI * Math.pow(raio, 2);
    }
    public double perimetrocirculo() {
        return 2 * Math.PI * raio;
    }
}
