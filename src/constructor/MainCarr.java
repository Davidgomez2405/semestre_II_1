package constructor;

import java.sql.SQLOutput;

public class MainCarr {
    public static void main(String[] args) {
        Carr car = new Carr("NFO 57D",2014);
        Carr car2 = new Carr("EJU 442", 2024);
        car.setPlate("xxx123");
        System.out.println(car.getPlate());
    }
}
