/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package progressbar;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import javax.swing.Timer;

/**
 *
 * @author MrRoot
 */
public class ProgressBar2 extends JWindow{
    JProgressBar progress = new JProgressBar();
    int time=0;
  
    Timer timer;//Timer dari java Swing yg berfungsi sebagai delay time
    Dimension dimensi = Toolkit.getDefaultToolkit().getScreenSize();
    public ProgressBar2(){
        Color warna = Color.white;
        progress.setBackground(Color.black);//set Warna Background progress bar
        progress.setForeground(Color.white);
        getContentPane().add(progress,BorderLayout.CENTER);//Menempatkan progress Bar di bagian tengah
        setLocation(dimensi.width/2 - getWidth()/2, dimensi.height/2 - getHeight()/2);//Lokasi Agar di tengah-tengah layar
        pack();
        show();
        timer = new Timer(50, new ActionListener() {//Delay Time sebesar 50 

            @Override
            public void actionPerformed(ActionEvent ae) {
                time++;//Waktu akanterus bertambah sampai persentase komplit
                progress.setValue(time);
                if(progress.getPercentComplete()==1){//Jika Persentase komplit
                    timer.stop();//thread timer dihentikan
                    setVisible(false);//Menghilangkan Gambar logo dan progres bar
                }
                
            }
        });
        timer.start();//Memulai Thread
    }
    

    /**
     * @param args the command line arguments
     */
  
}
