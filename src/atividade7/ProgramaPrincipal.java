package atividade7;
//7) Uma empresa possui um cadastro de funcionários com os seguintes dados: nome, número de horas
//trabalhadas no mês e categoria (pode ser O - Operário ou G-gerente). Sabendo-se que essa empresa deseja
//informatizar sua folha de pagamento. Faça um programa que:
//a) Cadastre os dados dos funcionários. O máximo que a empresa suporta são 18 funcionários ativos;
//b) Alterar o número de horas trabalhadas de um determinado funcionário;
//c) Mostrar todos os dados dos funcionários e seus respectivos salários brutos. Para calcular o salário bruto
//adote o valor de R$112,00 para uma hora trabalha + acréscimo da categoria do funcionário. Ver tabela
//abaixo:


import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int escolha = 0;

        EmpresaVet inserir = new EmpresaVet();

        while (escolha != 4) {

            System.out.println("""
                                        
                    Escolha uma opção:
                    1 - Cadastrar funcionário:
                    2 - Alterar o número de horas trabalhadas de um determinado funcionário:
                    3 - Mostrar todos os dados dos funcionários e seus respectivos salários brutos:
                    4 - SAIR.""");

            escolha = sc.nextInt();


            switch (escolha) {

                case 1:

                    sc.nextLine();
                    System.out.println("Informe o nome do funcionário: ");
                    String nome = sc.nextLine().toLowerCase();

                    System.out.println("Informe o número de horas trabalhada: ");
                    int horas = sc.nextInt();

                    System.out.println("Informe a categoria do funcionário:(O - Operário ou G-gerente) ");
                    char categoria = sc.next().toLowerCase().charAt(0);

                    inserir.cadastrar(nome, horas, categoria);
                    break;

                case 2:

                    sc.nextLine();
                    System.out.println("Digite o nome do funcionário que deseja alterar as horas: ");
                    String nomeP = sc.nextLine().toLowerCase();

                    System.out.println("Digite a nova quantidade de horas do funcionário: ");
                    int novaHora = sc.nextInt();

                    inserir.alterarHoras(nomeP, novaHora);
                    break;

                case 3:

                    inserir.salarioBruto();
                    break;

                case 4:

                    System.out.println("Até a próxima!");
                    break;

                default:
                    System.out.println("Opção inválida! ");
            }
        }
    }
}
