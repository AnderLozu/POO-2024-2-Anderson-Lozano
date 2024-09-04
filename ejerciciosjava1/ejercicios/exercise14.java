package ejercicios;
import java.util.Scanner;

// Ejercicio creado por Anderson Lozano - Tec. Software POO  u20241222418

public class exercise14 {
  
  public static void main(String[] args) {
    

    String genero = "";
    int bolita = 0;


    Scanner typegen = new Scanner(System.in);
    System.out.println("Ingrese su genero: ");
    genero = typegen.nextLine();

    Scanner numbolita = new Scanner(System.in);
    System.out.println("Ingrese el numero de la bola que saco: ");
    bolita = typegen.nextInt();


    switch(genero.toLowerCase()){

      case "hombre":
          switch(bolita){
            case 1:
            System.out.println("Haz sacado un Desodorante");
            break;
            case 2:
            System.out.println("Haz sacado un Six-pack de cerveza");
            break;
            case 3:
            System.out.println("Haz sacado una camiseta");
            break;
            case 4:
            System.out.println("Haz sacado una pantaloneta");
            break;
            case 5:
            System.out.println("Haz sacado una sudadera");
            break;
          }
        
      case "mujer":
          switch(bolita){
            case 1:
            System.out.println("Haz sacado un Locion");
            break;
            case 2:
            System.out.println("Haz sacado un Bikini");
            break;
            case 3:
            System.out.println("Haz sacado una crema para la cara");
            break;
            case 4:
            System.out.println("Haz sacado una plancha para el cabello");
            break;
            case 5:
            System.out.println("Haz sacado un esmalte de uña");
            break;
          }
        
        default: 
          System.out.println("Error: La ficha digitada no existe");
    }

  }
}
