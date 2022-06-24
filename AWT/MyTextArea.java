package AWT;
import java.awt.*;
public class MyTextArea {
    public static void main(String args[]){
        Frame f = new Frame("TextArea");
        TextArea a = new TextArea();
        a.setText("Hello World");
        a.setBounds(50, 50, 100, 100);
        f.add(a);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
