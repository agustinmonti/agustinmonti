package monti.fernando.maco_wins.venta;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import monti.fernando.maco_wins.prenda.*;
public class Venta {
	List<Prenda> prendas=new ArrayList<Prenda>();
	Date fecha;
	TipoPago pago;
	int cuotas;
	public void agregarPrenda(Prenda prenda) {
		prendas.add(prenda);
	}
	public double calcularTotal() {
		double total=0;
		total=prendas.stream().mapToDouble(a->a.getPrecio()).sum();
//		for(Prenda p:prendas) {
//			total+=p.getPrecio();
//		}
		total+=pago.getRecargo(total,cuotas);
		return total;
	}
	public void finalizarVenta() {
		fecha= new Date();
	}
	public void imprimirPrendas() {
		for(Prenda p:prendas) {
			System.out.println(p.getClass().getSimpleName()+" "+p.getEstado().getClass().getSimpleName()+" $:"+p.getPrecio());
		}
	}
	public String getFecha() {
		String stringFecha;
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");  
		stringFecha = dateFormat.format(fecha);  
		return stringFecha; 
	}
	public void pagarTarjeta(double recargo,int cuotas) {
		this.pago=new Tarjeta(recargo);
		this.cuotas=cuotas;
	}
	public void pagarEfectivo() {
		this.pago=new Efectivo();
	}
}
