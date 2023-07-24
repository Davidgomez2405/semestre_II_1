package Ejercicios;

import javax.swing.*;

public class Point7 {
    public Integer typeOfService;
    public Integer daysLate;
    public Integer typeOfBook;
    public Integer quantityOfBooks;
    public int total;
    public void rent(){
        switch (typeOfBook){
            case 1: {
                total = (daysLate * 600) * quantityOfBooks;
                JOptionPane.showMessageDialog(null,"Tu tienes que pagar:" +total);

            }break;
            case 2:
                total = (daysLate * 500) * quantityOfBooks;
                JOptionPane.showMessageDialog(null, "Usted tiene que pagar" +total);
        }
    }
    public void loss(){
        total = quantityOfBooks * 10000;
        JOptionPane.showMessageDialog(null, "Usted tiene que pagar:" +total);
    }
}
