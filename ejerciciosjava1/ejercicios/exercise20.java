package ejercicios;
import java.util.Scanner;

// Ejercicio creado por Anderson Lozano - Tec. Software POO u20241222418

public class exercise20 {
  public static void main(String[] args) {
    

    double notaPrimerExamen, notaSegundoExamen ;
    double notaMedia = 3.0;
    
    Scanner quanota = new Scanner(System.in);
    System.out.println("Introduce la nota del primer examen: ");
    notaPrimerExamen = quanota.nextDouble();
    
    notaSegundoExamen = (notaMedia - (notaPrimerExamen * 0.4)) / 0.6;
    
    System.out.println("La nota mínima necesaria en el segundo examen es: " + notaSegundoExamen);
    
  }
}
