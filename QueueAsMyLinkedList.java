public class QueueAsMyLinkedList {

    private MyLinkedList list = new MyLinkedList();

    public void enqueue(Object e) {
        list.append(e);
    }

    public Object dequeue() {
        return list.removeFirst();
    }

    public String toString() {
        return list.toString();
    }

}
