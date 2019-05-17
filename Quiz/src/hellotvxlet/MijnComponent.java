
package hellotvxlet;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;

import org.havi.ui.HComponent;

/**
 *
 * @author student
 */
public class MijnComponent extends HComponent {
    Image achtergrond;
    int x = 200;
    int y = 500;
    int ay = 0;
    public MijnComponent(int x, int y, int x2, int y2){
        System.out.println("beign constructur");
        this.setBounds(x, y, x2, y2);
        achtergrond=this.getToolkit().getImage("Hogwarts.jpg");
        MediaTracker mt=new MediaTracker(this);
        mt.addImage(achtergrond, 1);
        try {
            mt.waitForAll();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("einde constructur image="+achtergrond);
    }
    public void paint (Graphics g){
        System.out.println("paint");
        g.drawImage(achtergrond, 0, 0, this);
    }
}
