package switch1;

public class Switch1 {
    public int option;
    public String showOption(){
        switch (option){
            case 1:{
            return "Su premio es una gorra...";
            }
            case 2:{
                return "Su premio es un bombom";
            }
            default:{
                return "opcion incorrecta";
            }
        }
    }
}
