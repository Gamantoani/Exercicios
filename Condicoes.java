import javax.swing.JOptionPane;
import java.util.Scanner;

public class Condicoes {

    public static void main(String[] args) {

        // 1. Sabendo que A=3, B=7 e C=4, informe se as expressões abaixo são
        // verdadeiras ou falsas: a) (A+C) > B ; b) B >= (A + 2) ; c) C == (B –A) ; d)
        // (B + A) <= C ; e) (C+A) > B.

        int A = 3;
        int B = 7;
        int C = 4;

        System.out.println((A + C) > B);
        System.out.println(B >= (A + 2));
        System.out.println(C == (B - A));
        System.out.println((B + A) <= C);
        System.out.println((C + A) > B);

        // 2. Sabendo que A=5, B=4, C=3 e D=6, informe se as expressões abaixo são
        // verdadeiras ou falsas: a) (A > C) && (C <= D); b) (A+B) > 10 || (A+B) ==
        // (C+D); c) (A>=C) && (D >= C).

        int a = 5;
        int b = 4;
        int c = 3;
        int d = 6;

        System.out.println((a > c) && (c <= d));
        System.out.println((a + b) > 10 || (a + b) == (c + d));
        System.out.println((a >= c) && (d >= c));

        // 3. Ler um número e verificar se ele é par ou ímpar.

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número"));

        if ((numero % 2) == 0) {
            System.out.println("O número " + numero + " é par");
        }

        else {
            System.out.println("O número " + numero + " é ímpar");

        }

        // 4. Tendo como dados de entrada a altura (h) e o sexo de uma pessoa (um
        // caracter m ou f), construir um programa que calcula seu peso ideal,
        // utilizando as seguintes fórmulas: Para homens: (72.7*h) - 58; Para mulheres:
        // (62.1*h) - 44.7

        Scanner entrada = new Scanner(System.in);
        double Altura, PesoIdeal;
        char Sexo = 'n';
        System.out.print("Digite sua altura (em metros): ");
        Altura = entrada.nextDouble();

        while (Sexo != 'm' && Sexo != 'M' && Sexo != 'h' && Sexo != 'H') {

            System.out.print("Digite H ou M para especificar o sexo: "); // o/
            Sexo = entrada.next(".").charAt(0);

            switch (Sexo) {
                case 'h':
                case 'H':
                    PesoIdeal = (72.7 * Altura) - 58;
                    System.out.println("Seu peso ideal é de: " + PesoIdeal + " kg.");
                    break;
                case 'm':
                case 'M':
                    PesoIdeal = (62.1 * Altura) - 44.7;
                    System.out.println("Seu peso ideal é de: " + PesoIdeal + " kg.");
                    break;
                default:
                    System.out.println("Não é M");
            }

        }

        // 5. Fazer um programa que recebe três números inteiros, calcula e mostra a
        // soma desses números

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero1 = teclado.nextInt();

        System.out.println("Digite outro número: ");
        int numero2 = teclado.nextInt();

        System.out.println("Digite o último número: ");
        int numero3 = teclado.nextInt();

        int soma = numero1 + numero2 + numero3;

        System.out.println("A soma dos três números é de: " + soma);

        // 6. Fazer um programa que recebe três notas, calcula e mostra a média
        // aritmética dessas notas.
        Scanner notas = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = notas.nextDouble();

        System.out.println("Digite a segunda nota:");
        double nota2 = notas.nextDouble();

        System.out.println("Digite a teceira nota");
        double nota3 = notas.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A média de notas é de: " + media);

        // 7. Fazer um programa que calcula e mostra a área de um triângulo, sabendo
        // que: área = (base * altura) / 2.

        Scanner triangulo = new Scanner(System.in);

        System.out.println("Digite a base do triângulo");
        double base = triangulo.nextDouble();

        System.out.println("Digite a altura do triângulo");
        double altura = triangulo.nextDouble();

        double area = (base * altura) / 2;

        System.out.println("A área do triângulo: " + area);

        // 8. Fazer um programa que calcula e mostra a área de um círculo, sabendo que:
        // área = pi * r2.
        Scanner circulo = new Scanner(System.in);

        System.out.println("Digite o raio do círculo: ");

        double raio = circulo.nextDouble();

        double Area = Math.PI * Math.pow(raio, 2);

        System.out.println("A área do círculo é: " + Area);

        // 9. Fazer um programa que recebe um número positivo, calcula e mostra: a) O
        // número digitado ao quadrado; b) O número digitado ao cubo; c) A raiz quadrada
        // do número digitado.

        Scanner positivo = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double num = positivo.nextDouble();

        System.out.println("O número " + num + " elevado ao quadrado é: " + Math.pow(num, 2) +
                ", elevado ao cubo: " + Math.pow(num, 3) + " e sua raíz quadrada: " + Math.sqrt(num));

        // 10. Fazer um programa que recebe o preço de um produto, calcula e mostra o
        // novo preço sabendo-se que este sofreu um desconto de 10%.

        Scanner desconto = new Scanner(System.in);

        System.out.println("Digite o valor do produto");
        double valor = (desconto.nextDouble()) * 0.9;

        System.out.println("O preço final com desconto de 10% é " + valor);

        // 11. Fazer um programa que recebe o salário-base de um funcionário, calcula e
        // mostra o salário a receber, sabendo-se que esse funcionário tem gratificação
        // de 5% sobre o salário-base e paga imposto de 7% sobre o salário-base.

        Scanner funcionario = new Scanner(System.in);

        System.out.println("Digite o salário base");
        double salario = funcionario.nextDouble();

        double gratificacao = salario * 1.05;
        double desc = salario * 0.7;

        double salarioFinal = (gratificacao + desc) - salario;

        System.out.println("O salário final é: " + salarioFinal);

        // 12. Fazer um programa que recebe o salário de um funcionário e o percentual
        // de aumento, calcula e mostra o valor do aumento e o novo salário.

        Scanner money = new Scanner(System.in);

        System.out.println("Digite o valor do salario: ");
        double pagament = money.nextDouble();

        System.out.println("Digite o percentual de aumento: ");
        double porcentagem = money.nextDouble();
        double aumento = porcentagem / 100;

        double finalpay = (pagament * aumento) + pagament;
        String result = String.format("%.2f", finalpay);

        System.out.println(
                "O salário de R$" + pagament + " com o aumento de " + porcentagem + "% resulta em: R$" + result);

        /// 13. A nota final de um estudante é calculada a partir de três notas
        /// atribuídas respectivamente a um trabalho de laboratório, à avaliação
        /// semestral e a um exame final. A média das três notas
        // mencionadas anteriormente obedece aos pesos a seguir:
        // NOTA PESO
        // Trabalho de laboratório 2
        // Avaliação semestral 3
        // Exame final 5

        System.out.println("Digite a nota do trabalho de laboratório: ");
        double notaLab = (teclado.nextDouble()) * 2;

        System.out.println("Digite a nota da avaliação semestral: ");
        double notaAva = (teclado.nextDouble()) * 3;

        System.out.println("Digite a nota do exame final: ");
        double notaExa = (teclado.nextDouble()) * 5;

        double media1 = (notaLab + notaAva + notaExa) / 3;

        System.out.println("A média final é: " + media1);

        // 14. Fazer um programa que recebe dois números e mostra o maior.
        Scanner maior = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = maior.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = maior.nextInt();

        if (num1 > num2) {
            System.out.println("O maior número digitado foi: " + num1);
        } else if (num2 > num1) {
            System.out.println("O maior número digitado foi: " + num2);
        }

        // 15. Fazer um programa que recebe três números e mostra-os em ordem crescente.

        Scanner crescente = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num11 = crescente.nextInt();

        System.out.println("Digite o segundo número: ");
        int num22 = crescente.nextInt();

        System.out.println("Digite o teceiro número: ");
        int num3 = crescente.nextInt();

        if ((num11 > num22) && (num11 > num3) && (num22 > num3)) {
            System.out.println("A ordem crescente dos número digitados é: " + num3 + ", " + num22 + " e " + num11);
        } else if ((num11 > num22) && (num11 > num3) && (num22 < num3)) {
            System.out.println("A ordem crescente dos número digitados é: " + num22 + ", " + num3 + " e " + num11);
        } else if ((num22 > num11) && (num22 > num3) && (num11 > num3)) {
            System.out.println("A ordem crescente dos número digitados é: " + num3 + ", " + num11 + " e " + num22);
        } else if ((num22 > num11) && (num22 > num3) && (num11 < num3)) {
            System.out.println("A ordem crescente dos número digitados é: " + num11 + ", " + num3 + " e " + num22);
        } else if ((num3 > num22) && (num22 > num11) && (num3 > num11)) {
            System.out.println("A ordem crescente dos número digitados é: " + num11 + ", " + num22 + " e " + num3);
        } else {
            System.out.println("A ordem crescente dos número digitados é: " + num3 + ", " + num11 + " e " + num22);
        }

        // 16. Fazer um programa que recebe três números inteiros em ordem crescente e
        // um quarto número também inteiro que não siga esta regra. Mostra, em seguida,
        // os quatro números em ordem crescente.
        Scanner crescente2 = new Scanner(System.in);

        System.out.println("Digite o primeiro número da ordem crescente: ");
        int num111 = crescente2.nextInt();

        System.out.println("Digite o segundo número da ordem crescente: ");
        int num222 = crescente2.nextInt();

        System.out.println("Digite o terceiro número em ordem crescente: ");
        int num333 = crescente2.nextInt();

        System.out.println("Digite o quarto número aleatório: ");
        int num4 = crescente2.nextInt();

        if (num4 > num333) {
            System.out.println(
                    "A ordem crescente dos números é: " + num111 + ", " + num222 + ", " + num333 + " e " + num4);
        } else if (num4 > num222) {
            System.out.println(
                    "A ordem crescente dos números é: " + num111 + ", " + num222 + ", " + num4 + " e " + num333);
        } else if (num4 < num111) {
            System.out.println(
                    "A ordem crescente dos números é: " + num4 + ", " + num111 + ", " + num222 + " e " + num333);
        } else {
            System.out.println(
                    "A ordem crescente dos números é: " + num111 + ", " + num4 + ", " + num222 + " e " + num333);
        }

        // 17. Ler uma temperatura em graus Celsius e apresentá-la convertida em graus
        // Fahrenheit. A fórmula de conversão é: F = C∗(9.0/5.0)+32.0, sendo F a
        // temperatura em Fahrenheit e C a temperatura em Celsius.

        Scanner temperatura = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Celsius (ºC): ");
        double c1 = temperatura.nextDouble();

        double f = c1 * (9.0 / 5.0) + 32.0;

        System.out.println("A temperatura convertida para Fahrenheit é: " + f);

        // 18. Ler um valor em real e a cotação do dólar. Em seguida, exibir o valor
        // correspondente em dólares.
        Scanner americano = new Scanner(System.in);

        System.out.println("Digite o valro em reais: ");
        double real = americano.nextDouble();

        double dolar = real * 4.98;

        System.out.println("A conversão de real para dólar ($5,47) é: " + dolar);

        // 19. Ler um número inteiro e exibir o seu antecessor e o seu sucessor.
        Scanner antsuc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numint = antsuc.nextInt();

        int antecessor = numint - 1;
        int sucessor = numint + 1;

        System.out.println(
                "O número digitado é: " + numint + ", seu antecessor " + antecessor + " e sucessor " + sucessor);

        // 20. Usando switch-case, escrever um programa que lê um inteiro entre 1 e 7 e
        // exibe o dia da semana correspondente a esse número. Isto é, domingo se 1,
        // segunda-feira se 2, e assim por diante.
        Scanner semana = new Scanner(System.in);

        System.out.println("Digite um número para saber seu correspondente em dia da semana:");
        int dia = semana.nextInt();

        switch (dia) {
            case 1:
                System.out.println("O número indica o dia: domingo");
                break;
            case 2:
                System.out.println("O número indica o dia: segunda-feira");
                break;
            case 3:
                System.out.println("O número indica o dia: terça-feira");
                break;
            case 4:
                System.out.println("O número indica o dia: quarta-feira");
                break;
            case 5:
                System.out.println("O número indica o dia: quinta-feira");
                break;
            case 6:
                System.out.println("O número indica o dia: sexta-feira");
                break;
            case 7:
                System.out.println("O número indica o dia: sábado");
                break;
            default:
                System.out.println("Opção inválida");
        }

        // 21. Sabe-se que um ano é bissexto se for divisível por 400 ou se for
        // divisível por 4 e não for divisível por 100. Por exemplo: 1988, 1992, 1996,
        // 2020. Determinar se um determinado ano lido é bissexto.
        Scanner bisexto = new Scanner(System.in);

        System.out.println("Digite um ano para saber se ele é bissexto: ");
        int ano = bisexto.nextInt();

        if (ano % 400 == 0) {
            System.out.println("O ano " + ano + " é bissexto");
        } else if ((ano % 4 == 0) && (ano % 100 != 0)) {
            System.out.println("O ano " + ano + " é bissexto");
        } else {
            System.out.println("O ano " + ano + " não é bissexto");
        }
    }

}