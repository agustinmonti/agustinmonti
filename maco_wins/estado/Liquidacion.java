package monti.fernando.maco_wins.estado;

public class Liquidacion extends Estado{
	@Override
	public double modificar(double p) {
		return p*0.5;
	}
}
