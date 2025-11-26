public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {

        int idade = 20;
        boolean isAutorizadoComprarBedida = idade >= 18;

        if (isAutorizadoComprarBedida){
            System.out.println("Autorizado a comprar bebida alcólica");
        } else {
            System.out.println("Não autorizado a comprar bedida");
        }

        // negando !
        if (!isAutorizadoComprarBedida){
            System.out.println("Autorizado a comprar bebida alcólica");
        }

        System.out.println("Fora do if");
    }
}
