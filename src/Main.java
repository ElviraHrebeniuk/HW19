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
        System.out.println("----------------");
        System.out.println(allArea(figures));
        System.out.println(findFigur(figures, new Circle("Circle", 6)));
        System.out.println(findFigur(figures, new Circle("Circle", 5)));
        System.out.println(findFiguresAreaGreater(figures, 10));
    }

    public static double allArea(List<Figures>  list){
        double result=0;
        for (int i = 0; i < list.size(); i++) {
           result += list.get(i).calcArea();
        }
        return result;
    }
    public static boolean findFigur(List<Figures>  list, Figures figur){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals(figur)) return true;
        }
        return false;
    }
    public static List<Figures> findFiguresAreaGreater(List<Figures> list, double area){
        List<Figures> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).calcArea()>area)
                result.add(list.get(i));
        }
        return result;
    }
}