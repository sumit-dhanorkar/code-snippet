package linkedList;

public class Test {
    Node head=null;
    Node tail=null;
    class Node{
        int  val;
        Node next;

        public Node(int val){
            this.val=val;
        }

        public Node(int val,Node next){
            this.val=val;
            this.next=next;
        }
    }

    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;


        if(tail==null){
            tail=head;
        }
    }



    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            return temp;
        }

        node.next = insertRec(val, index-1, node.next);
        return node;
    }

    public void insert(int val, int index) {
        head=insertRec(val,index, head);
    }


    public void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val +"->");
            temp=temp.next;
        }

        System.out.print("END");
        System.out.println();

    }

    public static void main(String[] args) {
        Test test=new Test();
        test.insertFirst(6);
        test.insertFirst(5);
        test.insertFirst(3);
        test.insertFirst(2);
        test.insertFirst(1);
        test.printList();

            test.insert(4,3);
        test.printList();

    }


}
