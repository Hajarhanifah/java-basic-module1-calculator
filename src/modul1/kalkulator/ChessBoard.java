/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul1.kalkulator;

/**
 *
 * @author hajarhanifah
 */

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChessBoard extends JPanel{
    
    public void paint(Graphics graphics){
        graphics.fillRect(50, 50, 600, 600);
        for (int x=50; x<=600; x+=150){
            for(int y = 50; y<= 600; y+=150){
                graphics.clearRect(x, y, 75, 75);
            }
        }
        
        for(int x = 125; x<= 600; x+= 150){
             for(int y = 125; y<= 600; y+=150){
                graphics.clearRect(x, y, 75, 75);
            }
        }
    }
    
    public static void main(String[] args){
        JFrame jframe = new JFrame();
        jframe.setSize(700,700);
        jframe.setTitle("Chess Board by Hajar Hanifah");
        jframe.add(new ChessBoard());
        jframe.setLocationRelativeTo(null);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setVisible(true);
    }
    
}
