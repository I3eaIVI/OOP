import javax.swing.*;
import java.awt.*;

public class MyClock1 extends JLabel implements Runnable {

    private int sec = 0;

    public MyClock1() {
        setFont(new Font("Arial", Font.BOLD, 50));
        setHorizontalAlignment(JLabel.CENTER);
    }

    public void run() {

        while(true){
            int hour = sec / 3600;
            int min = (sec % 3600) / 60;
            int second = sec % 60;
            setText(String.format("%02d:%02d:%02d", hour, min, second));
            sec++;

            try{
                Thread.sleep(1000);
            }
            catch(Exception e){}
        }
    }
}