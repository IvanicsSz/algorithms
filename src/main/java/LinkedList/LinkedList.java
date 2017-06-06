package LinkedList;

public class LinkedList {

    Node head;

    static class Node{
        int data;
        Node next;
        Node(int d){
            this.data = d;
            this.next = null;
        }
    }

    //count the linked list size
    public int getCount(){
        Node node = head;
        int counter = 0;


        while (node != null){
            counter++;
            node = node.next;
        }
            return counter;

    }

    //delete position
    public void deleteIndex(int index){
        if (head == null)
            System.out.println("Empty linked list");

        Node node = head;
        int counter = 0;

        if (index == 0){
            head = node.next;
        }

        while (node != null){
            if (counter + 1 == index){
                node.next = node.next.next;
                return;
            }
            counter++;
            node = node.next;
        }
    }
    //delete Node
    public void delete(int nodeValue){
        if (head == null)
            System.out.println("Empty linked list");

        Node node = head;

        while(node.next.data != nodeValue){
            node = node.next;
        }
        node.next = node.next.next;
//        node.next.next = null;
    }

    //add to the first place
    public void push(int nodeValue){
        Node node = new Node(nodeValue);
        if (head == null){
            head = node;
        } else{
            node.next = head;
            head = node;
        }

    }
    //add after a given node
    public void insert(int nodeIndex, Node node){
        if (head == null){
            head = node;
            System.out.println("no such element so it has inserted to the head");
        }

        if (head.data == nodeIndex) {
            node.next = head;
            head = node;
        }

        Node n = head;

        while (n.data != nodeIndex){
            n = n.next;
        }

        node.next = n.next;
        n.next = node;
    }

    //add to the end
    public void append(int nodeValue){
        Node node = new Node(nodeValue);

        if (head == null){
            head = node;
            node.next = null;
            System.out.println("no such element so it has inserted to the head");
        }

        Node n = head;
        while (n.next != null){
            n = n.next;
        }
        n.next = node;

    }

    Node reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }


    public void printList(){
        Node n = head;
        while (n != null){
            System.out.println("n = " + n.data);
            n = n.next;
        }

    }

    public static void main(String[] args) {

        LinkedList link = new LinkedList();

        link.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node after = new Node(5);
        LinkedList.Node linkedNode = new LinkedList.Node(4);
        link.head.next = second;
        second.next = third;
        third.next = linkedNode;
        link.push(0);
        link.insert(3, after);
        link.append(6);
        link.delete(2);
        link.deleteIndex(2);
        System.out.println(link.getCount());
        link.reverse();
        link.printList();
    }
}
