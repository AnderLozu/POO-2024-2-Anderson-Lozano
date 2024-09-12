import java.util.Scanner;

public class TallerClase {
    public static void main(String[] args) {

        // Se define la matriz de datos de vehículos

        final int maximoCarros = 100;
        double[][] datosCarros = new double[maximoCarros][6];
        int registroCarros = 0;
        Scanner scanner = new Scanner(System.in);
        boolean siguiente = true;

        // Se recogen los datos de los vehículos

        while (siguiente && registroCarros < maximoCarros) {
            System.out.println("Ingrese el tipo de servicio (1: cargue, 2: descargue): ");
            int tipoServicio = scanner.nextInt();
            System.out.println("Ingrese el tipo de producto (1: perecedero, 2: o perecedero): ");
            int tipoProducto = scanner.nextInt();
            System.out.println("Ingrese el peso transportado (toneladas): ");
            double peso = scanner.nextDouble();
            System.out.println("Ingrese el tiempo de permanencia (horas): ");
            double tiempo = scanner.nextDouble();
            System.out.println("Ingrese el largo del camión (metros): ");
            double largo = scanner.nextDouble();


        // Se calcula el costo del parqueadero

            double precioParqueadero = 0;
            if (tipoServicio == 2) { // Descargue
                if (tipoProducto == 1) { // Perecedero
                    if (peso < 8) {
                        precioParqueadero = peso * 15000;
                    } else {
                        precioParqueadero = peso * 9000;
                    }
                } else { // No perecedero
                    if (peso < 10) {
                        precioParqueadero = 60000;
                    } else {
                        precioParqueadero = 60000 + (peso - 10) * 7000;
                    }
                }
            } else { // Cargue
                if (tiempo > 2) {
                    precioParqueadero = (tiempo - 2) * 4000;
                    if (largo > 4) {
                        precioParqueadero *= 1.25;
                    }
                }
            }

            // Se almacenan los datos del vehículo

            datosCarros[registroCarros][0] = tipoServicio;
            datosCarros[registroCarros][1] = tipoProducto;
            datosCarros[registroCarros][2] = peso;
            datosCarros[registroCarros][3] = tiempo;
            datosCarros[registroCarros][4] = largo;
            datosCarros[registroCarros][5] = precioParqueadero;

            registroCarros++;

            System.out.println("¿Quiere continuar capturando datos? (1: Sí, 2: No)");
            siguiente = scanner.nextInt() == 1;
        }

        // Se calculan los datos solicitados

        for (int i = registroCarros; i < maximoCarros; i++) {
            int tipoServicio = (int) (Math.random() * 2) + 1;
            int tipoProducto = (int) (Math.random() * 2) + 1;
            double pesoTransportado = Math.random() * 20;
            double tiempoPermanencia = Math.random() * 10;
            double largoCamion = Math.random() * 10;

        // Se calcula el costo del parqueadero

            double costoParqueadero = 0;
            if (tipoServicio == 2) { // Descargue
                if (tipoProducto == 1) { // Perecedero
                    if (pesoTransportado < 8) {
                        costoParqueadero = pesoTransportado * 15000;
                    } else {
                        costoParqueadero = pesoTransportado * 9000;
                    }
                } else { // No perecedero
                    if (pesoTransportado < 10) {
                        costoParqueadero = 60000;
                    } else {
                        costoParqueadero = 60000 + (pesoTransportado - 10) * 7000;
                    }
                }
            } else { // Cargue
                if (tiempoPermanencia > 2) {
                    costoParqueadero = (tiempoPermanencia - 2) * 4000;
                    if (largoCamion > 4) {
                        costoParqueadero *= 1.25;
                    }
                }
            }

            // Se almacenan los datos del vehículo

            datosCarros[i][0] = tipoServicio;
            datosCarros[i][1] = tipoProducto;
            datosCarros[i][2] = pesoTransportado;
            datosCarros[i][3] = tiempoPermanencia;
            datosCarros[i][4] = largoCamion;
            datosCarros[i][5] = costoParqueadero;
        }

        // Se calculan los datos solicitados de carga y descarga

        double totalCostoCargue = 0, totalCostoDescargue = 0;
        int cantidadCargue = 0, cantidadDescargue = 0, menosDeDosHoras = 0;
        double costoPerecederos = 0;

        for (int i = 0; i < registroCarros; i++) {
            int tipoServicio = (int) datosCarros[i][0];
            int tipoProducto = (int) datosCarros[i][1];
            double tiempoPermanencia = datosCarros[i][3];
            double costoParqueadero = datosCarros[i][5];

            if (tipoServicio == 1) { // Cargue
                totalCostoCargue += costoParqueadero;
                cantidadCargue++;
            } else { // Descargue
                totalCostoDescargue += costoParqueadero;
                cantidadDescargue++;
                if (tipoProducto == 1) { // Perecedero
                    costoPerecederos += costoParqueadero;
                }
            }

            if (tiempoPermanencia < 2) {
                menosDeDosHoras++;
            }
        }

        // Se calculan los promedios

        double promedioCostoCargue = 0;
        if (cantidadCargue > 0) {
            promedioCostoCargue = totalCostoCargue / cantidadCargue;
        }

        double promedioCostoDescargue = 0;
        if (cantidadDescargue > 0) {
            promedioCostoDescargue = totalCostoDescargue / cantidadDescargue;
        }

        // Se imprimen los resultados

        System.out.println("Informe:");
        System.out.println("Promedio costo parqueadero Cargue: " + promedioCostoCargue);
        System.out.println("Promedio costo parqueadero Descargue: " + promedioCostoDescargue);
        System.out.println("Cantidad de vehículos Cargue: " + cantidadCargue);
        System.out.println("Cantidad de vehículos Descargue: " + cantidadDescargue);
        System.out.println("Cantidad de vehículos menos de dos horas: " + menosDeDosHoras);
        System.out.println("Costo parqueadero vehículos perecederos: " + costoPerecederos);

        scanner.close();
    }
}
