package academy.devdojo.maratonajava.javacore.Hexercicio.test;

import academy.devdojo.maratonajava.javacore.Hexercicio.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Hexercicio.dominio.Local;
import academy.devdojo.maratonajava.javacore.Hexercicio.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Hexercicio.dominio.Seminario;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Joao", 18);
        Aluno aluno2 = new Aluno("Maria", 17);
        Aluno aluno3 = new Aluno("Mateus", 20);
        Aluno aluno4 = new Aluno("Juliana", 16);
        Aluno [] alunos = {aluno1, aluno2, aluno3, aluno4};

        Professor professor1 = new Professor("Paulo", "Programação");
        Professor professor2 = new Professor("Lucia", "Matemática");
        Professor professor3 = new Professor("Cloves", "Inglês");
        Professor [] professores = {professor1, professor2, professor3};

        Local local1 = new Local("Estácio - Metrópole");
        Local local2 = new Local("Senac - Reduto");

        Seminario seminario1 = new Seminario("Fundamentos do TI", professores, alunos, local1);
        Seminario seminario2 = new Seminario("Praticas do Calculo", professores, alunos, local2);
        Seminario seminario3 = new Seminario("Itensivão da Computação");
        Seminario [] seminarios = {seminario1, seminario2};
        Seminario [] seminarios1 = {seminario3};

        Aluno aluno5 = new Aluno("Robson", 17, seminario1);
        Aluno aluno6 = new Aluno("Alan", 22, seminario1);


        aluno6.imprime();
        aluno1.imprime();

        professor1.imprime();
        professor1.setSeminario(seminarios);
        professor1.imprime();
        professor2.setSeminario(seminarios1);
        professor2.imprime();

    }
}
