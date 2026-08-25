package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome = null;
    public int idade = 0;
    public double[] salarios = null;

    public void imprimirDados() {
        System.out.println("-------------");
        System.out.println("Funcionario: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (salarios == null) {
            return;
        }
        for (double salario : salarios) {
            System.out.println("Salario: " + salario);
        }

        mediaSalario();
    }

    public void mediaSalario() {
        if (salarios == null) {
            return;
        }
        double media = 0;
        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.println("Média salarial: " + media);
    }
}
