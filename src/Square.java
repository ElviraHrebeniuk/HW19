import java.util.Objects;

public class Square  extends  Figures{
    private  String name;
    private int sideOfSquare;

    public Square(String name, int sideOfSquare) {
        this.name = name;
        this.sideOfSquare = sideOfSquare;
    }

    @Override
   public double calcArea() {
        return  sideOfSquare*sideOfSquare;
   }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Square square = (Square) o;
        return sideOfSquare == square.sideOfSquare && Objects.equals(name, square.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, sideOfSquare);
    }

    @Override
    public String toString() {
        return "Square{" + "name='" + name + ", sideOfSquare=" + sideOfSquare +'}';
    }
}
