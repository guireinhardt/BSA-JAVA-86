package application;

import entities.Trapezio;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        Trapezio trap1 = new Trapezio();
        Trapezio trap2 = new Trapezio();
        System.out.println("Entre com a base menor do Trazpézio 1:");
        trap1.baseMenor = sc.nextDouble();
        System.out.println("Entre com a base maior do Trapézio 2:");
        trap1.baseMaior = sc.nextDouble();
        System.out.println("Entre com a altura do Trapézio: ");
        trap1.altura = sc.nextDouble();

        System.out.println("Entre com a base menor do Trapézio 2:");
        trap2.baseMenor = sc.nextDouble();
        System.out.println("Entre com a base maior do Trapézio 2:");
        trap2.baseMaior = sc.nextDouble();
        System.out.println("Entre com a altura do Trapézio 2:");
        trap2.altura = sc.nextDouble();


        System.out.printf("A area do trapézio 1 é: %.2f\n", trap1.area());
        System.out.printf("A area do trapézio 2 é: %.2f\n", trap2.area());

        if (trap1.area() > trap2.area()){
            System.out.printf("A área do trapézio 1 é igual a %.2f e ela é maior do que a do trapézio 2.\n", trap1.area());
        }else if (trap2.area() > trap1.area()) {
            System.out.printf("A área do trapézio 2 é igual a %.2f e ela é maior do que a do trapézio 1\n",trap2.area());
        } else {
            System.out.printf("A área do trapézio 1 é igual a %.2f e a área do trapézio 2 é igual a %.2f e elas são iguais.",trap1.area(),trap2.area());
        }


    }
}
