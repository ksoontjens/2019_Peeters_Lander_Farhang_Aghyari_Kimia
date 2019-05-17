package hellotvxlet;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.math.BigDecimal;
import javax.tv.xlet.*;
import org.havi.ui.HScene;
import org.havi.ui.HSceneFactory;
import org.havi.ui.HStaticText;
import org.havi.ui.HTextButton;
import org.havi.ui.HVisible;
import org.havi.ui.event.HActionListener;


public class HelloTVXlet implements Xlet, HActionListener {

    HScene scene;
     MijnComponent mc=new MijnComponent(0,0,720,576);
     String  vragen[]={"Are you ready to put on\n the sorthing hat?","Dawn or dusk?", "Forest or river?", "Moon or stars?", "Black or white?", "Heads or tails?", "Left or right?", "What kind of instrument most pleases your ear?", "Which of the following would you most hate people to call you?", "How would you like to be known to history?", "Givin the choise, would you rather invent\n a potion that would guarantee you:","If you were attending Hogwarts,\n which pet would you choose to take with you?", "Which road tempts you most?"};
     int huidigevraag=0;
     float Gryffindor = 0;
     float Ravenclaw = 0;
     float Huffelpuf = 0;
     float Slytherin = 0;
     
     HStaticText vraag = new HStaticText (vragen[huidigevraag], 20, 300, 680, 75);
     
     
    public HelloTVXlet() {
        
    }

    public void initXlet(XletContext context) {
      scene=HSceneFactory.getInstance().getDefaultHScene();
   
      scene.add(mc);
      
      
      vraag.setBackgroundMode(HVisible.BACKGROUND_FILL);
      vraag.setBackground(Color.BLUE);
      
      scene.add(vraag);
      
      HTextButton btn1 = new HTextButton("no", 20,400,300,50); // x y w h
      btn1.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn1.setBackground(Color.BLUE);
      scene.add(btn1);
      
      HTextButton btn3 = new HTextButton("yes", 400,400,300,50); // x y w h
      btn3.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn3.setBackground(Color.BLUE);
      scene.add(btn3);
      
      btn1.requestFocus();      
      
      btn1.setFocusTraversal(null, btn1, null, btn3); //Boven Onder Links Rechts
      btn3.setFocusTraversal(null, btn3, btn1, null);
      
      btn1.setActionCommand("btn1");
      btn3.setActionCommand("btn3");
      
      btn1.addHActionListener(this);
      btn3.addHActionListener(this);
      

      scene.pushToBack(mc);
      
      scene.validate();
      scene.setVisible(true);
      huidigevraag++;
    }
    
    public void vraag1()
     {
      vraag.setTextContent(vragen[huidigevraag], HVisible.NORMAL_STATE);
         
      HTextButton btn1 = new HTextButton("Dawn", 20,400,300,50); // x y w h
      btn1.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn1.setBackground(Color.BLUE);
      scene.add(btn1);
      
      HTextButton btn3 = new HTextButton("Dusk", 400,400,300,50); // x y w h
      btn3.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn3.setBackground(Color.BLUE);
      scene.add(btn3);
      
      btn1.requestFocus();      
      
      btn1.setFocusTraversal(null, btn1, null, btn3); //Boven Onder Links Rechts
      btn3.setFocusTraversal(null, btn3, btn1, null);
      
      btn1.setActionCommand("btn1");
      btn3.setActionCommand("btn3");
      
      btn1.addHActionListener(this);
      btn3.addHActionListener(this);
      

      scene.pushToBack(mc);
      scene.popToFront(btn1);
      scene.popToFront(btn3);
      
      scene.validate();
      scene.setVisible(true);
      huidigevraag++;
     }
    
    public void vraag2()
     {
      vraag.setTextContent(vragen[huidigevraag], HVisible.NORMAL_STATE);
         
      HTextButton btn1 = new HTextButton("Forest", 20,400,300,50); // x y w h
      btn1.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn1.setBackground(Color.BLUE);
      scene.add(btn1);
      
      HTextButton btn3 = new HTextButton("River", 400,400,300,50); // x y w h
      btn3.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn3.setBackground(Color.BLUE);
      scene.add(btn3);
      
      btn1.requestFocus();      
      
      btn1.setFocusTraversal(null, btn1, null, btn3); //Boven Onder Links Rechts
      btn3.setFocusTraversal(null, btn3, btn1, null);
      
      btn1.setActionCommand("btn1");
      btn3.setActionCommand("btn3");
      
      btn1.addHActionListener(this);
      btn3.addHActionListener(this);
      

      scene.pushToBack(mc);
      scene.popToFront(btn1);
      scene.popToFront(btn3);
      
      scene.validate();
      scene.setVisible(true);
      huidigevraag++;
     }
     
