package olamundo_swing;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class OlaMundoSwing {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame janela = new JFrame("Swing correto");

            JLabel label = new JLabel("Olá, Mundo!!");
            janela.add(label);

            janela.setSize(400, 300);
            janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            janela.setVisible(true);
        });
    }
}
