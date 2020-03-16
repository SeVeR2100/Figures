package Stack;

public interface Stack <T>  {
    void push(T item);  // add element on top
    T pop();            // take and delete element from top
    int lenght();

    boolean isEmpty();

}
