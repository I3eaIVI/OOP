import java.awt.*;
import javax.swing.*;
public class CalculatorOneGUI {
    private JFrame fr;
    private JTextField txt1, txt2 , txt3;
    private JButton btn1 , btn2 , btn3 , btn4;
    public CalculatorOneGUI(){
        fr = new JFrame("เครื่องคิดเลข");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setLayout(new FlowLayout());
        btn1 = new JButton("+");
        btn2 = new JButton("-");
        btn3 = new JButton("x");
        btn4 = new JButton("/");
        
        txt1 = new JTextField(20);
        txt2 = new JTextField(20);
        txt3 = new JTextField(20);
        
        fr.add(txt1);
        fr.add(txt2);
        fr.add(btn1);
        fr.add(btn2);
        fr.add(btn3);
        fr.add(btn4);
        fr.add(txt3);
        fr.setSize(200 , 150);
        fr.setVisible(true);
    }
    public static void main(String[] args)  {   new CalculatorOneGUI();}
}
