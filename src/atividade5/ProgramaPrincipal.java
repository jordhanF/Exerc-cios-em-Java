package atividade5;

//5) Faça uma aplicação para realizar o cadastro de empréstimos financeiros com as seguintes informações: nome
//do cliente, valor do empréstimo e juros por mês. O máximo permitido para o cadastramento é de apenas 1500
//clientes e não pode haver mais de um empréstimo para o mesmo cliente.
//Crie um menu com as seguintes opções:
//1. Cadastrar empréstimos (efetuar pesquisa se o nome do cliente já existe).
//2. Calcular o valor que cada cliente pagará de juros em um mês (mostrar todos).
//3. Alterar o juros do cliente que tem o maior valor de empréstimo (supondo que não exista valores de
//empréstimos iguais).
//4. Sair.


import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        VetEmprest inserir = new VetEmprest();

        int escolha = 0;

        double taxaJuros = 0.1;

        while (escolha!=4){

            System.out.println("""
                    
                    Escolha uma opção:
                    1 - Cadastrar empréstimo:
                    2 - Calcular o valor que cada cliente pagará de juros em um mês:
                    3 - Alterar o juros do cliente que tem o maior valor de empréstimo:
                    4 - SAIR.""");

            escolha = sc.nextInt();


            switch (escolha){
                case 1:

                    sc.nextLine();
                    System.out.println("Digite o nome do cliente: ");
                    String nome = sc.nextLine();

                    System.out.println("Digite o valor que deseja pegar: ");
                    double valor = sc.nextInt();

                    inserir.Cadastrar(nome, valor, taxaJuros);
                    break;

                case 2:

                    inserir.calcJuros();
                    break;

                case 3:

                    System.out.println("Informe o novo juros que será aplicado:(Exemplo '20', pra atualizar pra 20%) ");
                    double novoJuros = sc.nextDouble();

                    inserir.AlterarJuros(novoJuros);
                    break;

                case 4:

                    System.out.println("Até a próxima!");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        }
    }
}