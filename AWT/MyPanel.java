package AWT;
import java.awt.*;

public class MyPanel {
    public static void main(String args[]){
        Frame f = new Frame("Panel");
        Panel p = new Panel();
        p.setBounds(50, 60, 200, 200);
        p.setBackground(Color.red);
        Button b = new Button("Click Here");   
        b.setBounds(50,100,80,30);
        Button b1 = new Button("Click Here");   
        b1.setBounds(100,100,80,30); 
        b.setBackground(Color.green);
        b1.setBackground(Color.blue);    
        p.add(b);
        p.add(b1);
        f.add(p);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
