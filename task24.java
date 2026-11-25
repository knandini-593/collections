import java.util.LinkedHashSet;

class LinkedHashSetDemo {
    void display() {
        LinkedHashSet<String> cities = new LinkedHashSet<>();

        cities.add("Chennai");
        cities.add("Hyderabad");
        cities.add("Bangalore");
        cities.add("Chennai");

        System.out.println("Cities: " + cities);

        cities.remove("Bangalore");

        System.out.println("After Removing: " + cities);
        System.out.println("Contains Hyderabad: " + cities.contains("Hyderabad"));
    }
}

public class task24 {
    public static void main(String[] args) {
        LinkedHashSetDemo obj = new LinkedHashSetDemo();
        obj.display();
    }
}