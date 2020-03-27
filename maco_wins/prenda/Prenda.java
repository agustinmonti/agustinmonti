package monti.fernando.maco_wins.prenda;
import monti.fernando.maco_wins.estado.*;
public abstract class Prenda {
	Estado estado;
	double precio;
	Prenda(Estado estado,double precio){
		this.estado=estado;
		this.precio=precio;
	}
	public double getPrecio() {
		return estado.modificar(precio);
	}
	public Estado getEstado() {
		return estado;
	}
}
