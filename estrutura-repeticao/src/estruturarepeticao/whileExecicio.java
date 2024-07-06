package estruturarepeticao;

import java.util.Scanner;

public class whileExecicio {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);

        while (true){
            System.out.println("Digite o Nome: ");
            String nome = sc.nextLine();
            //usar o método lowercase para verificar se for tudo minusculo.
            if (nome.toLowerCase().equals("sair")){
                break;

            }
            System.out.printf("Seja bem-vindo %s fico feliz :) por ter você aqui!\n", nome);
        }


    }
}
