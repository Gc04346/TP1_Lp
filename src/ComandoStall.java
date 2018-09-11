// Em alguns casos o comando vai interpretar a variável como uma nova palavra.
// Nesse caso vamos ter um comando para não executar nada nele.
public class ComandoStall extends Comando{
	protected int linha;

	public ComandoStall(int lin){
		this.linha=lin;
	}

	public int executa(){
		return this.linha;
	}
}