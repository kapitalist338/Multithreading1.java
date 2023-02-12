import javax.swing.*;

public class Window extends Thread {
    JProgressBar jpb;
    JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Thread1");
        jpb = new JProgressBar();
        jpb.setValue(0);
        jpb.setBounds(0, 0, 350, 100);
        jpb.setStringPainted(true);
        frame.add(jpb);
        frame.setBounds(200, 300, 350, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        feel();
    }

    private void feel(){
        int i = 0;
        while(i <= 100){
            jpb.setValue(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i += 10;
        }
    }
}
