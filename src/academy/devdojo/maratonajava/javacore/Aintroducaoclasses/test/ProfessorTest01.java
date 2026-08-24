package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Mestre Kami";
        professor.idade = 40;
        professor.sexo = 'M';

        System.out.println("Nome: " + professor.nome + "\n"+ "Idade: " + professor.idade + "\n" + "Sexo: " + professor.sexo);

    }
}
