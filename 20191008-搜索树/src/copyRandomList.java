import java.util.Map;
import java.util.TreeMap;

public class copyRandomList {
    public class Node {
        int val;
        Node next;
        Node random;

       public Node(int val){
           this.val = val;
       }

       public Node(Node next,Node random){
           this.next = next;
           this.random = random;
       }
    }
    public Node copy(Node head){
        if(head == null) {
            return null;
        }
        Node p1 = head;
        while(p1 != null){
            Node p2 = new Node(p1.val);
            p2.next = p1.next;
            p1.next = p2;
            p1 = p2.next;
        }

        p1 = head;
        while(p1 != null){
            Node p2 = p1.next;
            if(p1.random != null){
                p2.random = p1.random.next;
            }
            p1 = p2.next;
        }

        p1 = head;
        Node newHead = head.next;
        while(p1 != null){
            Node p2 = p1.next;
            p1.next = p2.next;
            if(p2.next != null){
                p2.next = p2.next.next;
            }
            p1 = p1.next;
        }
        return newHead;
    }

    public Node copy2(Node head){
        Map<Node,Node> map = new TreeMap<>();
        Node newHead = null;
        Node newLast = null;
        Node p1 = null;
        while(p1 != null){
            Node p2 = new Node(p1.val);
            if(newHead == null){
                newHead = p2;
            }else{
                newLast.next = p2;
            }
            newLast = p2;
            map.put(p1,p2);
            p1 = p1.next;
        }

        p1 = head;
        Node p2 = newHead;
        while(p2 != null){
            if(p1.random != null){
                p2.random = map.get(p1.random);
            } else{
                p2.random = null;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return newHead;
    }

    public static void main(String[] args) {

    }
}
