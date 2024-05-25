package introducao;

public class estruturaDeDecisao {
    public static void main(String[] args) {
        // declarar variavel em apenas uma linha:
        // double nota1,nota2,nota3,media

        double nota1 = 8.0;
        double nota2 = 8.0;
        double nota3 = 8.0;
        double media;

        media = (nota1 + nota2 + nota3)/ 3.0;

        //operadores lógicos:
        // && -> E ( as duas condições verdadeiras)
        // || -> OU ( uma das condições tera que ser verdadeira)
        // ! -> not

        if (media > 7.0){
            System.out.printf("Sua média foi %.1f e você foi aprovado%n",media);
        } else if (media > 5.0 && media < 7.0) {
            System.out.printf("Você está de recuperação, sua média foi %,1f\n",media);
        } else {
            System.out.printf("Sua média foi %.1f e você foi reprovado\n",media);
        }

        System.out.println("Muito Obrigado por tirar a media conosco!!");


    }
}
