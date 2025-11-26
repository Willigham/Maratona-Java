public class Aula06EstruturaDeRepeticao01 {
    public static void main(String[] args) {

        // While, do while, for

        //while
        int count = 0;
        while (count < 10){
            System.out.println("While "+ ++count);
        }

        // do while
        count = 0;
        do {
            System.out.println("do while " + ++count);

        } while (count < 10);

        // for
        for (int i = 0; i < 10; i++ ){
            System.out.println("for " + i);
        }
    }
}
