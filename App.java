/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Aula_GUI;

import Aula_GUI.Telas.*;
import javax.swing.JFrame;

public class App {

    public static void main(String[] args) {

        Tela_Conversor telaConvert = new Tela_Conversor();

        telaConvert.setVisible(true);
        //ajusta largura e altura de acordo com o conteúdo
        telaConvert.pack();
        //centraliza
        telaConvert.setLocationRelativeTo(null);
        //Altera comportamento do botão fechar
        telaConvert.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
