import javax.swing.JOptionPane;

public class Caixa {
    public static void main(String[] args) {
        
        //Variaveis de Entrada
        String texto = JOptionPane.showInputDialog("Digite um texto:");

        String InteiroTexto = JOptionPane.showInputDialog("Digite um número inteiro:");
        int Inteiro = Integer.parseInt(InteiroTexto);
        double decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite um número decimal:"));

        //Processamento

        String resposta = "Texto = " + texto +
        "\ninteiro = " + Inteiro +
        "\ndouble = " + decimal;

        JOptionPane.showMessageDialog(null, resposta);

        System.out.println("Texto = "+ texto);
        System.out.println("Inteiro = "+ Inteiro);
        System.out.println("Double = " + decimal);
        //Saída de Dados


    }
}