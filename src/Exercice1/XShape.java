package Exercice1;

// Derived Class
public class XShape extends Shape {
    private String name;

    public XShape(String name) {
        this.name = name;
    }

    public String getName() {
        return super.getName() + ", " + this.name;
    }

}
