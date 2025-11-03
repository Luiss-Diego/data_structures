package Queue.simpleQueue;

import Queue.queue;
import Queue.queueNode;
import java.util.NoSuchElementException;

public class simpleLinkedQueue<T> implements queue<T> {
    private queueNode<T> front;
    private queueNode<T> rear;
    private int size;

    public simpleLinkedQueue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }


    @Override
    public void enqueue(T object) {
        queueNode<T> newNode = new queueNode<>(object);
        if (isEmpty() || front == null){
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    @Override
    public T dequeue() {
        if (isEmpty()){
            throw new NoSuchElementException("Cola vacia");
        }
        T returnValue = front.getValue();
        front = front.next;
        size--;
        if (isEmpty()){
            rear = null;
            front = null;
        }

        return returnValue;
    }

    @Override
    public T peek() {
        return front.getValue();
    }

    @Override
    public Boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void printQueue() {
        if (isEmpty()){
            System.out.println("Lista Vacia");
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


    public T peekRear(){
        return rear.getValue();
    }


}
