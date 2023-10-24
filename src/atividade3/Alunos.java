package atividade3;
//Faça um programa aplicativo para controlar parte um sistema acadêmico de uma determinada escola. A
//escola tem 500 alunos. Considere que a classe que contem os dados dos alunos se chama Alunos e a classe que
//contem um vetor do tipo Alunos se chama AlunosVet.
//As opções do menu deverão ser as seguintes:
//a) Incluir dados em um vetor em que cada registro possui os seguintes campos: matricula, nome do aluno,
//nota1, nota2. As notas serão inteiras ou fracionadas;
//b) Consultar o nome de todos os alunos que possuem nota1 e nota2 abaixo de um valor determinado;
//c) Calcular e mostrar a média aritmética e o nome de cada alunos cadastrados;


public class Alunos {
    private int matricula;
    private String nome;
    private double nota1;
    private double nota2;


    //GETTERS E SETTERS.
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
}
