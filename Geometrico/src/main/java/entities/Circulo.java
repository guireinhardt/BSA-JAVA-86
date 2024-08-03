package entities;

import javax.annotation.processing.Generated;

public class Circulo implements FiguraGeometrica{

    //Método construtor
        public Circulo(double raio){

            this.raio = raio;
            System.out.printf("O raio inserido foi igual a  %f\n", raio);

        }

    // Atributos
    private double raio;

    //Métodos especificos

    @Override
    public double calcularArea(){
        return Math.PI * Math.pow(raio,2.0);
    }

    @Override
    public double calcularPerimetro() {
        return 2.0 * Math.PI * raio;
    }
    @Override
    public String toString() {
        return String.format(" O circulo tem área de: %.3f e o perimetro é de: %.3f ",calcularArea(),calcularPerimetro());
    }

    //Getters e Setters
    public void setRaio(double raio) {
        this.raio = raio;
    }
    public double getRaio(){
        return raio;
    }
}