     public void vraag3()
     {
      vraag.setTextContent(vragen[huidigevraag], HVisible.NORMAL_STATE);
         
      HTextButton btn1 = new HTextButton("Moon", 20,400,300,50); // x y w h
      btn1.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn1.setBackground(Color.BLUE);
      scene.add(btn1);
      
      HTextButton btn3 = new HTextButton("Stars", 400,400,300,50); // x y w h
      btn3.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn3.setBackground(Color.BLUE);
      scene.add(btn3);
      
      btn1.requestFocus();      
      
      btn1.setFocusTraversal(null, btn1, null, btn3); //Boven Onder Links Rechts
      btn3.setFocusTraversal(null, btn3, btn1, null);
      
      btn1.setActionCommand("btn1");
      btn3.setActionCommand("btn3");
      
      btn1.addHActionListener(this);
      btn3.addHActionListener(this);
      

      scene.pushToBack(mc);
      scene.popToFront(btn1);
      scene.popToFront(btn3);
      
      scene.validate();
      scene.setVisible(true);
      huidigevraag++;
     }
     
     public void vraag4()
     {
      vraag.setTextContent(vragen[huidigevraag], HVisible.NORMAL_STATE);
         
      HTextButton btn1 = new HTextButton("Black", 20,400,300,50); // x y w h
      btn1.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn1.setBackground(Color.BLUE);
      scene.add(btn1);
      
      HTextButton btn3 = new HTextButton("White", 400,400,300,50); // x y w h
      btn3.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn3.setBackground(Color.BLUE);
      scene.add(btn3);
      
      btn1.requestFocus();      
      
      btn1.setFocusTraversal(null, btn1, null, btn3); //Boven Onder Links Rechts
      btn3.setFocusTraversal(null, btn3, btn1, null);
      
      btn1.setActionCommand("btn1");
      btn3.setActionCommand("btn3");
      
      btn1.addHActionListener(this);
      btn3.addHActionListener(this);
      

      scene.pushToBack(mc);
      scene.popToFront(btn1);
      scene.popToFront(btn3);
      
      scene.validate();
      scene.setVisible(true);
      huidigevraag++;
     }
     
     public void vraag5()
     {
      vraag.setTextContent(vragen[huidigevraag], HVisible.NORMAL_STATE);
         
      HTextButton btn1 = new HTextButton("Heads", 20,400,300,50); // x y w h
      btn1.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn1.setBackground(Color.BLUE);
      scene.add(btn1);
      
      HTextButton btn3 = new HTextButton("Tails", 400,400,300,50); // x y w h
      btn3.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn3.setBackground(Color.BLUE);
      scene.add(btn3);
      
      btn1.requestFocus();      
      
      btn1.setFocusTraversal(null, btn1, null, btn3); //Boven Onder Links Rechts
      btn3.setFocusTraversal(null, btn3, btn1, null);
      
      btn1.setActionCommand("btn1");
      btn3.setActionCommand("btn3");
      
      btn1.addHActionListener(this);
      btn3.addHActionListener(this);
      

      scene.pushToBack(mc);
      scene.popToFront(btn1);
      scene.popToFront(btn3);
      
      scene.validate();
      scene.setVisible(true);
      
      huidigevraag++;
     }
     
     public void vraag6()
     {
      vraag.setTextContent(vragen[huidigevraag], HVisible.NORMAL_STATE);
         
      HTextButton btn1 = new HTextButton("Left", 20,400,300,50); // x y w h
      btn1.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn1.setBackground(Color.BLUE);
      scene.add(btn1);
      
      HTextButton btn3 = new HTextButton("Right", 400,400,300,50); // x y w h
      btn3.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn3.setBackground(Color.BLUE);
      scene.add(btn3);
      
      btn1.requestFocus();      
      
      btn1.setFocusTraversal(null, btn1, null, btn3); //Boven Onder Links Rechts
      btn3.setFocusTraversal(null, btn3, btn1, null);
      
      btn1.setActionCommand("btn1");
      btn3.setActionCommand("btn3");
      
      btn1.addHActionListener(this);
      btn3.addHActionListener(this);
      

      scene.pushToBack(mc);
      scene.popToFront(btn1);
      scene.popToFront(btn3);
      
      scene.validate();
      scene.setVisible(true);
      
      huidigevraag++;
     }
     
