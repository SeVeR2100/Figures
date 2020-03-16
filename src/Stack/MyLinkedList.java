package Stack;

public class MyLinkedList <T> {

    private static class Link<T> {
        private T item;
        private Link<T> next;

        public Link(T item) {
            this.item = item;
        }
    }

    private Link<T> first = null;

    public T getFirst() {
        return first.item;
    }

    public void addFirst(T item) {
        Link<T> newFirst = new Link<T>(item);
        newFirst.next = first;
        first = newFirst;
    }

    public T removeFirst() {
        Link<T> oldFirst = first;
        first = first.next;
        return oldFirst.item;
    }

    public boolean isEmpty() {
        return first == null;
    }


}
