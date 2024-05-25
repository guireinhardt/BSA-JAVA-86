package introducao;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        double conta, minConta;
        double minUsado;
        double difMin;
        double valorFinal;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite quantos minutos você utilizou:");
        minUsado = sc.nextDouble();
        conta = 79.30;

        if (minUsado < 100) {
            System.out.printf("Valor da conta: R$ %.2f", conta);
        }
        if (minUsado > 100) {
            valorFinal = (minUsado - 100) * 2.30 + 79.30;
            System.out.printf("Valor final da conta: R$ %.2f", valorFinal);
        }
        sc.close();

    }
}