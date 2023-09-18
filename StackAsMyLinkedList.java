public class StackAsMyLinkedList {

    private MyLinkedList list = new MyLinkedList();

    public void push(Object e) {
        list.prepend(e);
    }

    public Object pop() {
        return list.removeFirst();
    }

    public boolean isEmpty() {
        return list.getFirst() == null;
    }

    public String toString() {
        return list.toString();
    }

}

