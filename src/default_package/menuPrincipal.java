package default_package;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menuPrincipal extends JFrame{
    private JComboBox Menu;
    private JLabel name;
    private JPanel panelPrincipal;
    private JButton iniciarButton;
    private JButton salirButton;
    int iniciar;
    public menuPrincipal(){
        super("Menu");
        setContentPane(panelPrincipal);



        iniciarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            iniciar = Menu.getSelectedIndex();

            if (iniciar == 0){
                JFrame frameMonedas = new menu_monedas();
                frameMonedas.setSize(300,250);
                frameMonedas.setVisible(true);
            }if (iniciar == 1) {
                JFrame frameTemperatura = new menu_temperatura();
                frameTemperatura.setSize(300,250);
                frameTemperatura.setVisible(true);
            }if (iniciar == 2){
                    JFrame frameMedida = new menu_unidadMedida();
                    frameMedida.setSize(300,250);
                    frameMedida.setVisible(true);
                }
            }
        });
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                System.exit(0);
            }
        });
    }
}


