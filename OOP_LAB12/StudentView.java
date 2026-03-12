import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
public class StudentView implements ActionListener ,WindowListener{
    private JFrame f;
    private JPanel p1,p2,p3,p4;
    private JLabel lbl1 , lbl2 , lbl3;
    private JTextField txt,txt1,txt2;
    private JButton bn1,bn2;
    public StudentView(){
        f = new JFrame();
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        txt = new JTextField();
        txt1 = new JTextField();
        txt2 = new JTextField("0");
        txt2.setEditable(false);
        lbl1 = new JLabel("ID:");
        lbl2 = new JLabel("Name:");
        lbl3 = new JLabel("Money:");
        f.addWindowListener(this);
        
        p1.setLayout(new GridLayout(3,1));
        p1.add(lbl1);
        p1.add(lbl2);
        p1.add(lbl3);
        p2.setLayout(new GridLayout(3,1));
        p2.add(txt);
        p2.add(txt1);
        p2.add(txt2);
        
        bn1 = new JButton("Deposit");
        bn2 = new JButton("Withdraw");
        bn1.addActionListener(this);
        bn2.addActionListener(this);
        
        p3.setLayout(new FlowLayout());
        p3.add(bn1); p3.add(bn2);
        
        p4.setLayout(new GridLayout(1,2));
        p4.add(p1); p4.add(p2);
        
        f.setLayout(new GridLayout(2,1));
        f.add(p4);
        f.add(p3);
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);
        loadFile();
        
    }
    public void actionPerformed(ActionEvent e){
        int money = Integer.parseInt(txt2.getText());
        if(e.getSource() == bn1){
            money += 100;
        }
        if(e.getSource() == bn2){
            money -= 100;
        }
        txt2.setText(String.valueOf(money));
    }
    public void loadFile(){
        File f = new File("StudentM.dat");
        if(f.exists()){
            try(FileInputStream fis = new FileInputStream(f);ObjectInputStream ois = new ObjectInputStream(fis);){
                Student s = (Student) ois.readObject();
                txt.setText(String.valueOf(s.getID()));
                txt1.setText(s.getName());
                txt2.setText(String.valueOf(s.getMoney()));
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        
    }
    public void windowClosing(WindowEvent e){
        try(FileOutputStream fos = new FileOutputStream("StudentM.dat");ObjectOutputStream oos = new ObjectOutputStream(fos);){
            String name = txt1.getText();
            int ID = txt.getText().isEmpty() ? 0 : Integer.parseInt(txt.getText());
            int money = Integer.parseInt(txt2.getText());
            
            Student s = new Student(name, ID, money);
            oos.writeObject(s);
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
        System.exit(0);
    }
    public void windowOpened(WindowEvent e){}
    public void windowClosed(WindowEvent e){}
    public void windowIconified(WindowEvent e){}
    public void windowDeiconified(WindowEvent e){}
    public void windowActivated(WindowEvent e){}
    public void windowDeactivated(WindowEvent e){}

    public static void main(String[] args) {
        new StudentView();
    }
}
