package Arrays;

import java.lang.reflect.Array;

public class MainServicio {
    public static void main(String[] args) {
        ServicioCelular [] servicio = new ServicioCelular[2];
        int[][] x =new int[2][3];
        Cliente cliente = new Cliente(2023,"Julio");
        Array.set(servicio,0,new ServicioCelular(cliente,"3212447299"));
        System.out.println(servicio[0].getNumero());
    }
}
