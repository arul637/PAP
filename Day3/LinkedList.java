package Day3;

class Node {
    String data;
    Node next;
    Node(String value) {
        this.data = value;
        this.next = null;
    }
}

public class LinkedList {
    Node head;

    public void insertAtBeginning(String data) {
        Node newNode = new Node(data);
        if(head != null) {
            newNode.next = head;
        }
        head = newNode;
    }

    public void insertAtEnd(String data) {
        if (head == null) {
            insertAtBeginning(data);
            return;
        }
        Node newNode = new Node(data);
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    public void insertAtPosition(String data, int position) {
        if (position == 0) {
            insertAtBeginning(data);
        } else if (position == size()) {
            insertAtEnd(data);
        } else {
            Node newNode = new Node(data);
            Node currentNode = head;
            for (int i=0; i<position-1; i++) {
                currentNode = currentNode.next;
            }
            newNode.next = currentNode.next;
            currentNode.next = newNode;
        }
    }

    public int size() {
        Node currentNode = head;
        int count = 0;
        while (currentNode != null) {
            count++;
            currentNode = currentNode.next;
        }
        return count;
    }

    public void remove(int index) {
        Node currentNode = head;
        if (index == 0) {
            head = currentNode.next;
            return;
        }
        for (int i=0; i<index-1; i++) {
            currentNode = currentNode.next;
        }
        currentNode.next = currentNode.next.next;
    }

    public void remove(String data) {
        Node currentNode = head;
        Node prevNode = null;
        while (!currentNode.data.equals(data)) {
            prevNode = currentNode;
            currentNode = currentNode.next;
        }
        prevNode.next = currentNode.next;
    }

    public void display() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd("40");
        ll.insertAtBeginning("30");
        ll.insertAtBeginning("20");
        ll.insertAtBeginning("10");
        ll.insertAtEnd("50");
        ll.insertAtPosition("70", 5);
        ll.insertAtPosition("80", 6);
        ll.insertAtPosition("60", 5);
        ll.insertAtPosition("25", 2);
        ll.display();
        ll.remove(2);
        ll.display();
        ll.insertAtPosition("25", 2);
        ll.display();
        ll.remove("25");
        ll.display();
        ll.remove(0);
        ll.display();
        ll.remove(6);
        ll.display();
    }
}
