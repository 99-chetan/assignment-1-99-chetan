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
}
