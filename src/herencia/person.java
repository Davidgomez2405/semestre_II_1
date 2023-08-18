package herencia;

public class person {
    private int id;
    private String name;

    public int getId() {
        return id;
    }
    public person() {
    }

    public person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
class Employee extends person {
    public String charge;
    public Employee (String charge){
        this.charge = charge;
    }

    public Employee(int id, String name, String charge) {
        super(id, name);
        this.charge = charge;
    }
}
//La clase FINAL no se puede heredar por otras clases
//Extends sirve para la herencia, por lo tanto, empleado va a heredar de la clase persona
