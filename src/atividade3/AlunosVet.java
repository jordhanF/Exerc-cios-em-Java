package atividade3;


class AlunosVet {

    Alunos[] aluno = new Alunos[500];
    int quantidadeAluno= 0;
    int media1 = 6;
    int media2 = 6;
    double mediaAritmetica = 0;

    public void Incluir(int matricula, String nome, double nota1, double nota2){

        if (quantidadeAluno<500) {
            Alunos inserir = new Alunos();

            inserir.setMatricula(matricula);
            inserir.setNome(nome);
            inserir.setNota1(nota1);
            inserir.setNota2(nota2);


            aluno[quantidadeAluno] = inserir;
            quantidadeAluno++;
            System.out.println("Aluno cadastrado! ");

        }else {
            System.out.println("Limite de alunos atingido!");
        }

    }

    public void Consultar(){

        int contadorReprovados =0;
        for (int i = 0; i<quantidadeAluno; i++){
            Alunos repetente = aluno[i];
            if (repetente.getNota1()<media1 && repetente.getNota2()<media2){
                System.out.println("\nAluno: "+ repetente.getNome()+ "\nMatrícula: "+repetente.getMatricula()+ "\nReprovado!");
                contadorReprovados++;
            }

        }
        if (contadorReprovados==0){
            System.out.println("Nenhuma aluno reprovado! ");
        }
    }

    public void MediaAritmetica(){

        for (int i = 0; i<quantidadeAluno; i++ ){
            Alunos media = aluno[i];
            mediaAritmetica = (media.getNota1() + media.getNota2())/2;

            System.out.println("\nMédia aritmética do aluno "+media.getNome()+" é de " +mediaAritmetica+" pontos!");

        }
    }

}
