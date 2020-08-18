package pacoteJava;

public class ex1Fornecedor extends ex1Pessoa{
	private double valorCredito;
	private double valorDivida;
	private double obterSaldo;
	
	public ex1Fornecedor(String nome, String endereço, String telefone, double valorCredito, double valorDivida, double obterSaldo)
	{
		super(nome,endereço,telefone);
		
	}

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	void obterSaldo(double obterSaldo)
	{
		(this.valorCredito-valorDivida);
		this.obterSaldo=obterSaldo;	
		
	}	

}
