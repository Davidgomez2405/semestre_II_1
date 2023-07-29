package constructor;

public class Carr {
    private String plate;
    private int model;

    public Carr(String plate, int model) {
        this.plate = plate;
        this.model = model;
    }

    public String getPlate() {
        return plate;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public void setPlate(String plate) {
        this.plate = plate;

    }
}
