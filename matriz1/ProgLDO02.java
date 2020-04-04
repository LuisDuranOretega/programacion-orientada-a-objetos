package progldo02;
import java.util.*;
public class ProgLDO02 {

    public static void main(String[] args) {

 Scanner leer=new Scanner (System.in);
 
 System.out.print("valor de conumnas: ");
 int n = leer.nextInt();
  System.out.print("valor de filas: ");
 int m = leer.nextInt();
 
 System.out.println("matriz 1");
 
 String[][]m1=new String [n][m];
 String[][]m2=new String [n][m];
 String[][]m3=new String [n][m];
 
 for (int i=0;i<n;i++){
  for (int j=0;j<m;j++){
      if (i==0||j==0||i==n-1||j==m-1 ){
          
      m1[i][j]="1";
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
    
    
  //1111111111111111111111111111111111111111111111111111111111111111  
  System.out.println("matriz 2");  
  System.out.println("\n");
  
  for (int i=0;i<n;i++){
  for (int j=0;j<m;j++){
      if (i==j||j==(m-(i+1)) ){
          
      m2[i][j]="1";
  }
  else{
          m2[i][j]="0";
          }          
 }
    
}
    for (int i = 0; i< n;i++) {
        for (int j = 0; j< m;j++){
            System.out.print(m2[i][j]+" ");
        }
        System.out.println(" ");
    }
    System.out.println("\n");
    
     //1111111111111111111111111111111111111111111111111111111111111111  
  System.out.println("matriz 3");  
  System.out.println("\n");
  
  for (int i=0;i<n;i++){
  for (int j=0;j<m;j++){
      if (i+j<n ){
           m3[i][j]="0";
  }
    if (i+j==(m-1))
           m3[i][j]=" ";
  
    if (i+j>=n){
           m3[i][j]="2";
  }
         
 }
    
}
    for (int i = 0; i< n;i++) {
        for (int j = 0; j< m;j++){
            System.out.print(m3[i][j]+" ");
        }
        System.out.println(" ");
    }
    System.out.println("\n");
    
    
    
}
}
