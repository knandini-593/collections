import java.util.ArrayList;

class ArrayListDemo {
    void display() {
        ArrayList<String> names = new ArrayList<>();

        names.add("Rahul");
        names.add("Nandini");
        names.add("Priya");

        System.out.println("Names: " + names);

        names.remove("Priya");

        System.out.println("After Removing: " + names);
        System.out.println("First Name: " + names.get(0));
        System.out.println("Size: " + names.size());
    }
}

public class arraylist{
    public static void main(String[] args) {
        ArrayListDemo obj = new ArrayListDemo();
        obj.display();
    }
}