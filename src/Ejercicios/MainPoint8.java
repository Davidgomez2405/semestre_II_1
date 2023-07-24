package Ejercicios;

import javax.swing.*;

public class MainPoint8 {
    public static void main (String[] args){
        Point8 point8 = new Point8();

        point8.sideA = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del lado A"));
        point8.sideB = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del lado B"));
        point8.sideC = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del lado C"));

        boolean triangle= point8.triangle();
    }
}
