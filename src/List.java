public class List {
    private ForwardList head;
    public List(){
        head = null;
    }
    private boolean isEmpty(){
        return head == null;
    }

    public void addToHead(int data){
        ForwardList temp = new ForwardList(data);
        temp.next = head;
        head = temp;
    }

    public void removeAt(int key){
        ForwardList cur = head;
        ForwardList prev = head;

        while (cur.data != key){
            if (isEmpty()){
                System.out.println("List is empty");
                return;
            }else{
                prev = cur;
                cur = cur.next;
            }

            if (cur == head){
                head = head.next;
            }else{
                prev.next = cur.next;
            }
        }
    }

    public void getHead(){
        ForwardList temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
