package activity;

public class main {
    public static void main(String[] args) {
        Division division = new Division();
        System.out.println("The result of dividing"+division.number1+"by"
        + division.number2+"is"+division.div());

        Subtraction subtraction = new Subtraction();
        System.out.println("The result of subtracting"+ subtraction.number4
        + "from" + subtraction.number3 + "is" + subtraction.sub());

        Multiplication multiplication = new Multiplication();
        System.out.println("The result of multiplying"+ multiplication.number6
                + "by" + multiplication.number5 + "is" + multiplication.multi());

        Person person = new Person();
        System.out.println("Personal information: \n Name:" + person.name + "\n Last Name:" + person.lastname +
                "\n Is she single?: "+ person.Single + "\n Age:"+ person.Age + "\n Cash Money: $" + person.cashMoney+
                "\n Gender:" + person.gender + "\n Salary: $" +person.salary+"\n Account Money: $" + person.accountMoney+
                "\n Height:" +person.height +"cm" + "\n Favorite Number:" +person.FavoriteNumber);
    }
}
