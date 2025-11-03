package List.LinkedList;

import List.linkedList;
import List.node;


public class simpleList implements linkedList {
    private int size;
    public node head;



    public simpleList() {
        this.size = 0;
        this.head = null;
    }

    // Insert at the first position
    @Override
    public void insertFirst(Object object){
        node newNode = new node(object);
        if (head == null){
            head = newNode;
            return;
        } else{
            newNode.next = head;
            head = newNode;

        }
        size++;

    }



    // Insert at the last position
    @Override
    public void insertLast(Object object){
        node newNode = new node(object);
        node pointer = head;
        if (head == null && isEmpty()){
            head = newNode;
            return;
        }else {
            while (pointer.next != null){
                pointer = pointer.next;
            }
                pointer.next = newNode;
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
            return;
        }else if (position == 0){
            newNode.next = head;
            head = newNode;
            return;
        }

            for (int i = 1 ; i < position-1 && pointer.next != null ; i++ ) {
                pointer = pointer.next;
            }
            if(pointer.next != null) {
                newNode.next = pointer.next;
                pointer.next = newNode;
                return;
            }else {
                insertLast(object);
            }

        size++;
    }



    public boolean isEmpty(){
        if (size == 0){
            return true;
        }else{
            return false;
        }
    }


    public void printList(){
        node pointer = head;
        if (isEmpty() || head == null){
            System.out.println("Lista simple vacia");
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


    public int getSize() {
        return size;
    }
}
