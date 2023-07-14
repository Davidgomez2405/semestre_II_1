package MaquinaDsipensadora;

public class CandyMachine {
    public int candy;
    public int money;
    public String showCandy()
    {
        switch(candy){
        case 1:{
            System.out.println("Usted ha escogido el dulce 1");
        }
        case 2:{
            System.out.println("Usted no ha escogido ningun dulce");
        }
            default:{
                return "Opcion incorrecta";
            }
        }
    }
    public String showMessage(){
       if (money<2000){
           return "El dinero no es suficiente";
       } else if(money>=2000){
           System.out.println("Puede tomar el dulce escogido");
       }else {
           return "Usted no ha ingresado dinero";
       }
        return null;
    }
}
