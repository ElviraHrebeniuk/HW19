import java.util.Objects;

public class Circle  extends  Figures {
    private String name;
    private double radius;

    public Circle(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }


    //public Manager(String name, int salary, int bonus) {
//    super(name,salary);
//    this.bonus = bonus;
//}

    @Override
    public double calcArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(radius, circle.radius) == 0 && Objects.equals(name, circle.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, radius);
    }

    @Override
    public String toString() {
        return "Circle{" + "name='" + name + ", radius=" + radius + '}';
    }
}
