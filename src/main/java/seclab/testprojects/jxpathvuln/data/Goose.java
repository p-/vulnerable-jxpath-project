package seclab.testprojects.jxpathvuln.data;

public class Goose {
    private final String name;
    private final int heightInCm;

    public Goose(String name, int heightInCm) {
        this.name = name;
        this.heightInCm = heightInCm;
    }

    public String getName() {
        return name;
    }

    public int heightInCm() {
        return heightInCm;
    }
}
