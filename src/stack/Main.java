package stack;

public class Main {
    public static void main(String[] args){
        stack st = new stack(5);
        try {
            st.Push("sdgfsd");
            st.Push(1);
            st.Push(145);
            Boolean flag = true;
            st.Push(flag);
            st.Push('j');
            st.print();
            System.out.println(st.Peek());
            while(!st.IsEmpty()){
                System.out.println(st.Pop());
            }
            st.Pop();
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
