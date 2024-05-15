/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea6ed;

/**
 *
 * @author MIGUEL
 */
public class Tarea6EDClase {

    private static final double IVA = 1.21;
    private static final double DESCUENTO_A_PARTIR_DE = 3;
    private static final double DESCUENTO_IMPORTE = 5.0;
    private static final double AUMENTO_DESCUENTO_POR_CANTIDAD = 0.8;
    private static final double AUMENTO_DESCUENTO_POR_COMPRA = 0.95;

    public double aplicarDescuento(double precioProducto, double numeroProducto) {
        double total = 0;

        try {
            if (numeroProducto > DESCUENTO_A_PARTIR_DE) {
                precioProducto -= DESCUENTO_IMPORTE;
            }

            if (numeroProducto != 0) {
                total = precioProducto * AUMENTO_DESCUENTO_POR_CANTIDAD;
                sinIva(total);
            } else {
                total = precioProducto * AUMENTO_DESCUENTO_POR_COMPRA;
                sinIva(total);
            }
        } catch (Exception e) {
            System.out.println("Se ha producido un error: " + e.getMessage());
        }

        double totalConIVA = IVA * total;
        System.out.println("Total a pagar con IVA: " + totalConIVA);
        return totalConIVA;

    }

    public void sinIva(double total) {
        System.out.println("El total a pagar sin iva es:" + total);
        System.out.println("Enviado");
    }

}
