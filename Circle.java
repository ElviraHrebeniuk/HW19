public class Circle {
   private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public static  int calcArea(){
        return Math.PI*radius*radius;
    }

    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Circle circle = (Circle) object;
        return radius == circle.radius;
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), radius);
    }
}
