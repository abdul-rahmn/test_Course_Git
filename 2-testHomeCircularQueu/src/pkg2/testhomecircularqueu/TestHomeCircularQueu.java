package pkg2.testhomecircularqueu;
import java.util.Arrays;
public class TestHomeCircularQueu {
    public static void main(String[] args) {
        SimpleQueue sq=new SimpleQueue(5);
        sq.enQueue(1);
        sq.enQueue(2);
        sq.enQueue(3);
        sq.enQueue(4);
        sq.enQueue(5);
        sq.deQueue();
        sq.deQueue();
        sq.deQueue();
        sq.deQueue();
        sq.enQueue(22);
        sq.deQueue();


        sq.printQueue();
    }    
}
interface Queue{
    void enQueue(int item);
    int deQueue();
    boolean isFull();
    boolean isEmpty();
    void printQueue();
}
class SimpleQueue implements Queue{
    int [] sQueue;
    int front=0;
    int rear=0;
    int count=0;
    public SimpleQueue(int size){
        sQueue=new int[size];
    }
    
    
    @Override
    public void enQueue(int item) {            
            sQueue[front]=item;
            front=(front+1)%sQueue.length;
            count++;
        }        

    @Override
    public int deQueue() {
        int t=0;                   
            t=sQueue[rear];
            sQueue[rear]=0;
            rear=(rear+1)%sQueue.length;
            count--;
        return t;
    }

    
    
    /*@Override
    public void enQueue(int item) {
        if (front==sQueue.length) {
            front=0;
        }
            sQueue[front]=item;
            front++;
            count++;
            
    }*/

    /*@Override
    public int deQueue() {
        int t=0;
        if (rear==sQueue.length) {
            rear=0;
            System.out.println("is Empty");
            //return 0;
        }          
            t=sQueue[rear];
            sQueue[rear]=0;
            rear++;
            count--;
        return t;
    }
    */
    @Override
    public boolean isFull() {
        return sQueue.length==count;
    }

    @Override
    public boolean isEmpty() {
        return count==0;
    }

    @Override
    public void printQueue() {
        String strQueue=Arrays.toString(sQueue);
        System.out.println(strQueue);
    }
    
}
