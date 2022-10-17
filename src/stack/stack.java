package stack;

public class stack {
    private int size;
    private Object[] items;
    private int head;



    stack(int n){
        size = n;
        items = new Object[size];
        head = -1;
    }
    Boolean IsEmpty(){
        return head == -1;
    }
    void Push(Object t) throws Exception{
        if(head == size-1){
            throw new Exception("Full stack!");
        }
        items[++head] = t;
    }
    Object Pop() throws Exception{
        if(this.IsEmpty()){
            throw new Exception("Stack is empty!");
        }
        Object item = items[head];
        items[head--] = null;
        return item;
    }
    Object Peek() throws Exception{
        if(this.IsEmpty())
            throw new Exception("Stack is empty!");
        return items[head];
    }
    void print(){
        for(int i = 0;i<items.length;i++)
            System.out.print(items[i] + " ");
        System.out.println();
    }
}
