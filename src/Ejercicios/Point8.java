package Ejercicios;

import javax.swing.*;

public class Point8 {
    public float sideA;
    public float sideB;
    public float sideC;

    public boolean triangle() {
        if (sideA == sideB && sideB == sideC && sideC == sideA) {
            JOptionPane.showMessageDialog(null, "El triangulo es equilatero ");
        } else if (sideA != sideB || sideB != sideC || sideC != sideA) {
            JOptionPane.showMessageDialog(null, "El triangulo no es equilatero");
        }
        return false;
    }
}
