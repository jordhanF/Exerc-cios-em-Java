package atividade2;

import java.util.Scanner;

public class ProgramaPrincipal {
        public static void main(String[] args) {

            Registros[] dados = new Registros[100];
            int indexDados = 0;
            Scanner sc = new Scanner(System.in);

            int escolha = 0;

            while (escolha != 4) {
                System.out.println("""
                    
                    Por favor escolha uma opção:
                    1 - Incluir vendedores no arquivo.
                    2 - Consultar o total de vendedor de um determinado tipo mercadoria.
                    3 - Excluir um vendedor do arquivo procurando pelo nome.
                    4 - Sair.""");

                escolha = sc.nextInt();

                switch (escolha) {
                    case 1:
                        dados[indexDados] = Opcao1(sc);
                        indexDados++;
                        break;
                    case 2:
                        Opcao2(indexDados, dados, sc);
                        break;
                    case 3:
                        boolean excluir = Opcao3(indexDados, dados, sc);
                        if (excluir){
                            indexDados--;
                        }else {continue;}
                        break;
                    case 4:
                        System.out.println("Até a próxima!");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
            }
        }




        static Registros Opcao1(Scanner sc) {
            Registros registrar = new Registros();

            System.out.println("Digite o código do vendedor: ");
            int codigo = sc.nextInt();
            System.out.println("Digite o nome do vendedor: ");
            String nome = sc.next();
            System.out.println("Digite o tipo de mercadoria (P – perecível, N – não perecível): ");
            char tipo = Character.toLowerCase(sc.next().charAt(0));

            registrar.setCodigo(codigo);
            registrar.setNome(nome);
            registrar.setTipo(tipo);

            return registrar;
        }

        static void Opcao2(int indexDados, Registros[] dados, Scanner sc) {
            int contadorVendedor = 0;

            System.out.println("Digite o tipo de mercadoria (P – perecível, N – não perecível): ");
            char procurarTipo = Character.toLowerCase(sc.next().charAt(0));
            for (int i = 0; i < indexDados; i++) {
                if (dados[i].getTipo() == procurarTipo) {
                    contadorVendedor++;
                }
            }
            System.out.println("Foram encontrados " + contadorVendedor + " vendedores que comercializam produtos do tipo " + procurarTipo + "!");
        }

        static boolean Opcao3(int indexDados, Registros[] dados, Scanner sc) {
            System.out.println("Digite o nome do vendedor que deseja excluir: ");
            String nomeExcluir = sc.next();
            boolean excluir = false;
            for (int i = 0; i < indexDados; i++) {
                if (dados[i].getNome().equalsIgnoreCase(nomeExcluir)) {
                    for (int j = i; j < indexDados - 1; j++) {
                        dados[j] = dados[j + 1];
                    }

                    excluir = true;
                    break;
                }
            }
            if (excluir) {
                System.out.println("Dado excluído com sucesso!");
            } else {
                System.out.println("Dado não encontrado");
            }
            return excluir;
        }
    }

