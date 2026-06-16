
import java.util.LinkedList;

public class Day2Program5 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int n = 2;

        list.remove(list.size() - n);

        System.out.print("After removing 2nd element from end: ");
        for (int x : list) {
            System.out.print(x + " ");
        }
    }
}