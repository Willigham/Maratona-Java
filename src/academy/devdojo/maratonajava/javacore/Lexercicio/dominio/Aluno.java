package academy.devdojo.maratonajava.javacore.Lexercicio.dominio;

public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminario;

    public Aluno(){
        return;
    }

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Aluno(String nome, int idade, Seminario seminario) {
        this.nome = nome;
        this.idade = idade;
        this.seminario = seminario;
    }

    public void imprime(){
        System.out.println("--- DADOS DO ALUNO ---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (seminario == null){
            System.out.println("Esse aluno ainda nao tem Seminário!");
            return;
        }
        System.out.println("Seminário Inscrito: " + seminario.getTitulo());
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
