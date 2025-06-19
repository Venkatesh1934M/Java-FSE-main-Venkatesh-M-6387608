import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double principle=sc.nextDouble();
        double rate=sc.nextDouble();
        int years=sc.nextInt();
        double value_at_n=FinancialForcast.findfuturevalue(principle, rate, years);
        System.out.println("Principle at year "+years+" is"+value_at_n);
    }
}
