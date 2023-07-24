package Ejercicios;

public class Point2 {
    public int start;
    public int finish;

    public void showCycle() {
       for(int i=start; i<= finish; i++){
           if(i != 5){
               System.out.println(i);
           }
       }
    }

}
