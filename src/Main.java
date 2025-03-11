import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Circle c1 = new Circle("Circle",6);
        Square sq1 = new Square("Square",10);
        Rectangle rec1 = new Rectangle("Rectangle",3,2.2);

        List<Figures> figures = new ArrayList<>();
        figures.add(c1);
        figures.add(sq1);
        figures.add(rec1);

        for(Figures list : figures) System.out.println(list);
    }
}