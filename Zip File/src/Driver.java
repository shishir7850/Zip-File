/**
 * Created by Shishir on 25/10/16.
 */


import javax.swing.*;

public class Driver {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainWindow ex = new MainWindow();
                ex.setVisible(true);
            }
        });
    }
}
