public class Circle {
   private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public static  int calcArea(){
        return Math.PI*radius*radius;
    }
}
