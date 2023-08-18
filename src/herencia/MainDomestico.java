package herencia;

public class MainDomestico {
    public static void main(String[] args) {
        Dog dog = new Dog("Firulais", 17);
        int x=5;
        x=6;
        dog.super.comer();
    }
}
