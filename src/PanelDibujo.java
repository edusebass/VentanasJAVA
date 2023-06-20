import javax.swing.*;
import java.awt.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class PanelDibujo extends JPanel{
    int anchura = 100;
    int altura = 100;

    double peso;
    double estatura;
    double imc;
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Scanner sc = new Scanner(System.in);

        //seterar las lineas
        //g.drawLine(50,50,50,100);
        //g.drawLine(50,50,100,50);
        //g.drawLine(50,75,100, 75);
        //g.drawLine(50,100,100,100);

        //dibujo un circulo
        /*
        g.drawRoundRect(0,0,50,50,30,30);

        //crea la palabra en la posicion que la pongas
        g.drawString("Eduardo", 150, 150);

        //Utilizndo el metodo draw string, dibuje una ventana el nombre del usuario que ingrese por consola

        System.out.println("Ingresa el nombre: ");
        String nombre = sc.nextLine();

        g.drawString(nombre, 250, 250);
        */

        //ejercicio del IMC
        g.drawString("-----IMC-----", 10, 10);
        System.out.println("Ingrese su peso: ");
        peso = sc.nextDouble();
        sc.nextLine();
        g.drawString("Tu peso es: " + peso, 10, 20);
        System.out.println("Ingrese su altura: ");
        estatura = sc.nextDouble();
        sc.nextLine();
        g.drawString("Tu estatura es" + estatura, 10, 30);
        imc = peso * (altura * altura);
        g.drawString("Tu IMC es: " + imc, 10, 40);





    }


}
