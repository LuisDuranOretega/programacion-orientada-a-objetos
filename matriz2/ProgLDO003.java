package progldo003;

import java.util.Scanner;

public class ProgLDO003 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("valor de conumnas: ");
        int n = leer.nextInt();
        System.out.print("valor de filas: ");
        int m = leer.nextInt();

        String[][] m1 = new String[n][m];

         System.out.println("\n");
  
  for (int i=0;i<n;i++){
  for (int j=0;j<m;j++){
      if (i==j||j==(m-(i+1)) ){
          
      m1[i][j]=" ";
      
  }
  else{
          m1[i][j]="0";
          }          
 }
    
}
    for (int i = 0; i< n;i++) {
        for (int j = 0; j< m;j++){
            System.out.print(m1[i][j]+" ");
        }
        System.out.println(" ");
    }
    System.out.println("\n");
    
    }
}