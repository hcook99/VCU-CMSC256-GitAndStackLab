import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayBasedStack<T> implements StackInterface<T>{
    private T[] data;
    private int topOfStack;
    private final int INITIAL_CAPACITY = 5;
    private boolean initialized;

    public ArrayBasedStack(int initialCapacity){
        if(initialCapacity<0){
            throw new IllegalArgumentException("Invalid Size");
        }
        else{
            data = (T[]) new Object[initialCapacity];
            topOfStack = -1;
            initialized = true;
        }
    }
    public ArrayBasedStack(){
        data = (T[]) new Object[INITIAL_CAPACITY];
        topOfStack = -1;
        initialized = true;
    }
    public void push(T newEntry){
        if(initialized) {
            topOfStack++;
            if (topOfStack == data.length - 1) {
                expandArray();
            }

            data[topOfStack] = newEntry;
        }
        else{
            throw new SecurityException("Array Stack has not been created.");
        }
    }
    public boolean isEmpty(){
        return topOfStack<0;
    }
    public T pop(){
        if(initialized){
            if(isEmpty()){
                throw new EmptyStackException();
            }
            else{
                T variableAtTop = data[topOfStack];
                data[topOfStack] = null;
                topOfStack--;
                return variableAtTop;
            }
        }
        else{
            throw new SecurityException("Array Stack has not been created.");
        }
    }
    public T peek(){
        if(initialized) {
            if (!isEmpty())
                return data[topOfStack];
            else {
                throw new EmptyStackException();
            }
        }
        else{
            throw new SecurityException("Array Stack has not been created.");
        }
    }
    public void clear(){
        if(initialized){
            if(!isEmpty()){
                for(T entry: data){
                    entry=null;
                }
            }
            topOfStack = -1;
        }
    }
    private void expandArray(){
        data = Arrays.copyOf(data, data.length*2);
    }
}