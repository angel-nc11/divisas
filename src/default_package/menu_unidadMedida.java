package default_package;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menu_unidadMedida extends JFrame{
    private JComboBox comboBox_tipoMedida1;
    private JTextField textField_tipoMedida;
    private JComboBox comboBox_tipoMedida2;
    private JTextArea textArea_resultado;
    private JButton convertirButton;
    private JPanel panelMedida;

    private double valorMedida;
    private int tipoMedida1, tipoMedida2;

    public menu_unidadMedida(){
        super("Unidad de Medida");
        setContentPane(panelMedida);
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
            valorMedida = Double.parseDouble(textField_tipoMedida.getText());
            tipoMedida1 = comboBox_tipoMedida1.getSelectedIndex();
            tipoMedida2 = comboBox_tipoMedida2.getSelectedIndex();

            OpMedidas medidas = new OpMedidas();
            medidas.setValorMedida(valorMedida);
            medidas.setTipoMedida1(tipoMedida1);
            medidas.setTipoMedida2(tipoMedida2);

            var resultado = medidas.conversorMedida();

            textArea_resultado.setText("");
            textArea_resultado.append(""+resultado);
            }
        });
    }
}
