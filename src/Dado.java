import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Dado {

    private int numero;

    public void lanzar(Random r) {
        numero = r.nextInt(6) + 1; //genera un número aleatorio entre 1 y 6 (método lanzar)
    }

    public int getNumero() { 
        return numero; //devuelve el numero del dado (método obtener número)
    }

    public void mostrarDado(JLabel lblDado){
        String archivoImagen = "imagenes/"+numero+".jpg"; // ruta de la imagen
        ImageIcon imgDado = new ImageIcon(getClass().getResource(archivoImagen)); // crear el objeto ImageIcon

        lblDado.setIcon(imgDado); // establecer la imagen del dado en el JLabel

    }
}
