import javax.swing.*;
public class MyFrame1 {
    public static void main(String[] args) {

        JFrame fr = new JFrame("My Clock");
        MyClock1 clock = new MyClock1();
        Thread t = new Thread(clock);
        t.start();
        fr.add(clock);
        fr.setSize(400,200);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
}