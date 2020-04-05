
package progldo005;

import java.util.Scanner;

public class ProgLDO005 {
    static int[] array = new int[5];
    static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        
     insertarDatosArray();
sumarArray();
maxArray();
promedioArray();
ordenArray();
}
private static void insertarDatosArray() {
for (int i = 0; i < array.length; i++) {
System.out.print("insertar array[" + i + "]:");
array[i] = SC.nextInt();
}
}
private static void sumarArray() {
System.out.print("Suma: ");
int acumulador = 0;
for (int i = 0; i < array.length; i++) {
acumulador = acumulador + array[i];
System.out.print("+" + array[i]);
}
System.out.println("= " + acumulador);
}
private static void maxArray() {
System.out.print("Maximo: ");
int max = 0;
for (int i = 0; i < array.length; i++) {
if (array[i] > max) {
max = array[i];
}
}
System.out.println(max);
}
private static void promedioArray() {
System.out.print("Promedio: ");
double promedio = 0;
for (int i = 0; i < array.length; i++) {
promedio = promedio + array[i];
}
promedio = promedio / array.length;
System.out.println(promedio);
    }

 public static void ordenArray(){
int i,j,aux;
for(i=0;i<array.length;i++){
  for(j=i+1;j<array.length;j++){
   if(array[i]<array[j])
   {
   aux=array[i];
    array[i]=array[j];
    array[j]=aux;
   }      
  }
}
for(i=0;i<array.length;i++){
 System.out.println("Arreglo Ordenado "+array[i]);
}
}
}


