package Ejercicios;

import com.sun.tools.javac.Main;

import javax.swing.*;

public class MainPoint6 {
    public static void main (String[] args){
        Point6 point6 = new Point6();

        point6.menu = Integer.parseInt(JOptionPane.showInputDialog("Que desea comer? 1. Pizza 2. Sandwich 3. Ensalada"));
        point6.amount = Integer.parseInt(JOptionPane.showInputDialog("Cuantas piezas desea?"));
        point6.sauce = JOptionPane.showInputDialog("Desea salsa?");

        if(point6.menu == 1){
            point6.pizza();
        } else if (point6.menu == 2) {
            point6.sandwich();
        }else if (point6.menu == 3) {
            point6.salad();
        }else {
            JOptionPane.showMessageDialog(null,"Esta opcion no es valida");
        }
    }
}
