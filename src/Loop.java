import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        double average = 0;
        double rating = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite a sua avaliação para o filme: ");
            rating = reading.nextDouble();
            average +=  rating;
        }

        System.out.println("Média de avaliações: " + average/3);

    }
}
