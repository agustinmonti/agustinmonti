package monti.fernando.maco_wins;

import java.util.ArrayList;
import java.util.List;

import monti.fernando.maco_wins.estado.*;
import monti.fernando.maco_wins.prenda.*;
import monti.fernando.maco_wins.venta.*;
/**
 * Hello world!
 *
 */
public class App 
{
	public static List<Venta> ventas= new ArrayList<Venta>();
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Venta v1= new Venta();
        v1.agregarPrenda(new Camisa(new Nuevo(),10));
        v1.agregarPrenda(new Pantalon(new Promocion(5),20));
        v1.agregarPrenda(new Saco(new Liquidacion(),30));
        v1.finalizarVenta();
        v1.pagarEfectivo();
        ventas.add(v1);
        
        Venta v2= new Venta();
        v2.agregarPrenda(new Camisa(new Nuevo(),10));
        v2.agregarPrenda(new Camisa(new Promocion(5),10));
        v2.agregarPrenda(new Saco(new Liquidacion(),30));
        v2.finalizarVenta();
        v2.pagarTarjeta(10, 5);
        ventas.add(v2);
        
        imprimirVentas();
        System.out.printf("ventas:%d total:%f\n",ventas.size(),calcularTotal());
    }
    public static double calcularTotal() {
    	double total=0;
    	for(Venta v:ventas) {
    		total+=v.calcularTotal();
    	}
    	return total;
    }
    public static void imprimirVentas() {
    	for(Venta v:ventas) {
    		System.out.println(v.getFecha());
    		v.imprimirPrendas();
    		System.out.printf("Total Venta:%f\n\n",v.calcularTotal());
    	}
    }
}
