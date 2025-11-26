public class Aula04Operadores {
    public static void main (String [] args){
        // + - / *

        int numero01 = 10;
        int numero02 = 20;
        int resultado = numero01 + numero02;

        System.out.println("Resultado: " + numero01 + numero02); // Resultado : 1020
        System.out.println(numero01 + numero02 + " : Resultado"); // 30 : Resultado
        System.out.println("Resultado: " + resultado); // Resultado : 30

        // % resto (o resto da divisão sempre vai ser 0 ou 1
        int resto = 20 %  2;
        System.out.println(resto);

        // < > <= >= == != Logicos AND
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezMenorOuIgualVinte = 10 <= 20;
        boolean isDezMaiorOuIgualVinte = 10>= 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println("è dez maior que vinte? " + isDezMaiorQueVinte);
        System.out.println("è dez menor que vinte? " + isDezMenorQueVinte);
        System.out.println("è dez menor ou igual que vinte? " + isDezMenorOuIgualVinte);
        System.out.println("è dez maior ou  igual que vinte? " + isDezMaiorOuIgualVinte);
        System.out.println("è dez igual a dez? " + isDezIgualDez);
        System.out.println("è dez diferente que dez? " + isDezDiferenteDez);

        // && (AND) || (OR) ! Operadores logicos
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQUetrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQUetrinta " + isDentroDaLeiMaiorQUetrinta);
        System.out.println("isDentroDaLeiMenorQUetrinta " + isDentroDaLeiMenorQueTrinta);

        // Simulando uma compra
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPaystation = 5000F;
        boolean isPaystationCincoCompravel = valorTotalContaCorrente > valorPaystation || valorTotalContaPoupanca > valorPaystation;
        System.out.println("isPaystationCincoCompravel " + isPaystationCincoCompravel);

        // = += -= *= /= %= Atribuição
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        int contador = 0;
        contador ++;  // contador = contador + 1
        contador --; // contador = contador -1
        System.out.println(contador);
    }
}
