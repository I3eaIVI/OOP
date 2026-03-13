import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
public class PoringConstructor {
    private JFrame fr;
    private JLabel jl;
    private JButton bt;
    
    public PoringConstructor() {
        fr = new JFrame();
        jl = new JLabel();
        bt = new JButton("Add");
        
        jl.setLayout(new FlowLayout());
        
        jl.add(bt);
        fr.add(jl);
        
        bt.addActionListener(e -> {
            Poring p = new Poring();
        });
        
        fr.setSize(200, 75);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
}