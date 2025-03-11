import java.util.Objects;

public class Rectangle  extends  Figures{
    private  String name;
    private double sideA;
    private double sideB;


    public Rectangle(String name, double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.name = name;
    }

    @Override
    public double calcArea(){
        return sideA*sideB;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return sideA == rectangle.sideA && sideB == rectangle.sideB && Objects.equals(name, rectangle.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sideA, sideB, name);
    }

    @Override
    public String toString() {
        return "Rectangle{" + "name='" + name + ", sideA=" + sideA + ", sideB=" + sideB +'}';
    }
}
