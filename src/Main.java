import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

        //creacion de variable para formatear todos los double para que tengan 2 casas decimales
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("\n--------- EJERCICIO 1 -----------");
        ejercicio1();

        System.out.println("\n--------- EJERCICIO 2 -----------");
        ejercicio2(df);

        System.out.println("\n--------- EJERCICIO 3 -----------");
        ejercicio3(df);

        System.out.println("\n--------- EJERCICIO 4 -----------");
        ejercicio4(df);

        System.out.println("\n--------- EJERCICIO 5 -----------");
        ejercicio5(df);
    }

    public static void ejercicio1(){
        //Informaciones del coche
        String modeloCoche = "Citroen C3";
        int plazasCoche = 5;
        double precioDiarioCoche = 151.96;

        //Informaciones de la moto
        String modeloMoto = "Benelli TRK 702x";
        int plazasMoto = 2;
        double precioDiarioMoto = 50.0;

        //Informaciones del patinete
        String modeloPatinete = "Xiaomi Electric Scooter 4";
        int plazasPatinete = 1;
        double precioDiarioPatinete = 60.0 ;

        //Informaciones de la furgoneta
        String modeloFurgoneta = "Renault Trafic 2.0T";
        int plazasFurgoneta = 3;
        double precioDiarioFurgoneta = 41.97 ;

        // Imprimir informacion en la pantalla
        System.out.println("COCHE \n" +
                "- Modelo: " + modeloCoche + "\n" +
                "- Plazas: " + plazasCoche + "\n" +
                "- Precio: " + precioDiarioCoche + " €/día \n"
        );
        System.out.println("MOTO \n" +
                "- Modelo: " + modeloMoto + "\n" +
                "- Plazas: " + plazasMoto+ "\n" +
                "- Precio: " + precioDiarioMoto + " €/día \n"
        );
        System.out.println("PATINETE \n" +
                "- Modelo: " + modeloPatinete + "\n" +
                "- Plazas: " + plazasPatinete + "\n" +
                "- Precio: " + precioDiarioPatinete + " €/día \n"
        );
        System.out.println("FURGONETA \n" +
                "- Modelo: " + modeloFurgoneta + "\n" +
                "- Plazas: " + plazasFurgoneta + "\n" +
                "- Precio: " + precioDiarioFurgoneta + " €/día"
        );
    }

    public static void ejercicio2(DecimalFormat df){

        // Cantidades de cada tipo
        int cantidadCoches = 7;
        int cantidadMotos = 10;
        int cantidadPatinetes = 8;
        int cantidadFurgonetas = 2;

        //Precio definido para cada tipo
        double precioDiarioCoche = 151.96;
        double precioDiarioMoto = 50.0;
        double precioDiarioPatinete = 60.0 ;
        double precioDiarioFurgoneta = 41.97 ;

        //Imprime por la pantalla la cantidad de cada tipo que ha sido alquilado
        System.out.println("CANTIDAD DE ALQUILADOS DE CADA TIPO \n" +
                "Coches: " + cantidadCoches + "\n" +
                "Motos: " + cantidadMotos + "\n" +
                "Patinete: " + cantidadPatinetes + "\n" +
                "Furgonetas: " + cantidadFurgonetas + "\n"
        );

        //Guarda la cantidad total de dia sumando todos los vehiculos multiplicados por su precio
        double ingresosTotales = cantidadCoches * precioDiarioCoche +
                cantidadMotos * precioDiarioMoto +
                cantidadPatinetes * precioDiarioPatinete +
                cantidadFurgonetas * precioDiarioFurgoneta;

        // Imprime por la pantalla el total
        System.out.println("Ingresos totales del día: " + df.format(ingresosTotales) + " €");
    }

    public static void ejercicio3(DecimalFormat df){
        // Cantidad de coches alquilados
        int cantidadCoches = 7;

        // Informaciones del coche
        String modeloCoche = "Citroen C3";
        double precioDiarioCoche = 151.96;
        final int descuentoCoche = 10;

        // Calcula el precio sin descuento (subtotal)
        double subtotal = cantidadCoches * precioDiarioCoche;

        // Aplica el descuento
        double precioConDescuento = subtotal - ((double)descuentoCoche/100 * subtotal);

        // Imprime por la pantalla las informaciones las informaciones del vehiculo, subtotal y el precio final
        System.out.println("Vehiculo: " + modeloCoche + "\n" +
                        "Unidades: " + cantidadCoches + "\n" +
                        "Subtotal: " + df.format(subtotal) + " €\n" +
                        "Descuento: " + descuentoCoche + "%\n" +
                        "TOTAL: " + df.format(precioConDescuento) + " €"
                );

    }

    public static void ejercicio4(DecimalFormat df){
        // Precios de cada vehiculo
        double precioDiarioCoche = 151.96;
        double precioDiarioMoto = 50.0;
        double precioDiarioPatinete = 60.0;
        double precioDiarioFurgoneta = 41.97;

        // Calcula la media de los precios definidos
        double precioMedio = (precioDiarioCoche + precioDiarioMoto + precioDiarioPatinete + precioDiarioFurgoneta)/4;

        // Imprime por la pantalla el precio medio
        System.out.println("Precio medio: " + df.format(precioMedio) + " €");
    }

    public static void ejercicio5(DecimalFormat df){
        // Cantidades de cada vehiculo
        int cantidadCoches = 7;
        int cantidadMotos = 10;
        int cantidadPatinetes = 8;
        int cantidadFurgonetas = 2;

        // Calcula el total de vehiculos alquilados en el dia
        int totalVehiculos =  cantidadCoches + cantidadMotos + cantidadPatinetes + cantidadFurgonetas;

        /* Calcula el porcentaje de vehiculos de cada tipo : totalDelTipo/totalVehiculos * 100
           Se hace el casting para que salga el valor correcto de la porcentaje porque totalDelTipo/totalVehiculos siempre sale 0 */
        double porcentajeCoches = (double)cantidadCoches / totalVehiculos * 100;
        double porcentajeMotos = (double)cantidadMotos / totalVehiculos * 100;
        double porcentajePatinetes = (double)cantidadPatinetes / totalVehiculos * 100;
        double porcentajeFurgonetas = (double)cantidadFurgonetas / totalVehiculos * 100;

        System.out.println("Total vehículos: " + totalVehiculos + "\n" +
                "Coches: " + df.format(porcentajeCoches) + "\n" +
                "Motos: " + df.format(porcentajeMotos) + "\n" +
                "Patinetes: " + df.format(porcentajePatinetes) + "\n" +
                "Furgonetas: " + df.format(porcentajeFurgonetas)
                );

    }
}