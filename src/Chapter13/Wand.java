package Chapter13;

public class Wand {
    private String name;
    private double power;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() < 3) {
            new IllegalArgumentException("名前が短いです");
        }
        this.name = name;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        if (power > 100) {
           power = 100;
        }
        if (power < 0.5) {
            power = 0.5;
        }
        this.power = power;
    }
}
