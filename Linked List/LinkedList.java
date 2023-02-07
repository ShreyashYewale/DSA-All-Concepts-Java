
public class LinkedList {
    private static Node head;

    class Node {
        public int value;
        public Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public void insertFirst(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void insertLast(int val) {
        Node newNode = new Node(val);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void insertAtPosition(int pos, int val) {
        Node newNode = new Node(val);
        int count = 1;
        Node temp = head;
        while (temp != null) {
            if (count == pos - 1) {
                newNode.next = temp.next;
                temp.next = newNode;
                return;
            }
            temp = temp.next;
            count += 1;
        }

    }

    public void deleteFirst() {
        if (head == null)
            return;

        Node temp = head;
        head = head.next;
        temp.next = null;
        System.out.println("Deleted first Node");
    }

    public void deleteLast() {
        if (head == null) {
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        System.out.println("Deleted last Node");
    }

    public Node reverse() {
        Node curr = head;
        Node prev = null;
        while (curr != null) {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }

    }

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.insertFirst(1);
        l1.insertFirst(2);
        l1.insertFirst(3);
        l1.insertFirst(4);
        l1.insertLast(5);
        l1.insertAtPosition(2, 6);
        l1.insertAtPosition(4, 10);
        l1.deleteFirst();
        l1.deleteLast();
        l1.display(head);
        Node head = l1.reverse();
        System.out.println();
        l1.display(head);
    }
}
