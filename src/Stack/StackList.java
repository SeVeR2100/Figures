package Stack;
import java.util.Iterator;
import java.util.LinkedList;
import java.lang.Iterable;
import java.util.Objects;
import java.util.function.Consumer;

public class StackList<T> implements Stack <T>, Iterable<T>{

    public LinkedList <T> stack = new LinkedList<T>();

    @Override
    public int lenght(){
        return stack.size();
    }

    @Override
    public void push(T item) {
        stack.add(0, item);

    }

    @Override
    public T pop() {
        return stack.remove(0);
    }


    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    
    @Override
    public Iterator <T> iterator() {
        return stack.iterator();
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        Objects.requireNonNull(action);
        for (T t : this) {
            action.accept(t);
        }
    }

}
