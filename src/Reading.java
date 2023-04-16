import java.util.Scanner;

public class Reading {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in); //system.in rastreia se houve alguma interação no teclado

        System.out.println("Digite seu filme favorito: ");
        String movie = reading.nextLine();

        System.out.println("Qual o ano de lançamento? ");
        int releaseYear = reading.nextInt();

        System.out.println("Diga a sua avaliação para o filme: ");
        double rating = reading.nextDouble();

        System.out.println(movie);
        System.out.println(releaseYear);
        System.out.println(rating);
    }
}
