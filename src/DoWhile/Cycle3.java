package DoWhile;

public class Cycle3 {
    public int start;
    public int finish;
    public void showCycle(){
        do{
            System.out.println(start);
            start++;
        }while(start <= finish);
    }
}
