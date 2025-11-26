public class Aula06EstruturaDeRepeticao05 {
    public static void main(String[] args) {

        //dado o valor de um carro, descubra quantas vezes ele por ser parcelado
        // condição valorParcela >= 1000

        double valorTotal = 30000;
        for (int parcela = (int) valorTotal; parcela >= 1 ; parcela--) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000){
                continue;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
    }
}
