import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) {
        // Variaveis de Entrada
        String texto = JOptionPane.showInputDialog("Digite um texto.");

        String inteiroTexto = JOptionPane.showInputDialog("Digite um numero inteiro.");
        int inteiro = Integer.parseInt(inteiroTexto);

        double decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero decimal."));

        // Processamento
        String resposta = "Texto = " + texto + "\nInteiro = " + inteiro + "\nDouble = " + decimal;

        JOptionPane.showMessageDialog(null, resposta);

        // Saida de dados
    }
}
