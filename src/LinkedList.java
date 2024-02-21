public class LinkedList {
    Node head;
    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.insert(5);
        ll.insert(7);
        ll.insert(8);
        ll.insert(12);
        ll.show();
        System.out.println(" The reversed List ");
        ll.reverse();
        ll.show();
    }

    public void show() {
        Node node = head;
        while (node.next!= null)
        {
            System.out.println(node.data);
            node = node.next;

        }
        System.out.println(node.data);
    }

    public class Node{
        Node next;
        int data;
    }
    public void insert(int value){
        Node node = new Node();
        node.data = value;
        node.next = null;

        if(head == null){
            head = node;
        }
        else
        {
            Node temp = head;
            while(temp.next!= null){
                temp = temp.next;
            }
            temp.next = node;
        }
    }
    public void reverse(){
        Node prev = head;
        Node cur = head.next;

        while(cur.next!=null){
            Node temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;

        }
        head.next = null;
        head = prev;
    }
}

