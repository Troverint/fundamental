// package array;

// import java.util.Scanner;

// public class ja {

//     public static void main(String[] args) {

//         /*
//          * int[][] data = {{6,3,4}, {1,7,8}};
//          * for (int b=0; b<3; b++){
//          * for (int k=0;k<3;k++){
//          * System.out.print(data[b][k]+" ");
//          * }
//          * System.out.println();
//          * }
//          * 
//          * 
//          * int[][] matrik = new int[3][3];
//          * int i,j;
//          * Scanner input = new Scanner (System.in);
//          * 
//          * for (i=0;i<3;i++){
//          * for (j=0;j<3;j++){
//          * System.out.println( " Input Bilangan "+"["+i+"]"+"["+j+"] = ");
//          * matrik [i][j] = input.nextInt();
//          * }
//          * }
//          * for (i=0;i<3;i++){
//          * for (j=0;j<3;j++){
//          * System.out.print(matrik[i][j]+" ");
//          * }
//          * System.out.println();
//          * }
//          */

//         Scanner input = new Scanner(System.in);
//         System.out.print(" input ordo=> ");
//         int ordo = input.nextInt();
//         int[][] matrix = new int[ordo][ordo];
//         int[][] transpose = new int[ordo][ordo];

//         for (int i = 0; i < ordo; i++)
//             for (int j = 0; j < ordo; j++) {
//                 System.out.print("baris " + (i + 1) + " kolom " + (j + 1) + " => ");
//                 matrix[i][j] = input.nextInt();
//             }
//         System.out.println("Matrix nya dibawah ");
//         for (int i = 0; i < ordo; i++) {
//             for (int j = 0; j < ordo; j++)
//                 System.out.print(matrix[i][j] + "\t");
//             System.out.println();
//         }

//     }
// }