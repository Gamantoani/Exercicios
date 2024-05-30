import javax.swing.JOptionPane;

public class Parouimpar {
    public static void main(String[] args) {
        // digite os dois valores
        String inputNum1 = JOptionPane.showInputDialog("Digite o primeiro número inteiro:");
        int num1 = Integer.parseInt(inputNum1);

        String inputNum2 = JOptionPane.showInputDialog("Digite o segundo número inteiro:");
        int num2 = Integer.parseInt(inputNum2);

        // Calcular a soma
        int soma = num1 + num2;

        // par ou ímpar
        if (soma % 2 == 0) {
            JOptionPane.showMessageDialog(null, "O número " + soma + " é par.");
        } else {
            JOptionPane.showMessageDialog(null, "A número " + soma + " é impar.");
        }
    }
}
