package AWT;
import java.awt.*;
public class MyChoice {
    public static void main(String args[]){
        Frame f = new Frame("Choice");
        Choice c = new Choice();
        c.setBounds(50, 60, 80, 30);
        c.addItem("Java");
        c.addItem("Python");
        c.addItem("C");
        c.addItem("C++");
        c.addItem("Go");
        f.add(c);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
