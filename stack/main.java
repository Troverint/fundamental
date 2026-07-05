package stack;

public class main {
    public static void main(String[] args) throws EmptyListException {
        StackInheritance stack = new StackInheritance();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Pop: " + stack.pop()); // 30
        System.out.println("Pop: " + stack.pop()); // 20
        System.out.println("Pop: " + stack.pop()); // 10
    }
}