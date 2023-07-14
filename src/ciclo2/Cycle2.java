package ciclo2;

public class Cycle2 {
    public int start;
    public int finish;
    public void showCycle(){
        while (start<= finish){
            System.out.println(start);
            start+=2;
        }
    }
}
