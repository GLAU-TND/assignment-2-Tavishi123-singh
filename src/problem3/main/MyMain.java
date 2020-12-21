/*
 *  Created by IntelliJ IDEA.
 *  User: Tavishi123-singh
 */
package problem3.main;
// executable class
// use problem5.student.Student class to create object of student

import problem3.myqueue.MyPriorityQueue;
import problem5.student.Student;

public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue queue = new MyPriorityQueue();
        queue.enqueue(new Student(7,"Tavishi"));queue.display();
        //System.out.println(queue.getSize());
        //System.out.println(queue.peek().getStudent() + " element at front");
        queue.enqueue(new Student(2,"Tina"));queue.display();
        queue.enqueue(new Student(3,"Tavi"));queue.display();
        queue.enqueue(new Student(5,"Sonal"));queue.display();
        queue.enqueue(new Student(1,"Shruti"));queue.display();
        queue.enqueue(new Student(6,"Sam"));queue.display();
        System.out.println(queue.poll().getStudent() + " polled");queue.display();
        //System.out.println(queue.rear().getStudent() + " is rear");
        System.out.println(queue.poll().getStudent() + " polled");queue.display();
        //System.out.println(queue.rear().getStudent() + " is rear");
        System.out.println(queue.poll().getStudent() + " polled");queue.display();
        //System.out.println(queue.rear().getStudent() + " is rear");
        System.out.println(queue.poll().getStudent() + " polled");queue.display();
        //System.out.println(queue.rear().getStudent() + " is rear");
        System.out.println("The Size Queue is = " + queue.getSize());

    }
}