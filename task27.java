import java.util.LinkedHashMap;

class LinkedHashMapDemo {
    void display() {
        LinkedHashMap<Integer, String> students = new LinkedHashMap<>();

        students.put(101, "Rahul");
        students.put(102, "Nandini");
        students.put(103, "Priya");

        System.out.println("Students: " + students);

        System.out.println("Student 101: " + students.get(101));

        students.put(102, "Kiran");

        students.remove(103);

        System.out.println("Updated Map: " + students);
    }
}

public class task27 {
    public static void main(String[] args) {
        LinkedHashMapDemo obj = new LinkedHashMapDemo();
        obj.display();
    }
}