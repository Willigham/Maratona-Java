package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class CalculadoraTest06 {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();

        funcionario01.nome = "Pedro";
        funcionario01.idade = 35;
        funcionario01.salarios = new double[]{1200, 987.32, 2000};
        funcionario01.imprimirDados();
    }


}
