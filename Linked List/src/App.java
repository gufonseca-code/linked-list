import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class App {
    public static Vector<Integer> toVector(LinkedList<Integer> linkedList) {
        Iterator<Integer> iterator = linkedList.iterator();
        Vector<Integer> vector = new Vector<>();
        
        while (iterator.hasNext()) {
            vector.add(iterator.next());
        }

        return vector;
    }

    public static void main(String[] args) throws Exception {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        
        System.out.println(toVector(linkedList));
    }
}