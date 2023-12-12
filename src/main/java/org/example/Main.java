package org.example;


import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Entradas del problema
        String nombreProducto;
        String nombreDistribuidor;
        double costoLote;
        double costoVentaPublico;
        double totalCompra;
        int cantidadCompraProducto;

        //Proceso

        System.out.println("***********");
        System.out.println("FRUGAL SAS");
        System.out.println("***********");

        Scanner leerDato = new Scanner(System.in);

        System.out.println("1. Ingrese el nombre del producto que ingresa a bodega.");
        nombreProducto = leerDato.nextLine();

        System.out.println("2. Ingrese el nombre de el distribuidor de productos.");
        nombreDistribuidor = leerDato.nextLine();

        System.out.println("3. Ingrese el costo del lote.");
        costoLote = leerDato.nextDouble();

        System.out.println("**********************************");

        System.out.println("Resumen ingreso mercancia");
        System.out.println("Lote que entra: " + nombreProducto);
        System.out.println("Costo total $" + costoLote);
        System.out.println("Entregado por : " + nombreDistribuidor);
        System.out.println("**********************************");

        System.out.println("\n +++++++Venta al detal:+++++++++++ \n");
        costoVentaPublico=5000;


        System.out.println("Apreciado usuario, el costo unitario de " + nombreProducto +
                " Es de:" + costoVentaPublico);

        System.out.println("Digita la cantidad de " + nombreProducto + "Que quieres comprar");
        cantidadCompraProducto = leerDato.nextInt();

        //CALCULANDO VALOR DE VARIABLE

        totalCompra = costoVentaPublico * cantidadCompraProducto;
        System.out.println("El valor total de su compra es de : $" + totalCompra);





    }
}