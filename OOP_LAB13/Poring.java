import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Poring{
    private JFrame fr;
    private JLabel jl;
    private JLabel countLabel;
    private ImageIcon img;
    private Image scaled;
    private static int count;
    
    public Poring() {
        fr = new JFrame("");

        img = new ImageIcon(getClass().getResource("poring.png"));
        scaled = img.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        jl = new JLabel(new ImageIcon(scaled));
        jl.setBounds(0, 0, 200, 200);

        count++;
        countLabel = new JLabel(String.valueOf(count));;
        countLabel.setBounds(160, 10, 40, 30);

        JLayeredPane pane = new JLayeredPane();
        pane.setPreferredSize(new Dimension(200, 200));
        pane.add(jl, Integer.valueOf(0));
        pane.add(countLabel, Integer.valueOf(1));

        jl.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                fr.dispose();
            }
        });

        fr.add(pane);
        fr.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        fr.pack();
        fr.setResizable(false);
        fr.setVisible(true);
    }
}