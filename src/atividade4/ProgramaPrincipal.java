package atividade4;

//4) Faça um programa que controle o estoque de uma loja de brinquedos. Atualmente existem 40 itens, cada um
//contendo o código, descrição, preço de compra, preço de venda, quantidade em estoque e estoque mínimo.
//a) Crie uma rotina para cadastrar os produtos;
//b) Crie uma rotina para mostrar o valor do lucro obtido com a venda de um determinado produto (faz a
//pesquisa pelo campo código);
//c) Crie uma rotina que mostre todos os produtos com quantidade em estoque abaixo do estoque mínimo
//permitido.

import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        VetProduto setar = new VetProduto();

        int escolha = 0;

        System.out.println("Informe o estoque mínimo permitido: ");
        int estoqueMin = sc.nextInt();


        while (escolha!=4){



            System.out.println("""
                    
                    Escolha uma opção:
                    1 - Cadastrar produto:
                    2 - Mostrar o valor do lucro obtido com a venda de um determinado produto:
                    3 - Mostrar produtos com quantidade em estoque abaixo do mínimo permitido:
                    4 - SAIR.""");
            escolha = sc.nextInt();
            int codigo;

            switch (escolha){
                case 1:
                    System.out.println("Informe o código do produto: ");
                    codigo = sc.nextInt();

                    System.out.println("Informe quantos produtos serão adicionados: ");
                    int estoque = sc.nextInt();

                    sc.nextLine();
                    System.out.println("Descreva este produto: ");
                    String descricao = sc.nextLine();

                    System.out.println("Informe o preço de compra deste produto: ");
                    double precoCompra = sc.nextDouble();

                    System.out.println("Informe o preço de venda deste produto: ");
                    double precoVenda = sc.nextDouble();


                    setar.Incluir(codigo, descricao, precoCompra, precoVenda, estoque);
                    break;

                case 2:

                    System.out.println("Digite o código do produto procurado: ");
                    int codigoP = sc.nextInt();
                    setar.Lucro(codigoP);
                    break;

                case 3:

                    setar.ChecarEstoque(estoqueMin);
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
