/*
 *  Created by IntelliJ IDEA.
 *  User: Tavishi123-singh
 */
package problem5.main;
//executable class
import problem5.circularqueue.MyCircularQueue;
import problem5.student.Student;
import java.util.Random;
public class MyMain {
    public static void main(String[] args) {
        Random rand=new Random();
        MyCircularQueue queue = new MyCircularQueue();
        System.out.println("Adding no. of Students :\n---------------------------");
        queue.enqueue(new Student(1,"Tavishi",2,rand.nextInt(2)+1));queue.display();
        queue.enqueue(new Student(2,"Tavi",4,rand.nextInt(2)+1));queue.display();
        queue.enqueue(new Student(4,"Elsa",5,rand.nextInt(2)+1));queue.display();
        queue.enqueue(new Student(5,"Tina",0,rand.nextInt(2)+1));queue.display();
        System.out.println("Processing the Elements :\n---------------------------");
        while (queue.processStudents()!=false){
            //Processing Students Until Queue is empty
            //EveryProcess the student clears 1-2 backlogs
        }
        queue.display();
    }
}