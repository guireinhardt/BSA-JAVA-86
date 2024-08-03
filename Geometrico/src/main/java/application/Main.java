package application;

import entities.Calculador;
import entities.Circulo;
import entities.Quadrado;
import entities.Triangulo;

public class Main {

    public static void main(String[] args) {
        Circulo circulo = new Circulo(2.75);


        //System.out.printf("A área é igual a %.3f\n",circulo.calcularAreaCirculo());
        //System.out.printf("O perimetro é igual a %.3f\n",circulo.calcularPerimetroCirculo());

        System.out.println(circulo);

        Quadrado quadrado = new Quadrado(2.75);

        System.out.println(quadrado);

        Triangulo triangulo = new Triangulo(2.30,4,5);
        System.out.println(triangulo);

        Calculador.maiorValorArea(quadrado,triangulo);

    }
}
