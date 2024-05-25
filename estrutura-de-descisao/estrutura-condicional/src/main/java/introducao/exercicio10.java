package introducao;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        String nome;
        double peso,altura,imc;
        String classificacao;

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor digite o seu nome: ");
        nome= sc.nextLine();
        System.out.printf("Olá %s, vamos calcular seu IMC\n",nome);
        System.out.println("Informe seu peso: ");
        peso = sc.nextDouble();
        System.out.println("Informe sua altura: ");
        altura = sc.nextDouble();

        imc = peso / (Math.pow(altura,2));

        if(imc < 18.5){
            System.out.printf("Obrigado por utilizar o programa,o seu IMC é igual a %.2f e sua classificação é \u001b[33;1mMAGREZA! ", imc);
        }
        if(imc >= 18.5 && imc <= 24.9){
            System.out.printf("Obrigado por utilizar o programa,o seu IMC é igual a %.2f e sua classificação é \u001b[35:1mNORMAL! ", imc);
        }
        if(imc >= 25.0 && imc <= 29.9){
            System.out.printf("Obrigado por utilizar o programa,o seu IMC é igual a %.2f e sua classificação é \u001b[33;1mSOBREPESO! ", imc);
        }
        if (imc >= 30.0 && imc <= 34.9){
            System.out.printf("Obrigado por utilizar o programa,o seu IMC é igual a %.2f e sua classificação é \u001b[31;1mOBESIDADE GRAU 1! ", imc);
        }
        if (imc >= 35.0 && imc < 40.0){
            System.out.printf("Obrigado por utilizar o programa,o seu IMC é igual a %.2f e sua classificação é \u001b[31;1mOBESIDADE GRAU 2! ", imc);
        }
        if (imc > 40.0 ){
            System.out.printf("Obrigado por utilizar o programa,o seu IMC é igual a %.2f e sua classificação é \u001b[31;1mOBESIDADE GRAU 3! ", imc);
        }
        sc.close();
    }
}
