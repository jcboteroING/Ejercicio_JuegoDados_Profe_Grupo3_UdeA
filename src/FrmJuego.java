import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class FrmJuego extends JFrame {

    // método constructor
    public FrmJuego() {
        setSize(500, 300); // tamaño de la ventana
        setTitle("Juguemos a los dados"); // título de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // acción al cerrar la ventana
        setLayout(null); // sin layout para posicionar los componentes manualmente

        String archivoImagen = "imagenes/3.jpg"; // ruta de la imagen
        ImageIcon imgDado = new ImageIcon(getClass().getResource(archivoImagen)); // crear el objeto ImageIcon

        JLabel lblDado1 = new JLabel(imgDado); // crear un JLabel con la imagen
        lblDado1.setBounds(10, 10, imgDado.getIconWidth(), imgDado.getIconHeight()); // posicionar el JLabel
        add(lblDado1); // agregar el JLabel a la ventana

        JLabel lblDado2 = new JLabel(imgDado); // crear un JLabel con la imagen
        lblDado2.setBounds(20 + imgDado.getIconWidth(), 10, imgDado.getIconWidth(), imgDado.getIconHeight()); // posicionar el JLabel a la derecha del primer dado, con un espacio de 10 píxeles entre ellos
        add(lblDado2); // agregar el JLabel a la ventana

        JLabel lblTituloLanzamientos = new JLabel("Lanzamientos"); // crear un JLabel con el texto
        lblTituloLanzamientos.setBounds(30 + 2*imgDado.getIconWidth(), 10, 100, 25); // posicionar el JLabel
        lblTituloLanzamientos.setHorizontalAlignment(JLabel.CENTER);
        add(lblTituloLanzamientos); // agregar el JLabel a la ventana

        JLabel lblLanzamientos = new JLabel("0"); // crear un JLabel con el número de lanzamientos
        lblLanzamientos.setBounds(30 + 2*imgDado.getIconWidth(), 45, 100, 100); // posicionar el JLabel debajo del título de lanzamientos
        lblLanzamientos.setFont(new Font("Impact", Font.BOLD, 72)); // aumentar el tamaño de la fuente del número de lanzamientos   
        lblLanzamientos.setHorizontalAlignment(JLabel.RIGHT); // centrar el número de lanzamientos horizontalmente a la derecha
        lblLanzamientos.setBackground(new Color(0, 0, 0)); 
        lblLanzamientos.setForeground(new Color(0, 255, 0));
        lblLanzamientos.setOpaque(true); // hacer que el fondo del JLabel sea visible
        add(lblLanzamientos); // agregar el JLabel a la ventana

        JLabel lblTituloCenas = new JLabel("Cenas"); // crear un JLabel con el texto
        lblTituloCenas.setBounds(140 + 2*imgDado.getIconWidth(), 10, 100, 25); // posicionar el JLabel
        lblTituloCenas.setHorizontalAlignment(JLabel.CENTER); // centrar el texto del título de Cenas horizontalmente
        add(lblTituloCenas); // agregar el JLabel a la ventana

        JLabel lblCenas = new JLabel("0"); // crear un JLabel con el número de Cenas
        lblCenas.setBounds(140 + 2*imgDado.getIconWidth(), 45, 100, 100); // posicionar el JLabel debajo del título de Cenas
        lblCenas.setFont(new Font("Impact", Font.BOLD, 72)); // aumentar el tamaño de la fuente del número de Cenas   
        lblCenas.setHorizontalAlignment(JLabel.RIGHT); // centrar el número de Cenas horizontalmente a la derecha
        lblCenas.setBackground(new Color(0, 0, 0)); // establecer el fondo del JLabel de C
        lblCenas.setForeground(new Color(0, 255, 0)); // establecer el color del texto del número de Cenas a verde
        lblCenas.setOpaque(true); // hacer que el fondo del JLabel sea visible
        add(lblCenas); // agregar el JLabel a la ventana

        JButton btnIniciar = new JButton("Iniciar"); // crear un JButton con el texto "Iniciar"
        btnIniciar.setBounds(10, 20+imgDado.getIconHeight(), 100, 25); // posicionar el JButton debajo de los JLabel de lanzamientos y Cenas
        add(btnIniciar); // agregar el JButton a la ventana


        JButton btnLanzar = new JButton("Lanzar"); // crear un JButton con el texto "Iniciar"
        btnLanzar.setBounds(10, 55+imgDado.getIconHeight(), 100, 25); // posicionar el JButton debajo de los JLabel de lanzamientos y Cenas
        add(btnLanzar); // agregar el JButton a la ventana

        // eventos
        btnIniciar.addActionListener(evt -> {
            iniciarLanzamientos(); // llamar al método iniciarLanzamientos() cuando se haga clic en el botón "Iniciar"
        }); // agregar un ActionListener al botón "Iniciar" para manejar el evento de clic
        btnLanzar.addActionListener(evt -> {
            lanzarDados(); // llamar al método lanzarDados() cuando se haga clic en el botón "Lanzar"
        }); // agregar un ActionListener al botón "Lanzar" para manejar el evento de clic
     
     
    }

    private void iniciarLanzamientos() {
        // lógica para iniciar los lanzamientos
        JOptionPane.showMessageDialog(null, "Ha hecho clic en el botón Iniciar"); // mostrar un mensaje de diálogo indicando que los lanzamientos han sido iniciados
    }

    private void lanzarDados() {
        // lógica para lanzar los dados
        JOptionPane.showMessageDialog(null, "Ha hecho clic en el botón Lanzar"); // mostrar un mensaje de diálogo indicando que los dados han sido lanzados
    }

}
