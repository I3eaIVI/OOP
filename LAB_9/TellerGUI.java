import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class TellerGUI extends Account implements ActionListener{
    private JFrame f;
    private JPanel p1,p2,p3,p4;
    private JLabel lbl1 , lbl2;
    private JTextField txt,txt1;
    private JButton bn1,bn2,bn3;
    public TellerGUI() {
        super(6000,"");
        f = new JFrame();
        f.setTitle("Teller GUI");
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        txt1 = new JTextField(String.valueOf(getBalance()));
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
        f.setLayout(new GridLayout(2,1));
        f.add(p4);
        f.add(p3);
        f.setSize(400,200);
        f.setVisible(true);
        
        bn1.addActionListener(this);
        bn2.addActionListener(this);
        bn3.addActionListener(this);
        
    }
    public static void main(String[] args) {
        new TellerGUI();
    }

    @Override
    public void actionPerformed(ActionEvent ev) {
        if (ev.getSource().equals(bn1)){
            this.deposit(Double.parseDouble(txt.getText()));
            txt1.setText(String.valueOf(this.getBalance()));
        }
        else if (ev.getSource().equals(bn2)){
            if ((getBalance() - Double.parseDouble(txt.getText())) < 0){
                txt1.setText(String.valueOf(this.getBalance()));
            }
            else{
                this.withdraw(Double.parseDouble(txt.getText()));
                txt1.setText(String.valueOf(this.getBalance()));
            }
        }
        else{
            System.exit(JFrame.EXIT_ON_CLOSE);
        }
    }
}
