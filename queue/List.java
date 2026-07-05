package queue;

public class List {

    private String name;
    private Object[] data;
    private int front;
    private int rear;

    public List(String name) {
        this.name = name;
        data = new Object[100];
        front = 0;
        rear = -1;
    }

    public void insertAtBack(Object obj) {
        data[++rear] = obj;
    }

    public Object removeFromFront() throws EmptyListException {
        if (front > rear)
            throw new EmptyListException(name);

        return data[front++];
    }

    public boolean isEmpty() {
        return front > rear;
    }

    public void print() {
        System.out.print(name + " : ");

        for (int i = front; i <= rear; i++) {
            System.out.print(data[i] + " ");
        }

        System.out.println();
    }
}
