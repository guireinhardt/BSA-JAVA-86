package application;

import entities.Curso;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Curso java = new Curso();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do curso");
        String nomeCurso = sc.nextLine();
        java.setNome(nomeCurso);
        System.out.println("Digite a quantidade de alunos:");
        java.setQuantidadeAlunos(sc.nextInt());
        sc.nextLine();
        System.out.println("Digite o preço do curso: R$");
        java.setPreco(sc.nextDouble());

        System.out.println(java.getNome());
        System.out.printf("A quantidade de alunos inscritos no curso %s é de: %d inscritos\n",java.getNome(),java.getQuantidadeAlunos());
        System.out.printf("O valor do curso %s é: R$ %.2f\n",java.getNome(),java.totalValorCurso());
        System.out.println("Digite a quantidade de alunos adicionados: \n");
        java.addAluno(sc.nextInt());
        sc.nextLine();

        System.out.printf(java.toString());

    }
}
