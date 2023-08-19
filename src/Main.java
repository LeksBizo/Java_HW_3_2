public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        int BmiResult =service.calculate(115,1.74);

        System.out.println();
        System.out.println("Ваш показатель BMI составляет "+ BmiResult);
    }
}