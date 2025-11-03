import List.CircularLinkedList.circularList;
import List.DoubleLinkedList.doubleLinkedList;
import List.LinkedList.simpleList;
import List.linkedList;
import List.student;
import Queue.DoubleEndedQueue.Deque;
import Queue.queue;
import Queue.simpleQueue.simpleLinkedQueue;
import Queue.user;
import static Arr.searchAlgorithms.linearSearchAlgorithm.linearSearch;
import static Arr.sortingAlgorithms.bubbleSort.bubbleSorting;
import static Arr.sortingAlgorithms.bubbleSort.bubbleSortingV2;
import static Arr.sortingAlgorithms.insertionSort.insertionSortMethod;
import static Arr.sortingAlgorithms.selectionSort.selectionSortMethod;


public class Main {
    public static void main(String[] args) {
    /**
        linkedList alphabetList = new simpleList();

        alphabetList.insertFirst(1);
        alphabetList.insertLast(2);
        alphabetList.insertFirst(3);
        alphabetList.insertAt(6,2);
        alphabetList.insertLast(8);

        alphabetList.printList();


        linkedList list = new doubleLinkedList();

        list.insertFirst("Manuel");
        list.insertLast("Lucas");
        list.insertFirst("Nicol");
        list.insertAt("Laura",2);

        list.printList();


        student student_one = new student("Lucas",1223,"434343");
        student student_two = new student("Manuela",4344,"54542");
        student student_three = new student("Rodrigo",3232,"65656");



        linkedList studentList = new simpleList();
        studentList.insertFirst(student_three);
        studentList.insertAt(student_one,3);
        studentList.insertLast(student_two);

        studentList.printList();


        linkedList circularList = new circularList();


        circularList.insertFirst(15);
        circularList.insertFirst(323);
        circularList.insertFirst(16);
        circularList.insertLast(33);
        circularList.insertAt(44,3);




        circularList.printList();

    **/


    /**
        simpleLinkedQueue<String> simpleQueue = new simpleLinkedQueue<>();

        simpleQueue.enqueue("A");
        simpleQueue.enqueue("B");
        simpleQueue.enqueue("C");
        simpleQueue.enqueue("D");

        simpleQueue.printQueue();
        System.out.println("Elemento eliminado de la cola: " + simpleQueue.dequeue());
        simpleQueue.printQueue();
        System.out.println("Elemento eliminado de la cola: " + simpleQueue.dequeue());
        simpleQueue.printQueue();

        user user1 = new user(89,"Rodrigo","Mora","321 080432");
        user user2 = new user(123,"Maria Paz","Gaitan","312 332322");
        user user3 = new user(544,"Lucas","Sarmiento","302 3262123");
        user user4 = new user(233,"Nicol","Rojas","323 0892230");



        simpleLinkedQueue<user> userList = new simpleLinkedQueue<>();

        userList.enqueue(user1);
        userList.enqueue(user3);
        userList.enqueue(user2);
        userList.enqueue(user4);

        userList.printQueue();
    **/

    /**
        Deque<String> deque =  new Deque<>();

        deque.enqueueFirst("A");
        deque.enqueueLast("B");
        deque.enqueueFirst("C");
        deque.enqueueLast("D");
        deque.enqueueFirst("E");
        deque.enqueueLast("F");


        deque.printQueue();
        deque.printFromRear();

     **/
        int va = Math.round(5/2);
        System.out.println(va);





    }
}