import java.util.Scanner;

public class OtherLoop {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        double average = 0;
        double rating = 0;
        int totalNumberOfRating = 0;

        while (rating != -1) {
            System.out.println("Digite a sua avaliação para o filme: ");
            rating = reading.nextDouble();

            if (rating != -1){
                average +=  rating;
                totalNumberOfRating++;
            }
        }

        System.out.println("Média de avaliações: " + average/totalNumberOfRating);

    }
}
