package entities;

public class Curso {
    private String nome;
    private  int quantidadeAlunos;
    private  double preco;


    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return  nome;
    }
    public void setQuantidadeAlunos(int quantidadeAlunos) {
        this.quantidadeAlunos = quantidadeAlunos;
    }
    public  int getQuantidadeAlunos(){
        return quantidadeAlunos;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public double getPreco(){
        return preco;
    }

    //métodos

    public double totalValorCurso() {
        return preco * quantidadeAlunos;
    }

    @Override
    public String toString(){
            return  String.format(" O nome do curso é %s, ele tem matriculado %d e o preço total do curso é %.2f.\n ",nome,quantidadeAlunos,totalValorCurso());
    }

    public void addAluno(int quantidadeAlunos){
        this.quantidadeAlunos += quantidadeAlunos;
    }
    public void removerAluno (int quantidadeAlunos){
        this.quantidadeAlunos -= quantidadeAlunos;
    }

}
