package application;

import entities.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circulo circulo = new Circulo();
        Losango losango = new Losango();
        Quadrado quadrado = new Quadrado();
        Triangulo triangulo = new Triangulo();
        Retangulo retangulo = new Retangulo();
        ArrayList <Double> areas = new ArrayList<>();

        System.out.println("Digite o raio do circulo:");
        circulo.raio = sc.nextDouble();
        System.out.printf("A área do circulo é: %.2f\n",circulo.areacirculo());
        areas.add(circulo.areacirculo());
        System.out.printf("O perimetro do circulo é: %.2f\n",circulo.perimetrocirculo());
        System.out.println("-----------------------------------------------------\n");
        System.out.println("Digite a diagonal menor do losangulo: ");
        losango.dMenor = sc.nextDouble();
        System.out.println("Digite a diagonal maior do losangulo:");
        losango.dMaior = sc.nextDouble();
        System.out.println("Digite o lado para o calculo do perimetro do losangulo:");
        losango.lado = sc.nextDouble();
        System.out.printf("A área do losangulo é: %.2f\n",losango.arealosango());
        areas.add(losango.arealosango());
        System.out.printf("O perimetro do losangulo é: %.2f\n",losango.perimetrolosango());
        System.out.println("-----------------------------------------------------\n");
        System.out.println("Digite o lado do quadrado:");
        quadrado.lado = sc.nextDouble();
        System.out.printf("A área do quadrado é: %.2f\n",quadrado.areaquadrado());
        areas.add(quadrado.areaquadrado());
        System.out.printf("O perimetro do quadrado é: %.2f\n",quadrado.perimetroquadrado());
        System.out.println("-----------------------------------------------------\n");
        System.out.println("Digite a base menor do triangulo:");
        triangulo.baseMenor = sc.nextDouble();
        System.out.println("Digite a base maior do triangulo:");
        triangulo.baseMaior = sc.nextDouble();
        System.out.println("Digite a altura do triangulo:");
        triangulo.altura = sc.nextDouble();
        System.out.printf("A área do triangulo é: %.2f\n",triangulo.areatriangulo());
        areas.add(triangulo.areatriangulo());
        System.out.printf("O perimetro do triangulo é: %.2f\n",triangulo.perimetrotriangulo());
        System.out.println("-----------------------------------------------------\n");
        System.out.println("Digite a base do retangulo:");
        retangulo.base = sc.nextDouble();
        System.out.println("Digite a altura do retangulo:");
        retangulo.altura = sc.nextDouble();
        System.out.printf("A área do retangulo é: %.2f\n",retangulo.arearetangulo());
        areas.add(retangulo.arearetangulo());
        System.out.printf("O perimetro do retangulo é: %.2f\n",retangulo.perimetrotriangulo());

        double maiorArea = Collections.max(areas);

        /* for (double area : areas){
            if (area == triangulo.areatriangulo()) {
                System.out.printf("A maior area é: %.2f, de forma geométrica: triangulo\n",maiorArea);
                break;
            }
            if (area == quadrado.areaquadrado()){
                System.out.printf("A maior área é: %.2f, da forma geométrica: quadrado\n",maiorArea);
                break;
            }
            if (area == retangulo.arearetangulo()){
                System.out.printf("A maior área é: %.2f, da forma geométrica: retangulo\n",maiorArea);
                break;
            }
            if (area == losango.arealosango()){
                System.out.printf("A maior área é: %.2f, da forma geométrica: losango\n",maiorArea);
                break;
            }
            if (area == circulo.areacirculo()){
                System.out.printf("A maior área é: %.2f, da forma geométrica: circulo\n",maiorArea);
                break;
            }
        }*/


    }
}
