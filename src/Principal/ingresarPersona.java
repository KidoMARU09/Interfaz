package Principal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ingresarPersona extends JFrame {
    private JLabel jlbNombre;
    private JTextField txtNombre;
    private JTextField txtApellido;
    private JTextField txtCodigo;
    private JComboBox cmbIdioma;
    private JLabel jlbApellido;
    private JLabel jlbCodigo;
    private JLabel jlbIdioma;
    private JLabel jlbGenero;
    private JRadioButton rbtMasculino;
    private JRadioButton rbtFemenino;
    private JRadioButton rbtOtro;
    private JRadioButton chbTerminos;
    private JButton btnGuardar;
    private JRadioButton rbtNoIndicado;
    private JPanel pnlPrincipal;

    private String getGenero() {
        return (rbtMasculino.isSelected()) ? "Masculino" :
                (rbtFemenino.isSelected()) ? "Femenino" :
                        (rbtOtro.isSelected()) ? "Otro" :
                                (rbtNoIndicado.isSelected()) ? "Prefiero no decir" :
                                        "No indicado";
    }

    public ingresarPersona() {
        // Elimina el proceso cuando se cierra la ventana
        // this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Se asigna el panel principal al JFram
        // Se asigna el tamaño por defecto
        this.setContentPane(pnlPrincipal);
        this.setSize(500, 300);
        // Se asigna la posición por defecto
        this.setLocation(100, 100);
        // No se permite redimensionar la ventana
        this.setResizable(false);
        // Se muestra la ventana como visible
        this.setVisible(true);


        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codigo = txtCodigo.getText();
                String nombre = txtNombre.getText();
                String apellido = txtApellido.getText();
                String idioma = cmbIdioma.getSelectedItem().toString();
                String aceptaTerminos = (chbTerminos.isSelected() == true) ? "Sí" : "No";
                String genero = getGenero();

                String mensaje = "Tus datos son: \n" +
                        "Código: " + codigo + "\n" +
                        "Nombre: " + nombre + "\n" +
                        "Apellido: " + apellido + "\n" +
                        "Idioma:" + idioma + "\n" +
                        "Género: " + genero + "\n" +
                        "Acepta términos y condiciones: " + aceptaTerminos;

                JOptionPane.showMessageDialog(btnGuardar, mensaje);
            }
        });
    }
}