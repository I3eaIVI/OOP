import javax.swing.*;
public class MyFrame {
    public static void main(String[] args) {

        JFrame fr = new JFrame("My Clock");
        MyClock clock = new MyClock();
        Thread t = new Thread(clock);
        t.start();
        fr.add(clock);
        fr.setSize(400,200);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
}