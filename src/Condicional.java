import java.util.Arrays;

public class Condicional {
    public static void main(String[] args) {
        int yearOfRelease = 2022;
        double filmReview = (9.8 + 6.3 + 8.0) / 3;
        int classification = (int) (filmReview /2);
        boolean includedInPlan = true;
        String typePlan = "Plus";

        if (yearOfRelease > 2022){
            System.out.println("O filme foi lançado recentemente\n!");
        }else {
            System.out.printf("O filme não foi recem lançado\n");
        }

        //Operador || indica o OU e o && indica a operação E
        if(includedInPlan == true && typePlan.equals("Plus")){
            System.out.printf("Filme liberado!");
        }else{
            System.out.printf("Deve pagar o aluguel!");
        }
    }
}
