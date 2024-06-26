import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Troco {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

   double conta = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor da Conta:" ));
   double pago = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor Pago:" ));
    
    String resposta = "Valor da Conta = R$" + conta +
            "\nValor Pago = R$" + pago +
            "\n" + calculaTroco(conta, pago) ; 
          JOptionPane.showMessageDialog(null, resposta);

    try {
      System.out.printf("Informe o Valor da Conta: ");
      conta = ler.nextDouble();

      System.out.printf("Informe o Valor Pago....: ");
      pago = ler.nextDouble();

      System.out.printf("%s", calculaTroco(conta, pago));
    }
    catch (InputMismatchException e) {
      System.err.printf("\nErro: dados informados inválidos !!!\n");
    }
  }
 
  public static String calculaTroco(double conta, double pago) {
    DecimalFormat formatador = new DecimalFormat("###,##0.00");
    if (pago < conta)
       return("\nPagamento insuficiente, faltam R$"+
         formatador.format(conta - pago) +"\n");
   else {
      int nota[] = {100, 50, 20, 10, 5, 2, 1};
      int centavos[] = {50, 25, 10, 5, 1};

      String result;
      double troco;
      int i, vlr, ct;

      troco = pago - conta;
      result ="\nTroco = R$" + formatador.format(troco) +"\n\n";

// definindo as notas do troco (parte inteira)
      vlr = (int)troco;
      i = 0;
      while (vlr != 0) {
        ct = vlr / nota[i]; // calculando a qtde de notas
        if (ct != 0) {
           result = result + (ct +"nota(s) de R$" + nota[i] +"\n");
           vlr = vlr % nota[i]; // sobra
        }
        i = i + 1; // próxima nota
      }

      result = result +"\n";

// definindo os centavos do troco (parte fracionária)
      vlr = (int)Math.round((troco - (int)troco) * 100);
      i = 0;
      while (vlr != 0) {
        ct = vlr / centavos[i]; // calculando a qtde de moedas
        if (ct != 0) {
           result = result + (ct +"moeda(s) de"+ centavos[i] +
           "centavo(s)\n");
           vlr = vlr % centavos[i]; // sobra
        }
        i = i + 1; // próximo centavo
      }

      return(result);
    }
  }

   
}






























//Exercício das Moedas
//Instruções
//Você deve criar um processamento usando matemática para organizar o troco no menor numero de notas possíveis.

//Vocês devem entregar o código Java funcionando.

//#########################################
//Entrada:
 //Variável do tipo Inteiro recebendo o Valor total de troco.
//Os valores de entrada podem variar entre 0 e 1000000000;

//Processamento: 
//Calculo para encontrar o menor conjunto de Notas possíveis;

//Saída:
//Uma mensagem para o usuário no seguinte formato.

//Notas de 100: x
//Notas de 50: x
//Notas de 20: x
//Notas de 10: x
//Notas de 5: x
//Notas de 2: x 
//Moedas de 1: x