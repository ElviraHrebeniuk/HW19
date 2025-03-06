public class Rectangle {
    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public static int calcArea(){
        return sideA*sideB;
    }

    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Rectangle rectangle = (Rectangle) object;
        return sideA == rectangle.sideA && sideB == rectangle.sideB;
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), sideA, sideB);
    }
}
