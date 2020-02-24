public class Node {
    private Person data;
    private Node next;
    public Node(Person data){
        this.data=data;
        next=null;
    }
    public Person getData() {
        return data;
    }
    public void setData(Person data) {
        this.data = data;
    }
}
