import java.awt.*;
import javax.swing.*;
public class MDIFromGUI extends JFrame {
    private JMenu m1, m2, m3, m4;
    private JMenuBar mb;
    private JMenuItem mi1,mi2,mi3,mi4,mi5;
    public JDesktopPane desk;
    public JInternalFrame frame1,frame2,frame3;
    public MDIFromGUI(){
        desk = new JDesktopPane();
        frame1 = new JInternalFrame("Application01",true,true,true,true);
        frame2 = new JInternalFrame("Application02",true,true,true,true);
        frame3 = new JInternalFrame("Application03",true,true,true,true);
        setTitle("SubMenuItem Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mb = new JMenuBar();
        m1 = new JMenu("File");
        m2 = new JMenu("Edit");
        m3 = new JMenu("View");
        m4 = new JMenu("New");
        setJMenuBar(mb);
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        
        mi1 = new JMenuItem("Window");
        mi2 = new JMenuItem("Message");
        mi3 = new JMenuItem("Open");
        mi4 = new JMenuItem("Save");
        mi5 = new JMenuItem("Exit");
        
        m1.add(m4);
        m4.add(mi1);
        m4.addSeparator();
        m4.add(mi2);
        m1.add(mi3);
        m1.addSeparator();
        m1.add(mi4);
        m1.addSeparator();
        m1.add(mi5);
        
        frame1.getContentPane();
        frame1.pack();
        frame1.setVisible(true);
        frame1.setSize(100, 100);
        
        frame2.getContentPane();
        frame2.pack();
        frame2.setVisible(true);
        int x2 = frame1.getX();
        int y2 = frame1.getY() + frame1.getHeight() + 50;
        frame2.setLocation(x2, y2);
        frame2.setSize(100, 100);
        
        frame3.getContentPane();
        frame3.pack();
        frame3.setVisible(true);
        int x3 = frame1.getX() + frame1.getWidth() + 20;
        int y3 = frame1.getY();
        frame3.setLocation(x3, y3);
        frame3.setSize(100, 100);
        
        desk.add(frame1);
        desk.add(frame2);
        desk.add(frame3);
        
        add(desk, BorderLayout.CENTER);
        setMinimumSize(new Dimension(300,300));
        pack();
        setSize(200,200);
        setVisible(true);
        setExtendedState(MAXIMIZED_BOTH);
        
    }
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        SwingUtilities.invokeLater(() -> { new MDIFromGUI();});
    }
}
