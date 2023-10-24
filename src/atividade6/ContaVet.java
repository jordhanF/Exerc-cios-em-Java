package atividade6;

public class ContaVet {

    Banco[] conta = new Banco[15];
    int indexC = 0;

    public void cadastrar(int nConta, String nome, double saldo){

        Banco cadastro = new Banco();
        boolean checarCadastro = true;

        if (indexC<15) {

            for (int i = 0; i < indexC; i++) {
                Banco contaIgual = conta[i];

                if (contaIgual.getNumeroConta() == nConta) {
                    System.out.println("Usuário já cadastrado! ");
                    checarCadastro = false;
                    break;
                }
            }

            if (checarCadastro) {
                cadastro.setNome(nome);
                cadastro.setNumeroConta(nConta);
                cadastro.setSaldo(saldo);

                conta[indexC] = cadastro;
                indexC++;
                System.out.println("Cliente cadastrado com sucesso!");
            }
        }else {
            System.out.println("Limite de clientes atingido! ");
        }
    }

    public void consultar(String nomeBusca){
        boolean checarP = true;
        for (int i = 0; i < indexC; i++) {
            if (conta[i].getNome().equalsIgnoreCase(nomeBusca)) {
                System.out.println("Conta: " + conta[i].getNumeroConta() + "\nSaldo: " + conta[i].getSaldo()+"R$.");
                checarP = false;
            }
        }
        if (checarP){
            System.out.println("Usuário não encontrado! ");
        }
    }

    public void excluirMenor(){

        double menorValor = conta[0].getSaldo();

        for (int i = 0; i<indexC; i++){
            if (conta[i].getSaldo()<menorValor){
                menorValor = conta[i].getSaldo();

                conta[i].setNumeroConta(0);
                conta[i].setSaldo(0);
                conta[i].setNome(null);
                indexC--;
                System.out.println("Usuário excluído com sucesso! ");
            }
        }
    }
}
