package atividade5;

public class VetEmprest {

    Emprestimo[] banco = new Emprestimo[1500];
    int indexV = 0;
    double jurosAPagar = 0;

    public void Cadastrar(String nome, double valor, double taxaJuros) {
        boolean checarCadastro = true;

        Emprestimo cadastrar = new Emprestimo();

        if (indexV<1500) {

            for (int i = 0; i < indexV; i++) {
                Emprestimo nomeIgual = banco[i];

                if (nomeIgual.getNome().equals(nome)) {
                    System.out.println("Usuário já cadastrado! ");
                    checarCadastro = false;
                    break;
                }
            }

            if (checarCadastro) {
                cadastrar.setNome(nome);
                cadastrar.setValor(valor);
                cadastrar.setJuros(taxaJuros);

                banco[indexV] = cadastrar;
                indexV++;
                System.out.println("Cliente cadastrado com sucesso!");
            }
        }else {
            System.out.println("Limite de clientes atingido! ");
        }
    }

    public void calcJuros(){

        for (int i = 0; i<indexV; i++ ){
            Emprestimo media = banco[i];
            jurosAPagar = media.getJuros() * media.getValor();

            System.out.println("\nO total de juros a pagar de "+media.getNome()+" é de " +jurosAPagar+" reais! \nSabendo que nossa taxa de juros é de 10%");

        }
    }

    public void AlterarJuros(double novoJuros){

        double comparar = banco[0].getValor();

        for (int i = 0; i<indexV; i++){
            if (banco[i].getValor()>comparar){
                comparar = banco[i].getValor();
                banco[i].setJuros(novoJuros/100);
            }
        }

        System.out.println("Valor atualizado! ");



    }

}
