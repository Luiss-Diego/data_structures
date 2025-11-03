package List.DoubleLinkedList;

import List.linkedList;
import List.node;

public class doubleLinkedList implements linkedList {
    private node head;
    private int size;

    public doubleLinkedList() {
        this.head = null;
        this.size = 0;
    }


    // check if the list is empty

    @Override
    public boolean isEmpty(){
        if (size == 0){
            return true;
        }else {
            return false;
        }
    }


    // Insert at beginning
    @Override
    public void insertFirst(Object object){
        node newNode = new node(object);
        if (head == null || isEmpty()){
            head = newNode;
        }else {
            newNode.next =  head;
            head.previous = newNode;
            head = newNode;
        }
        size++;
    }

    // Insert At the last position

    @Override
    public void insertLast(Object object){
        node newNode = new node(object);
        node pointer = head;

        if (head == null){
            head = newNode;
        }else {
            while (pointer.next != null){
                pointer = pointer.next;
            }
            pointer.next = newNode;
            newNode.previous = pointer;
        }
        size++;
    }


    // Insert at n position

    @Override
    public void insertAt(Object object , int position){
        node newNode = new node(object);
        node pointer = head;

        if (head == null){
            head = newNode;
        } else if (position == 0) {
            insertFirst(object);
        }else {
            for (int i = 1; i < position - 1 && pointer.next != null; i++ ){
                pointer = pointer.next;
            }
            if (pointer.next == null){
                insertLast(object);
            }else {
                newNode.previous = pointer;
                newNode.next = pointer.next;
                pointer.next.previous = newNode;
                pointer.next = newNode;
            }

        }
        size++;
    }

    @Override
    public void printList(){
        node pointer = head;
        if (head == null){
            System.out.println("Lista doblemente enlazada vacia");
        }else {
            while (pointer != null){
                System.out.print(pointer.getObject());
                if (pointer.next != null){
                    System.out.print(" --> ");
                }
                pointer = pointer.next;
            }
            System.out.println();
        }
    }


}
