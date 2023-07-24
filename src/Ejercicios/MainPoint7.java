package Ejercicios;

import javax.swing.*;
import java.util.jar.JarOutputStream;

public class MainPoint7 {
    public static void main (String[] args){
        Point7 point7 = new Point7();

        point7.typeOfService = Integer.parseInt(JOptionPane.showInputDialog("Que desea hacer?: 1.Retraso 2. Perdida"));
        point7.quantityOfBooks=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de copias"));

        if (point7.typeOfService == 1){
            point7.typeOfBook = Integer.parseInt(JOptionPane.showInputDialog("Que tipo de libro es? 1. Libro 2. Revista"));
            point7.daysLate = Integer.parseInt(JOptionPane.showInputDialog("Cuantos dias se retraso?"));
            point7.rent();
        }else {
            point7.loss();
        }
    }
}