     public void vraag7()
     {
      vraag.setTextContent(vragen[huidigevraag], HVisible.NORMAL_STATE);
         
      HTextButton btn1 = new HTextButton("The voilin", 20,400,300,50); // x y w h
      btn1.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn1.setBackground(Color.BLUE);
      scene.add(btn1);
      
      HTextButton btn2 = new HTextButton("The trumpet", 20,450,300,50); // x y w h
      btn2.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn2.setBackground(Color.BLUE);
      scene.add(btn2);
      
      HTextButton btn3 = new HTextButton("The piano", 400,400,300,50); // x y w h
      btn3.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn3.setBackground(Color.BLUE);
      scene.add(btn3);
     
      HTextButton btn4 = new HTextButton("The drum", 400,450,300,50); // x y w h
      btn4.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn4.setBackground(Color.BLUE);
      scene.add(btn4);
      
      btn1.requestFocus();      
      
      btn1.setFocusTraversal(null, btn2, null, btn3); //Boven Onder Links Rechts
      btn2.setFocusTraversal(btn1, null, null, btn4);
      btn3.setFocusTraversal(null, btn4, btn1, null);
      btn4.setFocusTraversal(btn3, null, btn2, null);
      
      btn1.setActionCommand("btn1");
      btn2.setActionCommand("btn2");
      btn3.setActionCommand("btn3");
      btn4.setActionCommand("btn4");
      
      btn1.addHActionListener(this);
      btn2.addHActionListener(this);
      btn3.addHActionListener(this);
      btn4.addHActionListener(this);
      

      scene.pushToBack(mc);
      scene.popToFront(btn1);
      scene.popToFront(btn2);
      scene.popToFront(btn3);
      scene.popToFront(btn4);
      
      scene.validate();
      scene.setVisible(true);
      
      huidigevraag++;
     }
     
     public void vraag8()
     {
      vraag.setTextContent(vragen[huidigevraag], HVisible.NORMAL_STATE);
         
      HTextButton btn1 = new HTextButton("Ordinary", 20,400,300,50); // x y w h
      btn1.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn1.setBackground(Color.BLUE);
      scene.add(btn1);
      
      HTextButton btn2 = new HTextButton("Ignorant", 20,450,300,50); // x y w h
      btn2.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn2.setBackground(Color.BLUE);
      scene.add(btn2);
      
      HTextButton btn3 = new HTextButton("Cowardly", 400,400,300,50); // x y w h
      btn3.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn3.setBackground(Color.BLUE);
      scene.add(btn3);
     
      HTextButton btn4 = new HTextButton("Selfish", 400,450,300,50); // x y w h
      btn4.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn4.setBackground(Color.BLUE);
      scene.add(btn4);
      
      btn1.requestFocus();      
      
      btn1.setFocusTraversal(null, btn2, null, btn3); //Boven Onder Links Rechts
      btn2.setFocusTraversal(btn1, null, null, btn4);
      btn3.setFocusTraversal(null, btn4, btn1, null);
      btn4.setFocusTraversal(btn3, null, btn2, null);
      
      btn1.setActionCommand("btn1");
      btn2.setActionCommand("btn2");
      btn3.setActionCommand("btn3");
      btn4.setActionCommand("btn4");
      
      btn1.addHActionListener(this);
      btn2.addHActionListener(this);
      btn3.addHActionListener(this);
      btn4.addHActionListener(this);
      

      scene.pushToBack(mc);
      scene.popToFront(btn1);
      scene.popToFront(btn2);
      scene.popToFront(btn3);
      scene.popToFront(btn4);
      
      scene.validate();
      scene.setVisible(true);
      
      huidigevraag++;
     }
     
