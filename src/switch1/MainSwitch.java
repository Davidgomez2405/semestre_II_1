package switch1;

import java.util.Scanner;

public class MainSwitch{
    public static void main(String[] args){
        Switch1 s= new Switch1();
        Switch1 a= new Switch1();
        Scanner lector = new Scanner(System.in);//El scanner funciona para ingresar datos por la consola

        System.out.println("Ingrese una opcion: ");
        a.option=  lector.nextInt();

        System.out.println(a.showOption());
    }
}
