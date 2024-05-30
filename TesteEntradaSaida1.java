import java.util.Scanner;

public class TesteEntradaSaida1 {
  
    public static void main(String[] args) {
        int i;
        Double d;
        char c;
        Boolean b;
        String s;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um valor inteiro");

        i = sc.nextInt();

        System.out.println("Digite um valor com casas decimais:");

        d = sc.nextDouble();

        System.out.println("Digite o boolean:");

        b = sc.nextBoolean();
        
        System.out.println("o inteiro é:" + i);
        System.out.println("o double é:" + d);
        System.out.println("o boolean é:" + b);

    }
}
