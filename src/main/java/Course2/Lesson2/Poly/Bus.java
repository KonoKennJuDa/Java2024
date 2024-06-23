package Course2.Lesson2.Poly;

public class Bus extends Transport {

    private String marshrout;

    public String getMarshrout() {
        return marshrout;
    }

    public void setMarshrout(String marshrout) {
        this.marshrout = marshrout;
    }

    @Override
    void load() {
        System.out.println("Люди ломятся в автобус");
    }
}
