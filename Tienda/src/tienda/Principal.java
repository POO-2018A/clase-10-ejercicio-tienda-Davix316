/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;
import java.util.*;
/**
 *
 * @author toshiba
 */
public class Principal {
    public static void main (String [] agrs){
        //INGRESO DE DATOS DE LA TIENDA
        Scanner lector = new Scanner (System.in);
        Tienda [] tienda = new Tienda[1];
        //VARIABLES DE TIENDA
        String nombreTienda;
        String direccionTienda;
        String rucTienda;
        
        System.out.println("Ingrese el nombre de la tienda");
        nombreTienda = lector.nextLine();
        
        System.out.println("Ingrese la dirección");
        direccionTienda = lector.nextLine();
        
        System.out.println("Ingrese el número de RUC");
        rucTienda = lector.nextLine();
        
        tienda[0] = new Tienda(nombreTienda,direccionTienda,rucTienda);
        //Impresión de datos de la tienda
        System.out.println(); 
        System.out.println("         Tienda: "+ tienda[0].getNombre());
        System.out.println("Direccion: " + tienda[0].getDireccion());
        System.out.println("# RUC: " + tienda[0].getRuc());
        
        //INGRESO DE DATOS PARA PRODUCTOS y declaración de variables
        String marcaProducto;
        String codigoProducto;
        String tipoProducto;
        Double precioProducto;
        int numeroProducto=0;//Cantidad de productos que se van a ingresar
        int opcion;
        
        System.out.println();
        System.out.println("                 Menú");
        System.out.println("1.Ingresar nuevo producto");
        System.out.println("2.Visualizar lista de productos");
        System.out.println("3.Salir");
        System.out.println("Eliga una opción");
        opcion=lector.nextInt();
        Productos[] productos = new Productos[5];//se puede ingresar hasta 5 productos o menos dependiendo este valor
        //Menú interactivo
        do{
            
            switch(opcion){
            
                case 1:
                    //Ingreso de datos del producto
                    lector.nextLine();
                    System.out.println("Ingrese la marca del producto.");
                    marcaProducto = lector.nextLine();
                    System.out.println("Ingrese el codigo del producto.");
                    codigoProducto = lector.nextLine();
                    System.out.println("Ingrese el tipo de producto(alimento, electrodoméstico, ropa)");
                    tipoProducto = lector.nextLine();
                    System.out.println("Ingrese el precio del producto en dolares");
                    precioProducto = lector.nextDouble();
                    //Se guarda los datos datos ingresados en cada arreglo
                    productos [numeroProducto] = new Productos(marcaProducto,codigoProducto,tipoProducto,precioProducto);
                    numeroProducto++;
                     
                    
                    break;
                    
                case 2:
                    
                    System.out.println("    Lista de productos");
                    
                    if(numeroProducto == 0){
                        System.out.println("No existe registro de productos por favor ingrese un producto.");
                    }
                    
                    System.out.println("Producto #: " + numeroProducto );
                    for(int i=0; i<numeroProducto ; i++){
                        
                        System.out.println("Marca: " + productos[i].getMarca());
                        System.out.println("Codigo: " + productos[i].getCodigo());
                        System.out.println("Tipo: " + productos[i].getTipo());
                        System.out.println("Precio: " + productos[i].getPrecio());
                        System.out.println();
                    }
                    break;
                    
                default:
                    
                    System.out.println("Ingrese opción valida.");
                    break;
        
        }
            System.out.println();
        System.out.println("                 Menú");
        System.out.println("1.Ingresar nuevo producto");
        System.out.println("2.Visualizar lista de productos");
        System.out.println("3.Salir");
        System.out.println("Eliga una opción");
        opcion=lector.nextInt();
        
        } while (opcion != 3);
        if (opcion == 3){
            System.out.println("Gracias");
        }
        
    }
}
