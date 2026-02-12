import javax.swing.*;
import java.awt.*;
public class CalculatorTwoGUI extends JFrame {
    private JTextField txt;
    private JPanel p1;
    private JButton bn1,bn2,bn3,bn4,bn5,bn6,bn7,bn8,bn9,bn10,bn11,bn12,bn13,bn14,bn15,bn16;
    public CalculatorTwoGUI() {
        setTitle("My Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p1 = new JPanel();
        bn1 = new JButton("7");
        bn2 = new JButton("8");
        bn3 = new JButton("9");
        bn4 = new JButton("+");
        bn5 = new JButton("4");
        bn6 = new JButton("5");
        bn7 = new JButton("6");
        bn8 = new JButton("-");
        bn9 = new JButton("1");
        bn10 = new JButton("2");
        bn11 = new JButton("3");
        bn12 = new JButton("x");
        bn13 = new JButton("0");
        bn14 = new JButton("c");
        bn15 = new JButton("=");
        bn16 = new JButton("/");
        
        txt = new JTextField(100);
        setLayout(new BorderLayout());
        add(txt,BorderLayout.NORTH);
        p1.setLayout(new GridLayout(4,4));
        p1.add(bn1); p1.add(bn2); p1.add(bn3); p1.add(bn4);
        p1.add(bn5); p1.add(bn6); p1.add(bn7); p1.add(bn8);
        p1.add(bn9); p1.add(bn10); p1.add(bn11); p1.add(bn12);
        p1.add(bn13); p1.add(bn14); p1.add(bn15); p1.add(bn16);
        add(p1,BorderLayout.CENTER);
        setSize(200,150);
        setVisible(true);
        
    }
    public static void main(String[] args) {new CalculatorTwoGUI();}
}
