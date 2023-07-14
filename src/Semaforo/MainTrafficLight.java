package Semaforo;

public class MainTrafficLight {
    public static void main(String[] args) {
        TrafficLight trafficLight= new TrafficLight();
        trafficLight.color = "rojo";
        trafficLight.state= true;
        if(trafficLight.state){
            System.out.println(trafficLight.showMessage());
        }
    }
}
