package pointer;

public class greet {
    public static void main(String[] args) {
        StringBuilder x = new StringBuilder("Halo");
        StringBuilder y = x; 
        y.append(" Dunia");
        System.out.println(x);
    }
}