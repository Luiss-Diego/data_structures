package List;

public class node {

    public Object object;
    public node next;
    public node previous;

    public node(Object object) {
        this.object = object;
        this.next = null;
        this.previous = null;
    }


    public Object getObject() {
        return object;
    }
}
