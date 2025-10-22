import java.util.Arrays;

public class Main {

    //As variaveis foram declaradas em inglês!!!

    public static void main (String[] args){
        System.out.println("Esse é o screen match");
        System.out.println("Filme: Top Gun: Maverick");

        int yearOfRelease = 2022; //variavel ano de lançamento
        System.out.println("Ano de lançamento: " + yearOfRelease);
        boolean includedInPlan = true;
        double ratingMovie = 8.1;

        double filmReview = (9.8 + 6.3 + 8.0) / 3; //avaliação do filme
        System.out.println("A média do filme é " + filmReview);

        String synopsis; //sinopse do filme
        synopsis = "Filme de aventura com o Tom Cruise";

        System.out.println(synopsis);

        int classification = (int) (filmReview /2);
        System.out.println("A classificação do filme em estrelas: " + classification);
    }
}
