import javax.swing.*;
import java.awt.*;
import java.util.*;
public class MyClock extends JLabel implements Runnable {
    public MyClock() {
        setFont(new Font("Arial", Font.BOLD, 50));
        setHorizontalAlignment(JLabel.CENTER);
    }
    public void run() {
        while(true){
            Calendar d = Calendar.getInstance();

            int sec = d.get(Calendar.SECOND);
            int min = d.get(Calendar.MINUTE);
            int hour = d.get(Calendar.HOUR_OF_DAY);

            String time = String.format("%02d:%02d:%02d", hour, min, sec);

            setText(time);

            try{
                Thread.sleep(1000);
            }
            catch(Exception e){}
        }
    }
}