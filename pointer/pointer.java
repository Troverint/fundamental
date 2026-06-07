package pointer;

public class pointer {
    public static void main(String[] args) {
        String[] arr = new String[3];
        arr[0] = "Alpha"; 
        arr[1] = "Beta";
        arr[2] = arr[0]; 
        System.out.println(arr[2]); 
    }
}