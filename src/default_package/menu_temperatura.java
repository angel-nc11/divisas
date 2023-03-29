package default_package;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menu_temperatura extends JFrame {
    private JComboBox comboBox_tipoTemp1;
    private JTextField textField_tipoTemp;
    private JComboBox comboBox_tipoTemp2;
    private JTextArea textArea_resultado;
    private JButton convertirButton;
    private JPanel panelTemperatura;

    private double valorTemperatura;
    private int tipoTemp1, tipoTemp2;

    public menu_temperatura(){
        super("Temperatura");
        setContentPane(panelTemperatura);
        JMenuBar ventana = new JMenuBar();
        JMenu archivo = new JMenu("Archivo");
        JMenuItem Salir = new JMenuItem("Salir");

        ventana.add(archivo);
        archivo.add(Salir);
        setJMenuBar(ventana);

        Salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();

            }
        });


        convertirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            valorTemperatura =Double.parseDouble(textField_tipoTemp.getText());
            tipoTemp1 = comboBox_tipoTemp1.getSelectedIndex();
            tipoTemp2 = comboBox_tipoTemp2.getSelectedIndex();

            OpTemperatura temp = new OpTemperatura();
            temp.setValorTemperatura(valorTemperatura);
            temp.setTipoTemp1(tipoTemp1);
            temp.setTipoTemp2(tipoTemp2);

            var resultado = temp.conversion();
            //limpiar area
            textArea_resultado.setText("");
            //mostrar datos
            textArea_resultado.append(""+resultado);
            }
        });
    }
}


