package encapsulation;

public class MainFutbol {
    public static void main(String[] args) {
        soccerPlayer soccerPlayer = new soccerPlayer();
        soccerPlayer.setName("vergara");
        soccerPlayer.setGolesAnotados(6);
        soccerPlayer.setNumeroCamiseta(10);
        System.out.println(soccerPlayer.getName());
    }
}

