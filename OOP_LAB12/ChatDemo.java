import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.*;

public class ChatDemo implements ActionListener , WindowListener{

    private JFrame f;
    private JTextArea ta;
    private JTextField tf;
    private JButton btnS, btnR;
    private JPanel p;
    
    public ChatDemo(){
        f = new JFrame();
        p = new JPanel();
        tf = new JTextField(45);
        ta = new JTextArea(20,45);
        btnS = new JButton("Submit");
        btnR = new JButton("Reset");
        btnS.addActionListener(this);
        btnR.addActionListener(this);
        ta.setEditable(false);
        
        f.setLayout(new BorderLayout());
        f.add(ta, BorderLayout.NORTH); f.add(tf,BorderLayout.CENTER); f.add(p , BorderLayout.SOUTH);
        p.setLayout(new FlowLayout());
        p.add(btnS); p.add(btnR);
        
        f.addWindowListener(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.pack();
        loadFile();
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btnS){
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            System.out.print(dtf.format(LocalDateTime.now()));
            String time = dtf.format(LocalDateTime.now());
            ta.append( time + " : " + tf.getText() + "\n");
        }
        if(e.getSource() == btnR){
            ta.setText("");
        }
    }
    
    public void loadFile() {
        File f = new File("ChatDemo.dat");
        if (f.exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(f))) {
                String line;
                while ((line = br.readLine()) != null) {
                    ta.append(line + "\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public void saveFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("ChatDemo.dat"))) {
            bw.write(ta.getText());
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void windowClosing(WindowEvent e){
        saveFile();
        System.exit(0);
    }
    public void windowOpened(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}

    public static void main(String[] args) { new ChatDemo(); }
    
}
