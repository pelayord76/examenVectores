package examenProg;

public class Carta {

	protected String valor;
	protected boolean enBaraja;

	public Carta(String valor, boolean enBaraja) {

		this.valor = valor;
		this.enBaraja = enBaraja;
	}
	
	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public boolean isEnBaraja() {
		return enBaraja;
	}

	public void setEnBaraja(boolean enBaraja) {
		this.enBaraja = enBaraja;
	}
	
}
