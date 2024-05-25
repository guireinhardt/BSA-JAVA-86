package introducao;

import java.util.Scanner;

public class exercicio9 {

    public static void main(String[] args) {
        String dia;
        String resultado = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o dia da semana de hoje: ");
        dia = sc.nextLine();

        try {
            // transformando um texto em inteiro, neste caso o dia da semana
            int numero = Integer.parseInt(dia);


            switch (numero) {
                case 1:
                    resultado = "Domingo";
                    break;
                case 2:
                    resultado = "Segunda-Feira!";
                    break;
                case 3:
                    resultado = "Terça-Feira!";
                    break;
                case 4:
                    resultado = "Quarta-Feira!";
                    break;
                case 5:
                    resultado = "Quinta-Feira!";
                    break;
                case 6:
                    resultado = "Sexta-Feira! Tuts Tuts!!";
                    break;
                case 7:
                    resultado = "Sabadou meu chapa!";
                    break;
                default:
                    resultado = "Valor Invalido!";
                    break;
            }
        } catch (NumberFormatException e){

        }
        System.out.printf("O dia da semana é: %s",resultado);
        sc.close();
    }
}
