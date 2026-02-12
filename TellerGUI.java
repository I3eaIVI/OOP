import java.awt.*;
import javax.swing.*;
public class TellerGUI extends JFrame {
    private JPanel p1,p2,p3,p4;
    private JLabel lbl1 , lbl2;
    private JTextField txt,txt1;
    private JButton bn1,bn2,bn3;
    public TellerGUI(){
        setTitle("Teller GUI");
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        txt1 = new JTextField("6000");
        txt1.setEditable(false);
        txt = new JTextField();
        lbl1 = new JLabel("Balane");
        lbl2 = new JLabel("Amount");
        p1.setLayout(new GridLayout(2,1));
        p1.add(lbl1);
        p1.add(lbl2);
        p2.setLayout(new GridLayout(2,1));
        p2.add(txt1);
        p2.add(txt);
        bn1 = new JButton("Deposit");
        bn2 = new JButton("Withdraw");
        bn3 = new JButton("Exit");
        p3.setLayout(new FlowLayout());
        p3.add(bn1); p3.add(bn2); p3.add(bn3);
        p4.setLayout(new GridLayout(1,2));
        p4.add(p1); p4.add(p2);
        setLayout(new GridLayout(2,1));
        add(p4);
        add(p3);
        setSize(400,200);
        setVisible(true);
        
    }
    public static void main(String[] args) {
        new TellerGUI();
    }
}
