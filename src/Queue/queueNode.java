package Queue;

public class queueNode<E> {
    public  queueNode <E> previous;
    public queueNode<E> next;
    private E value;

    public queueNode(E object) {
        this.value = object;
        this.next = null;
        this.previous = null;
    }

    public E getValue() {
        return value;
    }
}
