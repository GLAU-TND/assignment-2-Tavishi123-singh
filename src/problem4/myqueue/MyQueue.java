  
/*
 *  Created by IntelliJ IDEA.
 *  User: Tavishi123-singh
 */
package problem4.myqueue;
// to create queue to store pre - order successor
import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;
import problem4.node.Node;

public class MyQueue {
    // a field to refer rear end of queue
    private Node rear;
    // a field to refer front end of queue
    private Node front;
    private int size;// total no. of elements in the queue

    // constructor
    public MyQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    public void storePreOrderSuccessor(MyBinarySearchTree tree){
        TreeNode root=tree.getRoot();
        storePreOrderSuccesssorRec(root);
    }

    // A recursive function to do preorder traversal of BST
    void storePreOrderSuccesssorRec(TreeNode root) {
        if (root != null) {
            enqueue(root.getData());
            storePreOrderSuccesssorRec(root.getLeft());
            storePreOrderSuccesssorRec(root.getRight());
        }
    }


    // a method to check whether queue is empty
    public boolean isEmpty() {
        boolean response = false;
        if (size == 0) {
            response = true;
        }
        return response;
    }


    // a method to add a new element in queue
    public void enqueue(int element) {
        Node node = new Node(element);
        if (isEmpty()) {
            rear = node;
            front = node;
            size++;
        } else {
            rear.setNext(node);
            rear = node;
            size++;
        }
    }

    public Node dequeue(){
        Node res = null;
        if(!isEmpty()) {
            if(front.getNext()!=null) {
                res = front;
                front = front.getNext();
                res.setNext(null);
                size--;
            }
            else {
                res=front;
                front=null;
                rear=null;
                size--;
            }
        }
        else {
            System.out.println("Queue UnderFlow");
        }
        return res;

    }

    // a method to get front element without removing it
    public Node peek() {
        Node response = null;
        if (!isEmpty()) {
            response = new Node(front.getData());
        }
        return response;
    }


    public void display(){
        System.out.print("Displaying Queue: ");
        Node temp=front;
        while(temp!=null){
            System.out.print(temp.getData());
            if(temp.getNext()!=null){
                System.out.print("<---");
            }
            temp=temp.getNext();
        }
        System.out.println();
    }

    // a method to get size of queue
    public int getSize() {
        return size;
    }

    public Node rear(){
        return rear;
    }
}