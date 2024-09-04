package ejercicios;
import java.util.Scanner;


// Ejercicio creado por Anderson Lozano - Tec. Software POO  u20241222418


public class exercise10 {
  
  public static void main(String[] args) {
    
    int horas = 0;
    int horasMin = 40;
    int pagoMin = 5000;
    int pagoExtra;
    int horasExtra = 0;
    int totalPago = 0;
    
    Scanner quantHora = new Scanner(System.in);
    System.out.println("Ingrese cuantas horas trabajo en la semana");
    horas = quantHora.nextInt();


    if(horas > 40){
      horasExtra = horas - horasMin;
      System.out.println("Usted ha trabajado " + horasExtra + " horas extra.");
    } else {
      System.out.println("No ha trabajado horas extra");
    }

    if(horas <= 40){
      totalPago = horas * pagoMin;
    } else{
      pagoExtra = pagoMin * (int)0.20;
      totalPago = (horas * pagoMin) + (horasExtra * (pagoMin + pagoExtra));
    }

    System.out.println("El total de su salario por semana es: " + totalPago);
  }
}
