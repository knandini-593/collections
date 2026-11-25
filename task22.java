import java.util.TreeSet;

class TreeSetDemo {
    void display() {
        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(50);
        numbers.add(20);
        numbers.add(40);
        numbers.add(10);
        numbers.add(20);

        System.out.println("Numbers: " + numbers);

        System.out.println("First Number: " + numbers.first());
        System.out.println("Last Number: " + numbers.last());

        numbers.remove(40);

        System.out.println("After Removing: " + numbers);
    }
}

public class task22{
    public static void main(String[] args) {
        TreeSetDemo obj = new TreeSetDemo();
        obj.display();
    }
}