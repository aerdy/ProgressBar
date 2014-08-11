/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package progressbar;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.UIManager;
import javax.swing.border.Border;

/**
 *
 * @author MrRoot
 */
public class ProgressBar extends JFrame{
  int a = 0;
    JProgressBar progressBar = new JProgressBar(0, 100);
    JLabel label = new JLabel();
    Border border = BorderFactory.createTitledBorder("Waiting…");

    public ProgressBar() {

        progressBar.setStringPainted(true);
        progressBar.setBorder(border);
        label.setText("Aplikasi Peternakan Ayam");
        label.setFont(new Font("Tahoma", 1, 24));
        JPanel content = (JPanel)getContentPane();
        content.setBackground(Color.blue);
        Color warnaBorder =  Color.BLACK;
        content.setBorder(BorderFactory.createLineBorder(warnaBorder, 5));
        setLayout(null);
        add(label);
        label.setBounds(10, 10, 350, 100);
        Component add = add(progressBar);
        progressBar.setBounds(10, 130, 315, 40);
        pack();
        setSize(350, 250);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
        while (a <= 100) {
            progressBar.setValue(a);
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
            }
            a += 1;
        }
        this.dispose();
      }
        public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new ProgressBar();
        } catch (Exception ex) {
        }
    }
}
