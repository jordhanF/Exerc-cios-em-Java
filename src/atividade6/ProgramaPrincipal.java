package atividade6;
//6) Faça uma aplicação para realizar o cadastro de contas bancárias com as seguintes informações: número da
//conta, nome do cliente e saldo. O banco permitirá o cadastramento de apenas 15 contas e não pode haver mais
//de uma conta com o mesmo número.
//Crie o menu de opções a seguir:
//1. Cadastrar contas (efetuar pesquisa se o número da conta já existe).
//2. Visualizar todas as contas de um determinado cliente (procurar pelo nome).
//3. Excluir a conta com menor saldo (supondo a não existência de saldos iguais).
//4. Sair

import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int escolha=0;

        ContaVet inserir = new ContaVet();

        while (escolha != 4) {

            System.out.println("""
                                        
                    Escolha uma opção:
                    1 - Cadastrar conta:
                    2 - Visualizar todas as contas de um determinado cliente (procurar pelo nome):
                    3 - Excluir a conta com menor saldo:
                    4 - SAIR.""");

            escolha = sc.nextInt();


            switch (escolha) {

                case 1:

                    System.out.println("Informe o número da conta: ");
                    int nConta = sc.nextInt();

                    sc.nextLine();
                    System.out.println("Informe o nome do cliente: ");
                    String nome = sc.nextLine();

                    System.out.println("Informe o saldo: ");
                    double saldo = sc.nextDouble();

                    inserir.cadastrar(nConta, nome, saldo);
                    break;

                case 2:

                    sc.nextLine();
                    System.out.println("Digite o nome do cliente que deseja procurar: ");
                    String nomeBusca = sc.nextLine();

                    inserir.consultar(nomeBusca);
                    break;

                case 3:
                    inserir.excluirMenor();
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
