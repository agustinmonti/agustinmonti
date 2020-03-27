package monti.fernando.maco_wins.estado;
//Nueva: en este caso no modifican el precio base.
//Promoción: Le resta un valor fijo decidido por el usuario.
//Liquidación: Es un 50% del valor del producto.

public abstract class Estado {
	public double modificar(double p) {
		return p;
	}
}