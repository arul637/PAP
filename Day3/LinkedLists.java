package Day3;

import java.util.LinkedList;

public class LinkedLists {

    public static void display(LinkedList<String> ll) {
        int size = ll.size();
        for (String s : ll) {
            System.out.print(s + " -> ");
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        // 1. creating the linkedlist object
        LinkedList<String> ll = new LinkedList<>();

        // 2. adding names
        ll.add("Death Note");
        ll.add("Monster");
        ll.add("Kengen Ashura");

        // 3. display items
        display(ll);

        // 4. insert at position
        ll.add(1, "Classroom of Elite");
        ll.add(2, "Ragna Crimson");
        ll.add(3, "Jujutsu Kaisen");

        display(ll);

        // 5. insert at first
        ll.addFirst("Moriarty the Patriot");
        ll.addLast("Records of Ragnarok");

        display(ll);

        // 6. removing elements
        ll.remove(3); // removing based on index
        display(ll);

        ll.remove("Jujutsu Kaisen"); // removing based on value
        display(ll);

        ll.remove(); // removing the 1st element
        display(ll);

        ll.remove(); // removing the 1st element
        display(ll);

        // 7. checking the element
        System.out.println(ll.contains("Monster"));

        display(ll);
        System.out.println(ll.pop()); // removing the 1st element
        display(ll);

        ll.push("Classroom of Elite");
        display(ll);
    }
}
