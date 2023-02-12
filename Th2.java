import javax.swing.*;
import java.awt.*;

public class Th2 extends Thread{
    public static JLabel lab = new JLabel();
    public static JFrame f = new JFrame("Thread2");

    @Override
    public void run() {
        f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        f.setSize(400,400);
        lab.setSize(200,60);
        double a = 28.38893884938 / 57 * 473287.58 - (49 * 50);
        lab.setText("All have done! My result:" + a);
        f.setLayout(new FlowLayout(10,10,10));
        f.add(lab);
        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {

        }

        f.setVisible(true);
    }
}
