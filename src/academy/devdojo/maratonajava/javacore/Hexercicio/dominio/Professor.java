package academy.devdojo.maratonajava.javacore.Hexercicio.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario [] seminario;

    public Professor(){ return; }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminario) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminario = seminario;
    }

    public void imprime(){
        System.out.println("--- DADOS DO PROFESSOR ---");
        System.out.println("Professor: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        if (seminario == null) return;
        for (Seminario seminarios : seminario) {
            System.out.println("Seminario: " + seminarios.getTitulo());
        }

    }

    public Seminario[] getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario[] seminario) {
        this.seminario = seminario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
