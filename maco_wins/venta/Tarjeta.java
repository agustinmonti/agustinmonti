package monti.fernando.maco_wins.venta;

public class Tarjeta extends TipoPago{
	double recargo;
	Tarjeta(double recargo){
		this.recargo=recargo;
	}
	@Override
	public double getRecargo(double total,int cuotas) {
		return recargo*cuotas+0.1*total;
	}
}
