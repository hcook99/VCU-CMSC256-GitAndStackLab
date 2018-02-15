public class ArrayBasedStack<T> implements StackInterface<T>{
   T[] data;
   
   @SuppressWarnings("unchecked")
   public ArrayBasedStack(){
      data = (T[])new Object[1];
   }

   /** Adds a new entry to the top of this stack.
       @param newEntry  An object to be added to the stack. */
   public void push(T newEntry){
      data[0] = newEntry;
   }
  
   /** Removes and returns this stack's top entry.
       @return  The object at the top of the stack. 
       @throws  EmptyStackException if the stack is empty before the operation. */
   public T pop(){
      return data[0];
   }
  
   /** Retrieves this stack's top entry.
       @return  The object at the top of the stack.
       @throws  EmptyStackException if the stack is empty. */
   public T peek(){
      return data[0];
   }
  
   /** Detects whether this stack is empty.
       @return  True if the stack is empty. */
   public boolean isEmpty(){
      return true;
   }
  
   /** Removes all entries from this stack. */
   public void clear(){
   
   }

}