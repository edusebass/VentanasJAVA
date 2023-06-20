import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class PanelDibujo extends JPanel{
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int anchura = 100;
        int altura = 100;

        //seterar las lineas
        g.drawLine(50,50,50,100);
        g.drawLine(50,50,100,50);
        g.drawLine(50,75,100, 75);
        g.drawLine(50,100,100,100);

        //dibujo un circulo
        g.drawRoundRect(0,0,50,50,30,30);

        //crea la palabra en la posicion que la pongas
        g.drawString("Eduardo", 150, 150);

        //Utilizndo el metodo draw string, dibuje una ventana el nombre del usuario que ingrese por consola
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el nombre: ");
        String nombre = sc.nextLine();

        g.drawString(nombre, 250, 250);

        //ejercicio del imc
        int peso = 23;
        int estatura = 34;
        int imc;

        imc = peso * (estatura * estatura);

        String imcc = Integer.toString(imc);

        g.drawString(imcc, 600, 600);
    }


}
