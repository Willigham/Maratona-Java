package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int [] episodios;
    static { // se acrescentar Static, é executado quandoa JVM carregar a classe, eles serão executados apenas uma vez no codigo
        // Bloco de inicialização - ele é executado antes do contrutor
        System.out.println("Dentro do blobo de inicialização");
    }
    public Anime(){
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++){
            episodios[i] = i+1;
        }
        for (int episodio : Anime.episodios){
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}


