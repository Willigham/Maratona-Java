public class Aula06EstruturaDeRepeticao02 {
    public static void main(String[] args) {

        int n = 0;

        // while
        while (n <= 10) {
            if (n % 2 == 0) {
                System.out.println(n + " Par.");
            }
            n++;

        }

        //while
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 1 ){
                System.out.println(i + " Impar");
            }
        }

    }
}
