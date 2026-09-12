package academy.devdojo.maratonajava.javacore.Lexercicio.dominio;

public class Seminario {
    private String titulo;
    private Professor [] professores;
    private Aluno [] alunos;
    private Local local;

    public Seminario(){ return; }

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario(String titulo, Professor [] professor) {
        this.titulo = titulo;
        this.professores = professor;
    }

    public Seminario(String titulo, Professor [] professores, Aluno[] alunos) {
        this.titulo = titulo;
        this.professores = professores;
        this.alunos = alunos;
    }

    public Seminario(String titulo, Professor [] professores, Aluno[] alunos, Local local) {
        this.titulo = titulo;
        this.professores = professores;
        this.alunos = alunos;
        this.local = local;
    }

    public void imprime(){
        System.out.println("--- INFORMAÇÕES DO CEMINÁRIO ---");
        System.out.println("Título: " + this.titulo);
        if (this.professores == null) return;
        for (Professor professor : professores) {
            System.out.println("Professor: " + professor.getNome() + " - " + professor.getEspecialidade());
        }
        if (this.alunos == null) return;
        for (Aluno aluno : alunos) {
            System.out.println("Aluno: " + aluno.getNome() + " de " + aluno.getIdade() + " anos.");
        }
        if (this.local == null) return;
        System.out.println("Local: " + local.getEndereco());
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
