package AWT;
import java.awt.*;    
public class AWTExample2 {    
public static void main (String[] args) {   
     
    Frame f = new Frame("Button Example");

    TextField t = new TextField();
    Label l = new Label("Employee id:");
    Button b = new Button("Click Here");
    l.setBounds(50, 50, 70, 40);
    t.setBounds(50, 100, 50, 30);
    b.setBounds(50,150,80,30);
    t.setText("102");
    f.add(l);     
    f.add(b);
    f.add(t);    
    f.setSize(400,400);    
    f.setLayout(null);    
    f.setVisible(true);     
    }    
}  