import java.util.TreeMap;

class TreeMapDemo {
    void display() {
        TreeMap<Integer, String> students = new TreeMap<>();

        students.put(103, "Priya");
        students.put(101, "Rahul");
        students.put(102, "Nandini");

        System.out.println("Students: " + students);

        System.out.println("First Key: " + students.firstKey());
        System.out.println("Last Key: " + students.lastKey());

        students.remove(102);

        System.out.println("After Removing: " + students);
    }
}

public class task26 {
    public static void main(String[] args) {
        TreeMapDemo obj = new TreeMapDemo();
        obj.display();
    }
}