     public void vraag9()
     {
      vraag.setTextContent(vragen[huidigevraag], HVisible.NORMAL_STATE);
         
      HTextButton btn1 = new HTextButton("The Wise", 20,400,300,50); // x y w h
      btn1.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn1.setBackground(Color.BLUE);
      scene.add(btn1);
      
      HTextButton btn2 = new HTextButton("The Good", 20,450,300,50); // x y w h
      btn2.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn2.setBackground(Color.BLUE);
      scene.add(btn2);
      
      HTextButton btn3 = new HTextButton("The Great", 400,400,300,50); // x y w h
      btn3.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn3.setBackground(Color.BLUE);
      scene.add(btn3);
     
      HTextButton btn4 = new HTextButton("The Bold", 400,450,300,50); // x y w h
      btn4.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn4.setBackground(Color.BLUE);
      scene.add(btn4);
      
      btn1.requestFocus();      
      
      btn1.setFocusTraversal(null, btn2, null, btn3); //Boven Onder Links Rechts
      btn2.setFocusTraversal(btn1, null, null, btn4);
      btn3.setFocusTraversal(null, btn4, btn1, null);
      btn4.setFocusTraversal(btn3, null, btn2, null);
      
      btn1.setActionCommand("btn1");
      btn2.setActionCommand("btn2");
      btn3.setActionCommand("btn3");
      btn4.setActionCommand("btn4");
      
      btn1.addHActionListener(this);
      btn2.addHActionListener(this);
      btn3.addHActionListener(this);
      btn4.addHActionListener(this);
      

      scene.pushToBack(mc);
      scene.popToFront(btn1);
      scene.popToFront(btn2);
      scene.popToFront(btn3);
      scene.popToFront(btn4);
      
      scene.validate();
      scene.setVisible(true);
      
      huidigevraag++;
     }
     
     public void vraag10()
     {
      vraag.setTextContent(vragen[huidigevraag], HVisible.NORMAL_STATE);
         
      HTextButton btn1 = new HTextButton("Love?", 20,400,300,50); // x y w h
      btn1.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn1.setBackground(Color.BLUE);
      scene.add(btn1);
      
      HTextButton btn2 = new HTextButton("Glory?", 20,450,300,50); // x y w h
      btn2.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn2.setBackground(Color.BLUE);
      scene.add(btn2);
      
      HTextButton btn3 = new HTextButton("Wisdom?", 400,400,300,50); // x y w h
      btn3.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn3.setBackground(Color.BLUE);
      scene.add(btn3);
     
      HTextButton btn4 = new HTextButton("Power?", 400,450,300,50); // x y w h
      btn4.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn4.setBackground(Color.BLUE);
      scene.add(btn4);
      
      btn1.requestFocus();      
      
      btn1.setFocusTraversal(null, btn2, null, btn3); //Boven Onder Links Rechts
      btn2.setFocusTraversal(btn1, null, null, btn4);
      btn3.setFocusTraversal(null, btn4, btn1, null);
      btn4.setFocusTraversal(btn3, null, btn2, null);
      
      btn1.setActionCommand("btn1");
      btn2.setActionCommand("btn2");
      btn3.setActionCommand("btn3");
      btn4.setActionCommand("btn4");
      
      btn1.addHActionListener(this);
      btn2.addHActionListener(this);
      btn3.addHActionListener(this);
      btn4.addHActionListener(this);
      

      scene.pushToBack(mc);
      scene.popToFront(btn1);
      scene.popToFront(btn2);
      scene.popToFront(btn3);
      scene.popToFront(btn4);
      
      scene.validate();
      scene.setVisible(true);
      
      huidigevraag++;
     }
     
     public void vraag11()
     {
      vraag.setTextContent(vragen[huidigevraag], HVisible.NORMAL_STATE);
         
      HTextButton btn1 = new HTextButton("Cat", 20,400,300,50); // x y w h
      btn1.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn1.setBackground(Color.BLUE);
      scene.add(btn1);
      
      HTextButton btn2 = new HTextButton("Owl", 20,450,300,50); // x y w h
      btn2.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn2.setBackground(Color.BLUE);
      scene.add(btn2);
      
      HTextButton btn3 = new HTextButton("Toad", 400,400,300,50); // x y w h
      btn3.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn3.setBackground(Color.BLUE);
      scene.add(btn3);
     
      HTextButton btn4 = new HTextButton("None", 400,450,300,50); // x y w h
      btn4.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn4.setBackground(Color.BLUE);
      scene.add(btn4);
      
      btn1.requestFocus();      
      
      btn1.setFocusTraversal(null, btn2, null, btn3); //Boven Onder Links Rechts
      btn2.setFocusTraversal(btn1, null, null, btn4);
      btn3.setFocusTraversal(null, btn4, btn1, null);
      btn4.setFocusTraversal(btn3, null, btn2, null);
      
      btn1.setActionCommand("btn1");
      btn2.setActionCommand("btn2");
      btn3.setActionCommand("btn3");
      btn4.setActionCommand("btn4");
      
      btn1.addHActionListener(this);
      btn2.addHActionListener(this);
      btn3.addHActionListener(this);
      btn4.addHActionListener(this);
      

      scene.pushToBack(mc);
      scene.popToFront(btn1);
      scene.popToFront(btn2);
      scene.popToFront(btn3);
      scene.popToFront(btn4);
      
      scene.validate();
      scene.setVisible(true);
      
      huidigevraag++;
     }
     
