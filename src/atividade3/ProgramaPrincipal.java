package atividade3;
//Faça um programa aplicativo para controlar parte um sistema acadêmico de uma determinada escola. A
//escola tem 500 alunos. Considere que a classe que contem os dados dos alunos se chama Alunos e a classe que
//contem um vetor do tipo Alunos se chama AlunosVet.
//As opções do menu deverão ser as seguintes:
//a) Incluir dados em um vetor em que cada registro possui os seguintes campos: matricula, nome do aluno,
//nota1, nota2. As notas serão inteiras ou fracionadas;
//b) Consultar o nome de todos os alunos que possuem nota1 e nota2 abaixo de um valor determinado;
//c) Calcular e mostrar a média aritmética e o nome de cada alunos cadastrados;

import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {

        AlunosVet escola = new AlunosVet();
        Scanner sc = new Scanner(System.in);

        int escolha = 0;

        while (escolha!=4){

            System.out.println("""
                    
                    Escolha uma opção:
                    1 - Inserir dados do aluno:
                    2 - Consultar o nome de todos os alunos que possuem notas abaixo da média:
                    3 - Exibir a média aritmética dos alunos cadastrados:
                    4 - SAIR.""");
            escolha = sc.nextInt();

            switch (escolha){

                case 1:

                    System.out.println("Digite a matrícula do aluno: ");
                    int matricula = sc.nextInt();

                    System.out.println("Digite o nome do aluno: ");
                    String nome = sc.next();

                    System.out.println("Digite a primeira nota do aluno: ");
                    double nota1 = sc.nextDouble();

                    System.out.println("Digite a segunda nota do aluno: ");
                    double nota2 = sc.nextDouble();

                    escola.Incluir(matricula, nome, nota1, nota2);

                    break;

                case 2:

                    escola.Consultar();
                    break;

                case 3:

                    escola.MediaAritmetica();
                    break;

                case 4:
                    System.out.println("Até a próxima! ");
                    break;

                default:
                    System.out.println("Opção inválida! ");
            }


        }

    }
}
