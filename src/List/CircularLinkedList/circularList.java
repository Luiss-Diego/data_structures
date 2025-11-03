package List.CircularLinkedList;

import List.linkedList;
import List.node;


public class circularList implements linkedList {
    public node head;
    public node tail;
    private int size;

    public circularList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public void insertFirst(Object object) {
        node newNode = new node(object);

        if (head == null || isEmpty()){
            head = newNode;
            tail = newNode;
        }else {
            newNode.next = head;
            head = newNode;
            tail.next = head;

        }
        size++;
    }

    @Override
    public void insertLast(Object object) {
        node newNode = new node(object);
        if (isEmpty() || head == null){
            head = newNode;
        }else {
            tail.next = newNode;
            newNode.next = head;
            tail = newNode;
        }
        size++;
    }

    @Override
    public void insertAt(Object object, int position) {
        node newNode = new node(object);
        if (isEmpty() || head == null){
            head = newNode;
            size++;
            return;
        }else if (size == 0){
            insertFirst(object);
            return;
        }
        node pointer = head;
        for (int i = 1; i < position-1 && pointer.next != tail; i++ ){
            pointer = pointer.next;
        }
        if (pointer != tail){
            newNode.next = pointer.next;
            pointer.next = newNode;
            size++;
        }else {
            insertLast(object);
        }

    }

    @Override
    public boolean isEmpty() {
        if (size == 0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public void printList() {
        if (isEmpty() || head == null){
            System.out.println("Lista enlazada circular vacia");
        }else {
            node pointer = head;
            while ( pointer != tail){
                System.out.print(pointer.getObject());
                if (pointer.next != tail){
                    System.out.print(" --> ");
                }else {
                    System.out.print(" --> " + tail.getObject());
                }
                pointer = pointer.next;
            }
            System.out.println();
        }
    }
}
