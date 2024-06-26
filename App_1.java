/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package JogoPersonagem;

import java.util.Random;
import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) {

        /*
        Personagem heroi = new Personagem("Thor", 10, 5, 0);

        Personagem vilao = new Personagem("Thanos", 100, 0, 5);

        
        System.out.println("meu heroi: " + heroi.getNome() + "\nenergia: " + heroi.getEnergia() + "\nfome: " + heroi.getFome() + "\nsono: " + heroi.getSono() + "\n");

        System.out.println("o vilao: " + vilao.getNome() + "\nenergia: " + vilao.getEnergia() + "\nfome: " + vilao.getFome() + "\nsono: " + vilao.getSono() + "\n");

        heroi.setEnergia(200);
        heroi.setSono(-1);
        System.out.println("meu heroi: " + heroi.getNome() + "\nenergia: " + heroi.getEnergia() + "\nfome: " + heroi.getFome() + "\nsono: " + heroi.getSono() + "\n");

         */
        Player jogador = new Player("Thor", 10, 5, 0);

        Random rand = new Random();

        do {
            String opcao = JOptionPane.showInputDialog(
                    "#### Personagem: " + jogador.getNome() + " ####"
                    + "\n" + jogador.toString()
                    + "\n"
                    + "\n1 - Comer"
                    + "\n2 - Dormir"
                    + "\n3 - Caçar");

            switch (opcao) {
                case "1":
                    jogador.comer();
                    break;
                case "2":
                    jogador.dormir();
                    break;
                case "3":
                    jogador.cacar();
                    break;
                case "999":
                default:
                    JOptionPane.showMessageDialog(null, "Opção Invalida.");
            }

            double chanceInimigo = rand.nextDouble();
            if (chanceInimigo <= 0.10) {
                Inimigo enemy = new Inimigo("Orc", 10, 50, 10);

                jogador.recebeDano(enemy.getDano());
            }

        } while (jogador.isAlive());

        JOptionPane.showMessageDialog(null, "#####GAME OVER #####");

    }
}
