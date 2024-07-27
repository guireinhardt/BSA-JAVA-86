package entities;

public class Trapezio {
    //criando os atributos da classe Trapezio
    public double baseMenor,baseMaior,altura;

    //criando o método para calcular a area
    public double  area() {
        return ((baseMaior + baseMenor) * altura) / 2;

    }

}
