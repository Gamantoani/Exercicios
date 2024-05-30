import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) {

        String menuEscolha = JOptionPane.showInputDialog("Menu Calculadora:"
                + "\n 1 - Soma"
                + "\n 2 - Subtração"
                + "\n 3 - Multiplicação"
                + "\n 4 - Divisão");

        String primeiroValor = "";
        String segundoValor = "";
        double valor1 = 0;
        double valor2 = 0;

        double resultado = 0;
        switch (menuEscolha.toLowerCase()) {

            case "soma":
            case "1":
                primeiroValor = JOptionPane.showInputDialog("Digite o primeiro valor da soma");
                segundoValor = JOptionPane.showInputDialog("Digite o segundo valor da soma");
                valor1 = Double.parseDouble(primeiroValor);
                valor2 = Double.parseDouble(segundoValor);
                resultado = valor1 + valor2;
                break;

            case "subtração":
            case "2":
                primeiroValor = JOptionPane.showInputDialog("Digite o primeiro valor da subtração");
                segundoValor = JOptionPane.showInputDialog("Digite o segundo valor da subtração");
                valor1 = Double.parseDouble(primeiroValor);
                valor2 = Double.parseDouble(segundoValor);
                resultado = valor1 - valor2;
                break;

            case "multiplicação":
            case "3":
                primeiroValor = JOptionPane.showInputDialog("Digite o primeiro valor da multiplicação");
                segundoValor = JOptionPane.showInputDialog("Digite o segundo valor da multiplicação");
                valor1 = Double.parseDouble(primeiroValor);
                valor2 = Double.parseDouble(segundoValor);
                resultado = valor1 * valor2;
                break;

            case "divisão":
            case "4":
                primeiroValor = JOptionPane.showInputDialog("Digite o dividendo");
                segundoValor = JOptionPane.showInputDialog("Digite o divisor");
                valor1 = Double.parseDouble(primeiroValor);
                valor2 = Double.parseDouble(segundoValor);
                resultado = valor1 / valor2;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Menu não encontrado.");
                break;
        }

        JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);

    }
}