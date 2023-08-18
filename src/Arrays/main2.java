package Arrays;

import java.lang.reflect.Array;

public class main2 {
    public static void main(String[] args) {
        String[] nombres = {"Juan", "Carlos", "Janka"};
        int[]  numbers={1, 5, 777};
        float[] floats = new float[5];
        System.out.println(numbers.length);
        floats[0] = 1.5f;
        floats[1] = 3;
        Array.set(floats, 2, 4.2);
        System.out.println(floats[1]);
        System.out.println(Array.get(floats, 1));
        for (float i:floats) {
            System.out.println(i);

        }
    }
}
