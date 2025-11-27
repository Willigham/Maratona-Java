public class Aula07Arrays02 {
    public static void main(String[] args) {


        String [] nomes = new String[4];
        nomes[0] = "Jubileu";
        nomes[1] = "Creza";
        nomes[2] = "Guanabara";
        nomes[3] = "PutiScript";

        // nome.length retorna o tamanho da array
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
