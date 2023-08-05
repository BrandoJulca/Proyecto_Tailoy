
package reciclaje;

import project.PYC;
import project.Productos;


public class PrintProducto {
    public static void main(String[] args) {
        PYC Electrodomestico = new Productos("0123", "laptop", "CateE", 1200);
        System.out.println(Electrodomestico.mostrarCodigo());
        System.out.println(Electrodomestico.getPrecio());
        
        
//        Producto p[] = new Producto[0];
//         p[0]=new Electrodomestico("ELECT01", "LAPTOP", 1200);
//         for(Producto pro: p){
//            System.out.println(pro.mostrarDatos());
    }
}

