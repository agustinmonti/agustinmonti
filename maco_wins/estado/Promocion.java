package monti.fernando.maco_wins.estado;

public class Promocion extends Estado{
	double descuento;
	public Promocion(double descuento){
		this.descuento=descuento;
	}
	@Override
	public double modificar(double p) {
		return p-descuento;
	}
}
