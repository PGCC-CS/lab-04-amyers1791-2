public interface QueueInterface {
    void enqueue(int pid);
    PCB dequeue();
    boolean isEmpty();
    void display();
}
