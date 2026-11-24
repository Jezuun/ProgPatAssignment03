import java.util.*;

public class LibraryUtils {
    public static void printList(String heading, List<?> list){
        System.out.println(heading);
        for (Object item : list) {
            System.out.println(item);
        }
    }
    public static double CalculateTotal(List<? extends  Number> list){
        double total = 0;
        for (Number item : list){
            total += item.doubleValue();
        }
        return total;
    }
}
