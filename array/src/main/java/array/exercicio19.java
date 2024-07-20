package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class exercicio19 {

    public static void main(String[] args) {
        double numeros,maior,menor;
        int quantidade = 0;
        ArrayList<Double> listaNumeros = new ArrayList<>();
        String input;
        Scanner sc = new Scanner(System.in);


        while (true){
            System.out.println("Digite os números decimais (digite 'sair' para terminar):");
           input = sc.nextLine();
           if (input.equalsIgnoreCase("sair")){
               break;
            }
           try{
               double numero = Double.parseDouble(input);
               listaNumeros.add(numero);
               quantidade = quantidade +1 ;
           }catch (NumberFormatException e){
               System.out.println("Entrada inválida!");
           }
        }
        double soma = 0;

        for (double num : listaNumeros){
            soma += num;
        }
        double media = soma/listaNumeros.size();
        maior = Collections.max(listaNumeros);
        menor = Collections.min(listaNumeros);
        int posicaoMaior = listaNumeros.indexOf(maior);
        listaNumeros.remove(menor);
        Collections.sort(listaNumeros, Collections.reverseOrder());

        System.out.printf("A média de números é: %.2f\n",media);
        System.out.printf("A soma dos valores é: %.0f\n",soma);
        System.out.printf("A quantidade de números digitados foi: %d\n",quantidade);
        System.out.printf("O maior valor do array: %.2f\n",maior);
        System.out.printf("O menor valor do array: %.2f\n",menor);
        System.out.printf("O maior valor foi %dª digitada", posicaoMaior +1);
        System.out.printf("O menor valor %.2f foi removido com sucesso!\n",menor);
        System.out.println("Ordem:" + listaNumeros);

        sc.close();

    }
}
