package ejercicios;
import java.util.Scanner;

// Ejercicio creado por Anderson Lozano - Tec. Software POO  u20241222418

public class exercise8 {
  
  public static void main(String[] args) {

    int userEdad = 0;
    int trabajoTiempo = 0;
    
    Scanner questEdad = new Scanner(System.in);
    System.out.println("Digite su edad: ");
    userEdad = questEdad.nextInt();

    Scanner questTrabajo = new Scanner(System.in);
    System.out.println("Digite su años de empleo: ");
    trabajoTiempo = questTrabajo.nextInt();

    if(userEdad >= trabajoTiempo){
      System.out.println("Su clasificacion es: ");
    } else {
      System.out.println("Datos sin concordancia. Digitelos de nuevo. ");
      return;
    }


    if(userEdad >= 60 && trabajoTiempo >= 25){
      System.out.println("Usted forma parte de las personas del tipo de jubilacion Por antiguedad adulta. ");
    } else if (userEdad <= 60 && trabajoTiempo >= 25){
      System.out.println("Usted forma parte de las personas del tipo de jubilacion Por antiguedad joven. ");
    } else if (userEdad >= 60 && trabajoTiempo < 25){
      System.out.println("Usted forma parte de las personas del tipo de jubilacion Por antiguedad por edad. ");
    } else {
      System.out.println("Usted aun no cumple con ninguno de los 3 tipos de jubilacion.");
    }


  }
}