     public void vraag12()
     {
      vraag.setTextContent(vragen[huidigevraag], HVisible.NORMAL_STATE);
         
      HTextButton btn1 = new HTextButton("A sunny, grassy lane", 20,400,300,50); // x y w h
      btn1.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn1.setBackground(Color.BLUE);
      scene.add(btn1);
      
      HTextButton btn2 = new HTextButton("A dark, lantern-lit alley", 20,450,300,50); // x y w h
      btn2.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn2.setBackground(Color.BLUE);
      scene.add(btn2);
      
      HTextButton btn3 = new HTextButton("A path through wood", 400,400,300,50); // x y w h
      btn3.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn3.setBackground(Color.BLUE);
      scene.add(btn3);
     
      HTextButton btn4 = new HTextButton("An ancient, cobbled street", 400,450,300,50); // x y w h
      btn4.setBackgroundMode(HVisible.BACKGROUND_FILL);
      btn4.setBackground(Color.BLUE);
      scene.add(btn4);
      
      btn1.requestFocus();      
      
      btn1.setFocusTraversal(null, btn2, null, btn3); //Boven Onder Links Rechts
      btn2.setFocusTraversal(btn1, null, null, btn4);
      btn3.setFocusTraversal(null, btn4, btn1, null);
      btn4.setFocusTraversal(btn3, null, btn2, null);
      
      btn1.setActionCommand("btn1");
      btn2.setActionCommand("btn2");
      btn3.setActionCommand("btn3");
      btn4.setActionCommand("btn4");
      
      btn1.addHActionListener(this);
      btn2.addHActionListener(this);
      btn3.addHActionListener(this);
      btn4.addHActionListener(this);
      

      scene.pushToBack(mc);
      scene.popToFront(btn1);
      scene.popToFront(btn2);
      scene.popToFront(btn3);
      scene.popToFront(btn4);
      
      scene.validate();
      scene.setVisible(true);
      
      huidigevraag++;
     }
     
