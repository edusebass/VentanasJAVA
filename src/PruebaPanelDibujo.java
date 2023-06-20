import javax.swing.*;
import java.util.Scanner;

public class PruebaPanelDibujo {
    public static void main(String[] args) {
        //creo unas instancias de la clase PADRE
        PanelDibujo panel = new PanelDibujo();
        //creo un marco en la ventana
        JFrame aplicacion = new JFrame();

        //pongo un boton para cerra la ventana
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Scanner sc = new Scanner(System.in);


        //agrego un panel
        aplicacion.add(panel);
        aplicacion.setSize(700, 700); //seteo el tamaño de la ventana
        aplicacion.setVisible(true); //permito que se vea


    }
}