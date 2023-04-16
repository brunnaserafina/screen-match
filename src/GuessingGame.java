import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        int randomNumber = new Random().nextInt(100);

        for(int i = 0; i < 5; i++ ){
            Scanner reading = new Scanner(System.in);
            System.out.println("Advinhe o número entre zero e 100: ");
            int numberUser = reading.nextInt();

            if (numberUser == randomNumber){
                System.out.println("Parabéns! Você advinhou o número em " + i + " tentativas.");
                break;
            } else if(numberUser < randomNumber){
                System.out.println("O número digitado é menor que o número que você deve advinhar");
            } else {
                System.out.println("O número digitado é maior que o número que você deve advinhar");
            }

            if (i == 4){
                System.out.println("Infelizmente você não conseguiu acertar. O número era " + randomNumber);
            }
        }
    }
}
