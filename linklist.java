import java.util.LinkedList;

class LinkedListDemo {
    void display() {
        LinkedList<String> fruits = new LinkedList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println("Fruits: " + fruits);

        fruits.addFirst("Orange");
        fruits.addLast("Grapes");

        System.out.println("Updated List: " + fruits);

        fruits.removeFirst();

        System.out.println("After Removing: " + fruits);
    }
}

public class linklist {
    public static void main(String[] args) {
        LinkedListDemo obj = new LinkedListDemo();
        obj.display();
    }
}