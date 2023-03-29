package default_package;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menu_monedas extends JFrame{
    private JPanel panelMoneda;
    private JTextField textField_tipoMoneda;
    private JComboBox comboBox_tipoMoneda1;
    private JComboBox comboBox_tipoMoneda2;
    private JButton convertirButton;
    private JTextArea textArea_resultado;

    //VARIABLES A UTILIZAR
    double valorMoneda;
    private JMenuBar ventana;
    private JMenu archivo;
    private JMenuItem Salir;

    public menu_monedas() {
        super("Divisas");
        setContentPane(panelMoneda);
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

        convertirButton.addActionListener(new ActionListener() { // btm p/obtener datos ingresados y imprimir en txt_area
            @Override
            public void actionPerformed(ActionEvent e) {

                valorMoneda = Double.parseDouble(textField_tipoMoneda.getText());
                int tipoValorModena1 = comboBox_tipoMoneda1.getSelectedIndex();
                int tipoValorModena2 = comboBox_tipoMoneda2.getSelectedIndex();



                OpDivisas divisas = new OpDivisas();
                divisas.setValorMoneda(valorMoneda);
                divisas.setValorMoneda1(tipoValorModena1);
                divisas.setValorMoneda2(tipoValorModena2);

                var resultado=divisas.conversion();
                //limpiar area
                textArea_resultado.setText("");
                //mostrar dato
                textArea_resultado.append(""+resultado);


            }
        });
    }


}

