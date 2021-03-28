package Matrix;
public class Tugas3 {
 public static void main(String[] args){
     int[][] A = {
         {7, 3, 6},
         {4, 1, 2},
     };
     int[][] B = {
         {6, 8},
         {9, 5},
         {2, 7}
     };
     if (A[0].length == B.length) {
         int[][] C = new int[A.length][B[0].length];
         for(int i=0; i<A.length; i++) {
             for(int j=0; j<B[0].length; j++) {
                 for (int k=0; k<A[0].length; k++) {
                     C[i][j] += A[i][k] * B[k][j];
                 }             
         }
     }
      for(int[] c: C) {   
     for(int i: c) {
      System.out.print(i+ " ");
}
System.out.println();
      }
     }
     else {
         System.out.println("ukura kolom A tidak sama dengan baris B");
         System.out.println("Pagit krisnandi");
     }
 }
}