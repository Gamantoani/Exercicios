import java.util.Scanner;

public class Media {

  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite nota A1");
        double A1 = scanner.nextDouble();
        System.out.println("Digite nota A2");
        double A2 = scanner.nextDouble();
        System.out.println("Digite nota A3");
        double A3 = scanner.nextDouble();
        
        double media = (A1 + A2 + A3) / 3;
        
        System.out.println("A média do aluno é:" + media);
    }
}