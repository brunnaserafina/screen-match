public class Conditional {
    public static void main(String[] args) {
        int releaseYear = 1990;
        boolean includeInPlan = false;
        String planType = "plus";

        if (releaseYear >= 2022){
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        if (includeInPlan == true || planType.equals("plus")){
            System.out.println("Filme liberado");
        } else {
            System.out.println("Deve pagar a locação");
        }
    }
}
