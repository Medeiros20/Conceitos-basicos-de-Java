import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        double filmReview = 0;
        double average = 0;
        int totalReview = 0;


        while (filmReview != -1) {
            System.out.println("Diga a sua avaliação de 0 a 10 para o filme ou digite -1 para sair: ");
            filmReview = reading.nextDouble();

            if(filmReview != -1){
                average += filmReview;
                totalReview ++;
            }else{
                totalReview = totalReview;
            }

        }
        System.out.println("Media de avaliação " + average/totalReview);
    }
}
