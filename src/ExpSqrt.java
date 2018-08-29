import java.lang.Math;

public class ExpSqrt extends Expressao{
	private float valor;
	private Expressao sqrt;

	public ExpSqrt(Expressao sqrt){
		this.sqrt = sqrt;
	}

	public float avalia(){
		this.valor = sqrt.avalia(); // Avalia o valor da expressao armazenada.
		return (float) Math.sqrt((double) this.valor);
	}
}