package AWT;
import java.awt.*;
public class MyCheckbox {
    public static void main(String args[]){
        Frame f = new Frame("CheckBox");
        Checkbox c1 = new Checkbox("Java");
        Checkbox c2 = new Checkbox("C++", true);
        c1.setBounds(50, 60, 50, 30);
        c2.setBounds(50, 120, 50, 30);
        f.add(c1);f.add(c2);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
