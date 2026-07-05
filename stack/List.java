package stack;

public class List {
    private String name;
    private Object[] data;
    private int top;

    public List(String name) {
        this.name = name;
        this.data = new Object[100];
        this.top = -1;
    }

    public void insertAtFront(Object obj) {
        data[++top] = obj;
    }

    public Object removeFromFront() throws EmptyListException {
        if (top == -1) throw new EmptyListException(name);
        return data[top--];
    }
}