package atividade1;

import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locadora[] filmes = new Locadora[100];
        int indexFilme = 0;

        int escolha=0;

        while (escolha!=4){


            System.out.println("Por favor escolha uma opção: ");
            System.out.println("1 - Incluir filmes no arquivo.");
            System.out.println("2 - Consultar o total de filmes de um determinado gênero.");
            System.out.println("3 - Excluir um filme do arquivo procurando pelo nome.");
            System.out.println("4 - SAIR.");
            escolha = sc.nextInt();

            switch (escolha){

                case 1:

                    filmes[indexFilme] = Opcao1(sc);
                    indexFilme++;
                    break;

                case 2:

                    Opcao2(filmes, indexFilme, sc);
                    break;

                case 3:

                    boolean excluiu = Opcao3(sc, filmes, indexFilme);

                    if (excluiu){
                        indexFilme--;
                    }else {continue;}

                    break;

                case 4:

                    System.out.println("Até a próxima!");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;

            }

        }

    }


    static Locadora Opcao1(Scanner sc){

        Locadora filme = new Locadora();

        System.out.println("Digite o código do filme: ");
        int codigo = sc.nextInt();
        System.out.println("Digite o título do filme: ");
        String titulo = sc.next();
        System.out.println("Digite o gênero do filme:\nA - Ação, T - Terror, D - Drama. ");
        char genero = Character.toLowerCase(sc.next().charAt(0));

        filme.setCodigoFilme(codigo);
        filme.setTituloFilme(titulo);
        filme.setGeneroFilme(genero);

        System.out.println("Filme adicionado com Sucesso");
        return filme;
    }

    static void Opcao2(Locadora[]filmes, int indexFilme, Scanner sc){
        int contadorGenero = 0;
        char procurarGenero;

        System.out.println("Qual gênero deseja saber a quantidade: \n A/ T / D");
        procurarGenero = sc.next().charAt(0);
        for (int i=0; i<indexFilme; i++){
            if (filmes[i].getGeneroFilme() == procurarGenero){
                contadorGenero++;
            }
        }
        System.out.println("\nForam encontrados "+ contadorGenero+" filmes do gênero "+procurarGenero+"!\n");
    }

    static boolean Opcao3(Scanner sc, Locadora[] filmes, int indexFilme){

        System.out.print("Informe o título do filme a ser excluído: ");
        String tituloExclusao = sc.next();
        boolean excluiu = false;
        for (int i = 0; i < indexFilme; i++) {
            if (filmes[i].getTituloFilme().equalsIgnoreCase(tituloExclusao)) {
                for (int j = i; j < indexFilme - 1; j++) {
                    filmes[j] = filmes[j + 1];
                }
                excluiu = true;
                break;
            }
        }

        if (excluiu) {
            System.out.println("Filme excluído com sucesso.\n");
        } else {
            System.out.println("Filme não encontrado.\n");
        }

        return excluiu;
    }
}

