package atividade7;
//7) Uma empresa possui um cadastro de funcionários com os seguintes dados: nome, número de horas
//trabalhadas no mês e categoria (pode ser O - Operário ou G-gerente). Sabendo-se que essa empresa deseja
//informatizar sua folha de pagamento. Faça um programa que:
//a) Cadastre os dados dos funcionários. O máximo que a empresa suporta são 18 funcionários ativos;
//b) Alterar o número de horas trabalhadas de um determinado funcionário;
//c) Mostrar todos os dados dos funcionários e seus respectivos salários brutos. Para calcular o salário bruto
//adote o valor de R$112,00 para uma hora trabalha + acréscimo da categoria do funcionário. Ver tabela
//abaixo:
public class Cadastro {

    private String nome;
    private int horas;
    private char categoria;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }
}
