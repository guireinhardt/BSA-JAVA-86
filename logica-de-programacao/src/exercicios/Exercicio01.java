package exercicios;

import java.util.Locale;

public class Exercicio01 {
    public static void main(String[] args) {
        String gameRpg = "Hogwarts Legacy";
        String gameIndie = "Hollow Knigth";

        int age = 35;
        int code = 2367;
        char gender = 'M';
        double priceRPG = 107.80;
        double priceIndie = 46.99;
        double mediaValor;
        mediaValor = (priceRPG + priceIndie) / 2;

        System.out.println(gameRpg + " está custando R$" + priceRPG);
        System.out.println(gameIndie + "está custando R$" + priceIndie);
        System.out.printf("O comprador tinha %d anos ,code %d e genero: %s %n", age, code, gender);
        System.out.printf("Média de valor R$ %f %n" , mediaValor);
        System.out.printf("Média de valor arredondado R$" +"%.2f",mediaValor);
        System.out.printf(new Locale("en"),"%nMédia de valor arredondado no padrão americano R$" +"%.2f",mediaValor);
    }
}
