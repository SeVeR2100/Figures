package Stack;

public class MyStack<T> {

    private MyLinkedList<T> myStack = new MyLinkedList<T>();

    private int size = 0;

    public void push(T item) {
        size++;
        myStack.addFirst(item);
    }

    public T pop() {
        size--;
        return myStack.removeFirst();
    }

    public boolean isEmpty() {
        return myStack.isEmpty();
    }

    public T peek(){
        return  myStack.getFirst();
    }

    public int lenght (){
        return size;
    }

}