package day48_constructors_static;

public class Engine {
    private int Cylinder;

    @Override
    public String toString() {
        return "Engine{" +
                "cylinder=" + Cylinder +
                '}';
    }

    public int getCylinder() {
        return Cylinder;
    }

    public void setCylinder(int cylinder) {
        this.Cylinder = cylinder;
    }

}
