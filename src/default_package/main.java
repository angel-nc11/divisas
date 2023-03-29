package default_package;

import javax.swing.*;

public class main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame framePrincipal = new menuPrincipal();
                framePrincipal.setSize(300,250);
                framePrincipal.setVisible(true);
            }
        });
    }
}
