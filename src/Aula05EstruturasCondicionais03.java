import java.security.Signature;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {

        // operador ternario
        double salario = 6000;
        String mendagemDoar = "Eu vou doar 500 pro Jubileu";
        String mensagemNãoDoar = "Não tenho dinheiro ainda pra doar para o jubileu";
        
        // (condicao) ? verdadeiro : falso
        String resultado = salario > 5000 ? mendagemDoar : mensagemNãoDoar;
        String resultado2 = salario > 5000 ? "Eu vou doar 500 pro Jubileu" : "Não tenho dinheiro ainda pra doar para o jubileu";

        System.out.println(resultado);
    }   
}
