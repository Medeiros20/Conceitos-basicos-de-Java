import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");
        String movie = reading.nextLine();
        System.out.println("Digite o ano de lançamento do seu filme preferido: ");
        int yearOfRelease = reading.nextInt();
        System.out.println("Diga a sua avaliação de 0 a 10 para o filme: ");
        double filmReview = reading.nextDouble();

        System.out.println(movie);
        System.out.println(yearOfRelease);
        System.out.println(filmReview);
    }
}
