import java.util.HashMap;

class HashMapDemo {
    void display() {
        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Rahul");
        students.put(102, "Nandini");
        students.put(103, "Priya");

        System.out.println("Students: " + students);

        System.out.println("Student 102: " + students.get(102));

        students.put(102, "Kiran");

        students.remove(103);

        System.out.println("Updated Map: " + students);
    }
}

public class task25 {
    public static void main(String[] args) {
        HashMapDemo obj = new HashMapDemo();
        obj.display();
    }
}