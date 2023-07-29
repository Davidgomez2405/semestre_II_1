package constructor;

public class MainGame {
    public static void main(String[] args) {
        Character valquiria = new Character("Valquiria", 1200, 100, 4);
        Character miniPekka = new Character("Mini Pekka", 1500, 400, 5);
        Deck deck1 = new Deck(8,4,"Exotico", 13);
        Arena arena = new Arena();//Llama al primer constructor por que no tiene parametros
        Arena arena2 = new Arena(23);//Llama al segundo constructor por que tiene 1 parametros
        Arena arena3 = new Arena(23,5);//Llama al tercer constructor por que tiene 2 parametros
        Arena arena4 = new Arena(2,4,7);//Llama al cuarto constructor por que tiene 3 parametros

    }
}
