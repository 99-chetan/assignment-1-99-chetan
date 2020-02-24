public class mList {
    private Node head;
    public mList(){
        head=null;
    }
    public Node getHead(){
        return head;
    }
    public void insert(Person p){
        Node node=new Node(p);
        if(head==null){
            head=node;
        }
        else {
            Node temp=head;
            while(temp.getNext()!=null){
                temp=temp.getNext();
            }
            temp.setNext(node);
        }
    }
    public void printList(){
        System.out.println("---Here are all your contacts---");
        System.out.println("-------- * -------- * -------- * --------");
        Node temp=head;
        if(head!=null) {
            while (temp != null) {
                Person e = temp.getData();
}
