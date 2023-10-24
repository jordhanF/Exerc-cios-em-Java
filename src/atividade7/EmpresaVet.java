package atividade7;


public class EmpresaVet {

    Cadastro[] empresa = new Cadastro[18];
    int index = 0;


    public void cadastrar(String nome, int horas, char categoria){

        Cadastro cadastro = new Cadastro();
        if (index<18){
            cadastro.setNome(nome);
            cadastro.setHoras(horas);
            cadastro.setCategoria(categoria);

            empresa[index]=cadastro;

            index++;
            System.out.println("Funcionário cadastrado com sucesso! ");
        }else {
            System.out.println("Limite de funcionários atingido! ");
        }
    }


    public void alterarHoras(String nomeP, int novaHora){

        boolean checar = true;
        for (int i = 0; i<index; i++){
            Cadastro funcionario = empresa[i];
            if (nomeP.equals(funcionario.getNome())){
                funcionario.setHoras(novaHora);
                checar = false;
                System.out.println("Horas alterada com sucesso! ");
                break;
            }
        }
        if (checar){
            System.out.println("Funcionário não encontrado! ");
        }
    }

    public void salarioBruto(){

        double salarioTotal;
        double salarioAcrescimo =0;


        for (int i = 0; i<index; i++){
            Cadastro funcionario = empresa[i];

            if (funcionario.getCategoria() == 'o'){
                salarioTotal = funcionario.getHoras()*112;
                salarioAcrescimo = salarioTotal + (salarioAcrescimo*0.1);
            }
            if (funcionario.getCategoria() == 'g'){
                salarioTotal = funcionario.getHoras()*112;
                salarioAcrescimo = salarioTotal + (salarioAcrescimo*0.15);
            }

            System.out.println("\nO salário bruto do funcionário "+funcionario.getNome()+" é de: "+ salarioAcrescimo+"R$.\n");

        }


    }


}
