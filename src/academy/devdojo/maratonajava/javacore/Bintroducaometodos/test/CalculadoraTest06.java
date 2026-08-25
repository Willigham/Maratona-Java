package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class CalculadoraTest06 {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();

        double [] salario  = {150, 8, 5, 4};

        funcionario01.nome = "Pedro";
        funcionario01.idade = 35;
        funcionario01.imprimirDados();
        funcionario01.mediaSalario(salario);
    }


}
