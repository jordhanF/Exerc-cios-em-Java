package atividade6;
//6) Faça uma aplicação para realizar o cadastro de contas bancárias com as seguintes informações: número da
//conta, nome do cliente e saldo. O banco permitirá o cadastramento de apenas 15 contas e não pode haver mais
//de uma conta com o mesmo número.
//Crie o menu de opções a seguir:
//1. Cadastrar contas (efetuar pesquisa se o número da conta já existe).
//2. Visualizar todas as contas de um determinado cliente (procurar pelo nome).
//3. Excluir a conta com menor saldo (supondo a não existência de saldos iguais).
//4. Sair

public class Banco {
    private String nome;
    private int numeroConta;
    private double saldo;

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
