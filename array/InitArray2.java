
public class InitArray2 {
    public static void main(String args[]) {





        int nomor[] = { 32, 27, 64, 18, 95, 14, 90, 70, 60, 37 };
        System.out.printf("%s%8s\n", "Index", "Value");
        
        for (int counter = 0; counter < nomor.length; counter++)
            System.out.printf("%5d%8d\n", counter, nomor[counter]);
        
        
        
        
        // System.out.println(nomor[2]); //

    }
}
