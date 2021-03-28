
package Matrix;
public class Tugas2 {
    public static void main(String[] args){
        int[][] matrix_a = {
            {14, 15},
            {16, 17},
            {18, 19}
        
    };
    int[][] matrix_b = {
        {2 ,3},
        {4 ,5},
        {6 ,7}
            
    };
       int[][]hasilTambah = new int[matrix_a.length][matrix_a[0].length];
      if (matrix_a.length == matrix_b.length && matrix_a[0].length == matrix_b[0].length){
          for (int i=0; i<matrix_a.length; i++) {
              for (int j=0; j<matrix_a[0].length; j++) {
                  
                  hasilTambah[i][j] = matrix_a[i][j] = matrix_b[i][j];
                  System.out.print(hasilTambah[i][j]+ " ");
              }
              System.out.println();
          }
      } 
    
    
      else{
    System.out.print("\n baris dan kolom matrix tidak sama");
    System.out.println("pagit krisnandi");
}
    }
}