     public static float round(float number, int decimalPlace) {
		BigDecimal bd = new BigDecimal(number);
		bd = bd.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);
		return bd.floatValue();
	}
     
    public void result(){
        //float total = Gryffindor + Ravenclaw + Huffelpuf + Slytherin;
        float RGryffindor = (Gryffindor)/10;
        float RRavenclaw = (Ravenclaw)/10;
        float RHuffelpuf = (Huffelpuf)/10;
        float RSlytherin = (Slytherin)/10;
        //float RGryffindor = Gryffindor / huidigevraag - 1;
        //float RRavenclaw = Ravenclaw / huidigevraag - 1;
        //float RHuffelpuf = Huffelpuf / huidigevraag - 1;
        //float RSlytherin = Slytherin / huidigevraag - 1;
        RGryffindor = round(RGryffindor, 2);
        RRavenclaw = round(RRavenclaw, 2);
        RHuffelpuf = round(RHuffelpuf, 2);
        RSlytherin = round(RSlytherin, 2);
        
        
        if (RGryffindor > RRavenclaw && RGryffindor > RHuffelpuf && RGryffindor > RSlytherin){
            HStaticText GryffindorResult = new HStaticText ("Congratulations on being sorted into\n Gryffindor", 20, 300, 680, 75);
            HStaticText GryffindorScore = new HStaticText ("Gryffindor = " + RGryffindor + "%", 20,400,300,50);
            HStaticText RavenclawScore = new HStaticText ("Ravenclaw = " + RRavenclaw + "%", 20,450,300,50);
            HStaticText HuffelpufScore = new HStaticText ("Huffelpuf = " + RHuffelpuf + "%", 400,400,300,50);
            HStaticText SlytherinScore = new HStaticText ("Slytherin = " + RSlytherin + "%", 400,450,300,50);
            scene.removeAll();
            scene.add(mc);
            scene.add(GryffindorResult);
            scene.add(GryffindorScore);
            scene.add(RavenclawScore);
            scene.add(HuffelpufScore);
            scene.add(SlytherinScore);
            scene.popToFront(GryffindorScore);
            scene.popToFront(RavenclawScore);
            scene.popToFront(HuffelpufScore);
            scene.popToFront(SlytherinScore);
            scene.popToFront(GryffindorResult);
            GryffindorResult.setBackgroundMode(HVisible.BACKGROUND_FILL);
            GryffindorResult.setBackground(Color.BLUE);
            
            huidigevraag++;
            
            HTextButton btn1 = new HTextButton("Exit", 210,500,300,50); // x y w h
            btn1.setBackgroundMode(HVisible.BACKGROUND_FILL);
            btn1.setBackground(Color.BLUE);
            scene.add(btn1);
            scene.popToFront(btn1);
            btn1.requestFocus();
            btn1.setActionCommand("btn1");
            btn1.addHActionListener(this);
        }
        if (RRavenclaw > RGryffindor && RRavenclaw > RHuffelpuf && RRavenclaw > RSlytherin){
            HStaticText RavenclawResult = new HStaticText ("Congratulations on being sorted into\n Ravenclaw", 20, 300, 680, 75);
            HStaticText GryffindorScore = new HStaticText ("Gryffindor = " + RGryffindor + "%", 20,400,300,50);
            HStaticText RavenclawScore = new HStaticText ("Ravenclaw = " + RRavenclaw + "%", 20,450,300,50);
            HStaticText HuffelpufScore = new HStaticText ("Huffelpuf = " + RHuffelpuf + "%", 400,450,300,50);
            HStaticText SlytherinScore = new HStaticText ("Slytherin = " + RSlytherin + "%", 400,400,300,50);
            scene.removeAll();
            scene.add(mc);
            scene.add(RavenclawResult);
            scene.add(GryffindorScore);
            scene.add(RavenclawScore);
            scene.add(HuffelpufScore);
            scene.add(SlytherinScore);
            scene.popToFront(GryffindorScore);
            scene.popToFront(RavenclawScore);
            scene.popToFront(HuffelpufScore);
            scene.popToFront(SlytherinScore);
            scene.popToFront(RavenclawResult);
            RavenclawResult.setBackgroundMode(HVisible.BACKGROUND_FILL);
            RavenclawResult.setBackground(Color.BLUE);
            
            huidigevraag++;
            
            HTextButton btn1 = new HTextButton("Exit", 210,500,300,50); // x y w h
            btn1.setBackgroundMode(HVisible.BACKGROUND_FILL);
            btn1.setBackground(Color.BLUE);
            scene.add(btn1);
            scene.popToFront(btn1);
            btn1.requestFocus();
            btn1.setActionCommand("btn1");
            btn1.addHActionListener(this);
        }
        if (RHuffelpuf > RRavenclaw && RHuffelpuf > RGryffindor && RHuffelpuf > RSlytherin){
            HStaticText HuffelpufResult = new HStaticText ("Congratulations on being sorted into\n Huffelpuf", 20, 300, 680, 75);
            HStaticText GryffindorScore = new HStaticText ("Gryffindor = " + RGryffindor + "%", 20,400,300,50);
            HStaticText RavenclawScore = new HStaticText ("Ravenclaw = " + RRavenclaw + "%", 20,450,300,50);
            HStaticText HuffelpufScore = new HStaticText ("Huffelpuf = " + RHuffelpuf + "%", 400,450,300,50);
            HStaticText SlytherinScore = new HStaticText ("Slytherin = " + RSlytherin + "%", 400,400,300,50);
            scene.removeAll();
            scene.add(mc);
            scene.add(HuffelpufResult);
            scene.add(GryffindorScore);
            scene.add(RavenclawScore);
            scene.add(HuffelpufScore);
            scene.add(SlytherinScore);
            scene.popToFront(GryffindorScore);
            scene.popToFront(RavenclawScore);
            scene.popToFront(HuffelpufScore);
            scene.popToFront(SlytherinScore);
            scene.popToFront(HuffelpufResult);
            HuffelpufResult.setBackgroundMode(HVisible.BACKGROUND_FILL);
            HuffelpufResult.setBackground(Color.BLUE);
            
            huidigevraag++;
            
            HTextButton btn1 = new HTextButton("Exit", 210,500,300,50); // x y w h
            btn1.setBackgroundMode(HVisible.BACKGROUND_FILL);
            btn1.setBackground(Color.BLUE);
            scene.add(btn1);
            scene.popToFront(btn1);
            btn1.requestFocus();
            btn1.setActionCommand("btn1");
            btn1.addHActionListener(this);
        }
        if (RSlytherin > RRavenclaw && RSlytherin > RHuffelpuf && RSlytherin > RGryffindor){
            HStaticText SlytherinResult = new HStaticText ("Congratulations on being sorted into\n Slytherin", 20, 300, 680, 75);
            HStaticText GryffindorScore = new HStaticText ("Gryffindor = " + RGryffindor + "%", 20,400,300,50);
            HStaticText RavenclawScore = new HStaticText ("Ravenclaw = " + RRavenclaw + "%", 20,450,300,50);
            HStaticText HuffelpufScore = new HStaticText ("Huffelpuf = " + RHuffelpuf + "%", 400,450,300,50);
            HStaticText SlytherinScore = new HStaticText ("Slytherin = " + RSlytherin + "%", 400,400,300,50);
            scene.removeAll();
            scene.add(mc);
            scene.add(SlytherinResult);
            scene.add(GryffindorScore);
            scene.add(RavenclawScore);
            scene.add(HuffelpufScore);
            scene.add(SlytherinScore);
            scene.popToFront(GryffindorScore);
            scene.popToFront(RavenclawScore);
            scene.popToFront(HuffelpufScore);
            scene.popToFront(SlytherinScore);
            scene.popToFront(SlytherinResult);
            SlytherinResult.setBackgroundMode(HVisible.BACKGROUND_FILL);
            SlytherinResult.setBackground(Color.BLUE);
            
            huidigevraag++;
            
            HTextButton btn1 = new HTextButton("Exit", 210,500,300,50); // x y w h
            btn1.setBackgroundMode(HVisible.BACKGROUND_FILL);
            btn1.setBackground(Color.BLUE);
            scene.add(btn1);
            scene.popToFront(btn1);
            btn1.requestFocus();
            btn1.setActionCommand("btn1");
            btn1.addHActionListener(this);
          
            
        }
    }

    public void startXlet() {
    
    }

    public void pauseXlet() {
     
    }

    public void destroyXlet(boolean unconditional) {
     
    }
    
    public void actionPerformed(ActionEvent arg0) {
     System.out.println(arg0.getActionCommand());
     System.out.println("hudige="+huidigevraag);
     if(arg0.getActionCommand().equals("btn1")) {
        
        if(huidigevraag == 1){
          System.exit(0);
        }
        if(huidigevraag == 2){
            Gryffindor+= 73; Ravenclaw+= 73; Huffelpuf+= 30; Slytherin+= 26;
        }
        if(huidigevraag == 3){ 
            Gryffindor+= 74; Ravenclaw+= 73; Huffelpuf+= 26; Slytherin+= 28;
        }
        if(huidigevraag == 4){
            Gryffindor+= 27; Ravenclaw+= 74; Huffelpuf+= 33; Slytherin+= 72;
        }
        if(huidigevraag == 5){
            Gryffindor+= 73; Ravenclaw+= 29; Huffelpuf+= 24; Slytherin+= 72;
        }
        if(huidigevraag == 6){
            Gryffindor+= 27; Ravenclaw+= 69; Huffelpuf+= 74; Slytherin+= 27;
        }
        if(huidigevraag == 7){
            Gryffindor+= 29; Ravenclaw+= 70; Huffelpuf+= 29; Slytherin+= 73;
        }
        if(huidigevraag == 8){
            Gryffindor+= 17; Ravenclaw+= 20; Huffelpuf+= 20; Slytherin+= 48;
        }
        if(huidigevraag == 9){
            Gryffindor+= 17; Ravenclaw+= 18; Huffelpuf+= 19; Slytherin+= 45;
        }
        if(huidigevraag == 10){
            Gryffindor+= 19; Ravenclaw+= 46; Huffelpuf+= 19; Slytherin+= 16;
        }
        if(huidigevraag == 11){
            Gryffindor+= 19; Ravenclaw+= 18; Huffelpuf+= 44; Slytherin+= 20;
        }
        if(huidigevraag == 12){
            Gryffindor+= 36; Ravenclaw+= 25; Huffelpuf+= 24; Slytherin+= 52;
        }
        if(huidigevraag == 13){
            Gryffindor+= 18; Ravenclaw+= 14; Huffelpuf+= 41; Slytherin+= 18;
        }
        if(huidigevraag == 14){
            System.exit(0);
        }
      
        scene.repaint();
     }
     if(arg0.getActionCommand().equals("btn2")) {
        if(huidigevraag == 8){
            Gryffindor+= 18; Ravenclaw+= 17; Huffelpuf+= 44; Slytherin+= 18;
        }
        if(huidigevraag == 9){
            Gryffindor+= 19; Ravenclaw+= 50; Huffelpuf+= 19; Slytherin+= 17;
        }
        if(huidigevraag == 10){
            Gryffindor+= 17; Ravenclaw+= 16; Huffelpuf+= 44; Slytherin+= 17;
        }
        if(huidigevraag == 11){
            Gryffindor+= 47; Ravenclaw+= 19; Huffelpuf+= 17; Slytherin+= 17;
        }
        if(huidigevraag == 12){
            Gryffindor+= 30; Ravenclaw+= 50; Huffelpuf+= 26; Slytherin+= 25;
        }
        if(huidigevraag == 13){
            Gryffindor+= 19; Ravenclaw+= 20; Huffelpuf+= 17; Slytherin+= 45;
        }
        
        scene.repaint();
     }
     if(arg0.getActionCommand().equals("btn3")) {
         
        if(huidigevraag == 0){
        } 
        if(huidigevraag == 2){
            Gryffindor+= 27; Ravenclaw+= 27; Huffelpuf+= 70; Slytherin+= 74;
        }
        if(huidigevraag == 3){
            Gryffindor+= 26; Ravenclaw+= 27; Huffelpuf+= 74; Slytherin+= 72;
        }
        if(huidigevraag == 4){
            Gryffindor+= 73; Ravenclaw+= 26; Huffelpuf+= 67; Slytherin+= 28;
        }
        if(huidigevraag == 5){
            Gryffindor+= 27; Ravenclaw+= 71; Huffelpuf+= 76; Slytherin+= 28;
        }
        if(huidigevraag == 6){
            Gryffindor+= 73; Ravenclaw+= 31; Huffelpuf+= 26; Slytherin+= 73;
        }
        if(huidigevraag == 7){
            Gryffindor+= 71; Ravenclaw+= 30; Huffelpuf+= 71; Slytherin+= 27;
        }
        if(huidigevraag == 8){
            Gryffindor+= 21; Ravenclaw+= 46; Huffelpuf+= 19; Slytherin+= 18;
        }
        if(huidigevraag == 9){
            Gryffindor+= 47; Ravenclaw+= 17; Huffelpuf+= 18; Slytherin+= 20;
        }
        if(huidigevraag == 10){
            Gryffindor+= 20; Ravenclaw+= 22; Huffelpuf+= 20; Slytherin+= 44;
        }
        if(huidigevraag == 11){
            Gryffindor+= 18; Ravenclaw+= 43; Huffelpuf+= 20; Slytherin+= 18;
        }
        if(huidigevraag == 12){
            Gryffindor+= 34; Ravenclaw+= 25; Huffelpuf+= 50; Slytherin+= 23;
        }
        if(huidigevraag == 13){
            Gryffindor+= 44; Ravenclaw+= 22; Huffelpuf+= 19; Slytherin+= 23;
        }
        
        scene.repaint();
     }
     if(arg0.getActionCommand().equals("btn4")) {
        if(huidigevraag == 8){
            Gryffindor+= 44; Ravenclaw+= 17; Huffelpuf+= 17; Slytherin+= 16;
        }
        if(huidigevraag == 9){
            Gryffindor+= 17; Ravenclaw+= 15; Huffelpuf+= 44; Slytherin+= 18;
        }
        if(huidigevraag == 10){
            Gryffindor+= 44; Ravenclaw+= 17; Huffelpuf+= 16; Slytherin+= 23;
        }
        if(huidigevraag == 11){
            Gryffindor+= 16; Ravenclaw+= 20; Huffelpuf+= 20; Slytherin+= 45;
        }
        if(huidigevraag == 12){
            Gryffindor+= 0; Ravenclaw+= 0; Huffelpuf+= 0; Slytherin+= 0;
        }
        if(huidigevraag == 13){
            Gryffindor+= 19; Ravenclaw+= 44; Huffelpuf+= 23; Slytherin+= 14;
        }
      

      
        scene.repaint();
     }
        if(huidigevraag == 0){
        }
        if(huidigevraag == 1){
            vraag1();
        }
        else
        if(huidigevraag == 2){
            vraag2(); 
        } 
        else
        if(huidigevraag == 3){ 
            vraag3();
        }
        else
        if(huidigevraag == 4){ 
            vraag4();
        }
        else
        if(huidigevraag == 5){
            vraag5();
        }
        else
        if(huidigevraag == 6){
            vraag6();
        }
        else
        if(huidigevraag == 7){
            vraag7();
        }
        else
        if(huidigevraag == 8){
            vraag8();
        }
        else
        if(huidigevraag == 9){
            vraag9();
        }
        else
        if(huidigevraag == 10){
            vraag10();
        }
        else
        if(huidigevraag == 11){
            vraag11();
        }
        else
        if(huidigevraag == 12){
            vraag12();
        }
        else
        if(huidigevraag == 13){
            result();
        }
     scene.repaint();
    }

}