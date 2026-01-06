package olamundo_swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

import java.awt.Dimension;
import java.awt.GridLayout;

public class OlaMundoSwing {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {

            JFrame janela = new JFrame("Swing correto");

            janela.setLayout(new GridLayout(2, 1));

            JLabel msg = new JLabel("a mensagem aparecerá aqui", JLabel.CENTER);
            JButton btn = new JButton("Clique aqui");
            btn.setPreferredSize(new Dimension(10, 50));

            btn.addActionListener(e -> {
                msg.setText("olá, Mundo!!!");
            });

            janela.add(msg);
            janela.add(btn);

            janela.setSize(400, 300);
            janela.setLocationRelativeTo(null);
            janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            janela.setVisible(true);
        });
    }
}