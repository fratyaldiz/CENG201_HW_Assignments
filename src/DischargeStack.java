public class DischargeStack {
    private class Node{
        Node next;
        DischargeRecord record;

        Node(DischargeRecord record){
            this.record = record;
            this.next = null;
        }
    }
    private Node top;   // top of stack
    private int count;  // number of elements

    public DischargeStack(){
        top = null;
        count = 0;
    }
    //add of top
    public void push(DischargeRecord record){
        Node newNode = new Node(record);
        newNode.next = top;
        top = newNode;
        count++;
        System.out.println("Pushed");
    }

    //delete of top
    public DischargeRecord pop(){
        if(top == null){
            System.out.println("Empty Stack");
            return null;
        }
        DischargeRecord removed = top.record;
        top = top.next;
        count--;
        System.out.println("Popped");
        return removed;     //return top record
    }

    //View the most recent discharge without removing it.
    public DischargeRecord peek(){
        if(top == null){
            System.out.println("Empty Stack");
            return null;
        }
        return top.record;
    }

    //Print all discharge records.
    public void printStack(){
        if(top == null){
            System.out.println("Empty Stack");
        }
        Node current = top;
        while(current != null){
            System.out.println(current.record);
            current = current.next;
        }
    }
}
