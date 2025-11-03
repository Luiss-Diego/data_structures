package Queue.DoubleEndedQueue;


import Queue.queueNode;

import java.util.NoSuchElementException;

// Double ended queue
public class Deque<T> {
    queueNode<T> front;
    queueNode<T> rear;
    private int size;

    public Deque() {
        this.rear = null;
        this.size = 0;
        this.front = null;
    }


    public Boolean isEmpty(){
        return size == 0;
    }

    public void enqueueFirst(T object){
        queueNode<T> newNode = new queueNode<>(object);
        if (isEmpty()){
            front = newNode;
            rear = newNode;
        }else {
            front.previous = newNode;
            newNode.next = front;
            front = newNode;
        }
        size++;
    }


    public void enqueueLast(T object){
        queueNode<T> newNode = new queueNode<>(object);
        if (isEmpty() || rear == null){
            rear = newNode;
            front = newNode;
        }else {
            newNode.previous = rear;
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public T dequeueFirst(){
        if (isEmpty()){
            throw  new NoSuchElementException("Cola Vacia");
        }
        T returnFront = front.getValue();
        front = front.next;
        size--;

        if(size == 0){
            front = null;
            rear = null;
        }

        return returnFront;
    }


    public T dequeueLast(){
        if (isEmpty()){
            throw  new NoSuchElementException("Cola Vacia");
        }

        T returnRear = rear.getValue();
        rear = rear.previous;
        size--;

        if (size == 0){
            rear = null;
            front = null;
        }

        return  returnRear;
    }


    public T peekFront(){
        return front.getValue();
    }

    public T peekRear(){
        return rear.getValue();
    }


    public void printQueue(){
        if (isEmpty()){
            System.out.println("Cola vacia");
        }else {
            queueNode<T> pointer = front;
            while (pointer != null){
                System.out.print(pointer.getValue());
                pointer = pointer.next;
                if (pointer.next != null){
                    System.out.print(" --> ");
                }else {
                    System.out.println(" --> " + rear.getValue() );
                    break;
                }
            }
        }
    }

    public void printFromRear(){
        if (isEmpty()){
            System.out.println("Cola vacia");
        }else {
            queueNode<T> pointer = rear;
            while (pointer != null){
                System.out.print(pointer.getValue());
                pointer = pointer.previous;
                if (pointer.previous != null){
                    System.out.print(" --> ");
                }else {
                    System.out.print(" --> " + front.getValue());
                    break;
                }
            }
        }





    }




}
