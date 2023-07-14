package Semaforo;

public class TrafficLight {
    public String color;
    public boolean state;

    public String showState() {
        if (state) {
            return "semaforo encendido";
        } else {
            return "semaforo esta apagado";
        }
    }
        public String showMessage() {
            if (color.equals("verde")) {
                return "siga";
            } else if (color.equals("rojo")) {
                return "pare";

            } else if (color.equals("amarillo")) {
                return "Encienda motores";
            } else {
                return "Esta dañado";
            }
        }
    }
