package examenProg;

public class Mano {

	protected Carta[] cartas;
	protected String nombreMano;
	protected int indice;
	protected int numeroDeCartas;

	public Mano(String nombreMano, int numeroDeCartas) {

		this.nombreMano = nombreMano;
		this.numeroDeCartas = numeroDeCartas;
	}

	public void cogerCarta() {

		int posicion = (int) (Math.random() * 54);

		if (cartas[posicion].enBaraja == true) {

			mano.cartas[mano.indice] = cartas[posicion];
			mano.indice++;
			cartas[posicion].enBaraja = false;

			if (mano.indice == mano.numeroDeCartas)
				mano.indice = 0;
		}
	}

	@Override
	public String toString() {

		String devolver = nombreMano + "[";
		for (int i = 0; i < cartas.length; i++) {
			devolver += cartas[i] + ",";
		}

		devolver += "]";
		return devolver;
	}

}
