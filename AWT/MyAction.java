package AWT;
import java.awt.*;
import java.awt.event.*;
public class MyAction {
    public static void main(String args[]){
        Frame f = new Frame("Action");
        Button b = new Button("Click Me");
        TextField t = new TextField();
        t.setBounds(50, 100, 120, 30);
        b.setBounds(50, 60, 50, 30);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                t.setText("You pressed Button.");
            }
        });
        f.add(t);
        f.add(b);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
    
}
