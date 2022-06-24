package AWT;
import java.awt.*;  
import java.awt.event.*;  
public class MyMouseMotion extends Frame implements MouseMotionListener{  
    Label l;
    MyMouseMotion(){  
        addMouseMotionListener(this);  
        l=new Label();  
        l.setBounds(20,40,100,20);  
        add(l);
        setTitle("Mouse MOtion");   
        setSize(300,300);  
        setLayout(null);  
        setVisible(true);  
    }  
public void mouseDragged(MouseEvent e) {  
    l.setText("X="+e.getX()+", Y="+e.getY()); 
    Graphics g=getGraphics();  
    g.setColor(Color.BLUE);  
    g.fillOval(e.getX(),e.getY(),20,20);  
}  
public void mouseMoved(MouseEvent e) {
    l.setText("X="+e.getX()+", Y="+e.getY());
}  
  
public static void main(String[] args) {  
    new MyMouseMotion();  
}  
}  
