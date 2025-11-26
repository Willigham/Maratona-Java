public class Aula05EstruturasCondicionais02 {

    public static void main(String[] args) {

        // idade < 15 categoria infantil
        // idade >= 15 $$ idade < 18 categoria juvenil
        // idade >= 18 categoria adulta

        int idade = 17;
        String categoria;

        if (idade < 15){
            categoria = "categoria Infantil";
        } else if (idade >= 15 && idade < 18){
            categoria = "Categoria Juvenil";
        } else {
            categoria = "Categoria Adulto";
        }

        System.out.println(categoria);
    }
}
