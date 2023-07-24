package Ejercicios;
import javax.swing.*;
public class MainPoint14 {
    public static void main(String[] args) {
        Ejercicio14 ejercicio14 = new Ejercicio14();
        ejercicio14.tabla = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de tabla de multiplicar "));
        ejercicio14.mostrarCiclo();
    }
}

