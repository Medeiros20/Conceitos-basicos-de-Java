import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        double filmReview = 0;
        double average = 0;


        for (int i = 0; i < 3; i++) {
            System.out.println("Diga a sua avaliação de 0 a 10 para o filme: ");
            filmReview = reading.nextDouble();
            average += filmReview;
        }

        System.out.println("Media de avaliação " + average/3);

    }
}
