public class Square {
    private int sideOfSquare;

    public Square(int sideOfSquare) {
        this.sideOfSquare = sideOfSquare;
    }

   public static int calcArea() {
        return  sideOfSquare*sideOfSquare;
   }

    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Square square = (Square) object;
        return sideOfSquare == square.sideOfSquare;
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), sideOfSquare);
    }
}
