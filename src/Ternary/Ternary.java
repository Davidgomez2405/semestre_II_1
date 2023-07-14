package Ternary;

public class Ternary {
    public int state;
    public boolean state2;

    public int showMessage(){
        int x = state> 0 ? 4 : 5;
        int y = state2 ? 8 : 3;
        return x;
    }
}
