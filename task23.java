import java.util.HashSet;

class HashSetDemo{
    void display() {
        HashSet<String> names = new HashSet<>();

        names.add("Rahul");
        names.add("Nandini");
        names.add("Priya");
        names.add("Rahul");

        System.out.println("Names: " + names);

        System.out.println("Contains Nandini: " + names.contains("Nandini"));

        names.remove("Priya");

        System.out.println("After Removing: " + names);
        System.out.println("Size: " + names.size());
    }
}

public class task23{
    public static void main(String[] args) {
        HashSetDemo obj = new HashSetDemo();
        obj.display();
    }
}