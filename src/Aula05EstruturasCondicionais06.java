public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {

        // Utilizando Swich e dados os valores de 1 a 7, imprima se é dia Útil ou finald e semana
        // Considerando 1 como Domingo

        byte dia = 8;

        switch (dia){
            case 1:
                System.out.println("Domingo - Final de semana");
                break;
            case 2:
                System.out.println("Segunda - Dia Útil");
                break;
            case 3:
                System.out.println("Terça - Dia Útil");
                break;
            case 4:
                System.out.println("Quarta - Dia Útil");
                break;
            case 5:
                System.out.println("Quinta - Dia Útil");
                break;
            case 6:
                System.out.println("Sexta - Dia Útil");
                break;
            case 7:
                System.out.println("Sábado - Final de semana");
                break;
            default:
                System.out.println("Dia Inválido");
        }

        // Outra forma de usa o switch
        switch (dia){
            case 1:
            case 7:
                System.out.println("Final de Semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia Útil");
                break;
            default:
                System.out.println("Opção inválida");
        };

    }


}
