package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;

    public void imprimirDados(){
        System.out.println("-------------");
        System.out.println("Funcionario: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }

    public void mediaSalario(double... salario){
        double soma = 0;
        int quantidadeSalario = 0;
        for (double num: salario){
            quantidadeSalario++;
            soma += num;
            System.out.println(quantidadeSalario + " Salario: " + num);
        }
        double media = soma / quantidadeSalario;
        System.out.println("Media dos Salarios: " + media);
    }
}
