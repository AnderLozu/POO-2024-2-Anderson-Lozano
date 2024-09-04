package ejercicios;
import java.util.Scanner;

// Ejercicio creado por Anderson Lozano - Tec. Software POO u20241222418

public class exercise19 {
  public static void main(String[] args) {

    int numero = 0;

    Scanner scan = new Scanner(System.in);
    System.out.print("Ingrese un número del 1 al 10: ");
    numero = scan.nextInt();
    
    switch (numero) {
      case 1:
      case 3:
      case 5:
      case 7:
      case 9:
        System.out.println("El número es impar");
        break;

      case 2:
      case 4:
      case 6:
      case 8:
      case 10:
        System.out.println("El número es par");
        break;

      default:
        System.out.println("Número no válido");
        break;
    }
  }
}
