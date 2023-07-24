package Ejercicios;

import javax.swing.*;

public class Point6 {
    public Integer menu;
    public  Integer amount;
    public String sauce;
    public int total;

    public void pizza(){
        if(sauce.equalsIgnoreCase("si")){
            total = (amount * 7000) + 3000;
            JOptionPane.showMessageDialog(null, "Uted tendra que pagar:" +total);
        }else if(sauce.equalsIgnoreCase("no")){
            total = amount * 7000;
            JOptionPane.showMessageDialog(null,"Usted tendra que pagar:" +total);
        }
    }
    public void sandwich(){
        if (sauce.equalsIgnoreCase("si")){
            total = (amount * 5000) +3000;
            JOptionPane.showMessageDialog(null, "Usted tendra que pagar:" +total);
        } else if (sauce.equalsIgnoreCase("no")){
            total = amount * 5000;
            JOptionPane.showMessageDialog(null, "Usted tendra que pagar:" +total);
        }
    }
    public void salad(){
        if (sauce.equalsIgnoreCase("si")){
            total = (amount * 15000) +3000;
            JOptionPane.showMessageDialog(null, "Usted tendra que pagar:" +total);
        }else if (sauce.equalsIgnoreCase("no")){
            total = amount * 15000;
            JOptionPane.showMessageDialog(null, "Usted tendra que pagar" +total);
        }
    }
}
