package examenProg;

public class Baraja {

	protected Carta[] cartas;

	public void generarBaraja() {
		
		
	}

	public void darCarta(Mano mano) {

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

		String devolver = "[";
		for (int i = 0; i < cartas.length; i++) {
			devolver += cartas[i] + ",";
		}

		devolver += "]";
		return devolver;
	}
}
