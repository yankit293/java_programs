package AWT;
import java.awt.*;
public class MyList {
    public static void main(String args[]){
        Frame f = new Frame("List");
        List c = new List();
        c.setBounds(50, 60, 80, 100);
        c.add("Java");
        c.add("Python");
        c.add("C");
        c.add("C++");
        c.add("Go");
        f.add(c);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
