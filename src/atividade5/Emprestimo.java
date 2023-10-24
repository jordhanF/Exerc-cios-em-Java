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

public class Emprestimo {
    private String nome;
    private double valor;
    private double juros;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }
}
