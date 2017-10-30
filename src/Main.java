
public class Main {

	public static void main(String[] args) {

		int random = 0;
		int dimensionMatrizP1 = 40;
		int dimensionMatrizP2 = 10;
		int personaP1 = (int) Math.floor(Math.random() * ((dimensionMatrizP1 - 1) - 1 + 1) + 1);
		int personaP2 = 0; // Este valor puede ser 0 o dimensionMatrizP2
		int tesoroP1 = (int) Math.floor(Math.random() * ((dimensionMatrizP1 - 1) - 1 + 1) + 1);
		int tesoroP2 = (int) Math.floor(Math.random() * ((dimensionMatrizP2 - 1) - 1 + 1) + 1);

		Punto dimensionMatriz = new Punto(dimensionMatrizP1, dimensionMatrizP2);
		Punto persona = new Punto(personaP1, personaP2);
		Punto tesoro = new Punto(tesoroP1, tesoroP2);
		Laberinto laberinto = new Laberinto(dimensionMatriz, persona, tesoro);

		String cadena = "";

		for (int i = 0; i <= laberinto.getDimensionMatriz().getP2(); i++) {// recorro
																			// filas
			for (int j = 0; j <= laberinto.getDimensionMatriz().getP1(); j++) { // recorro
																				// columnas

				random = (int) (Math.random() * 2); // numero aleatorio entre 0
													// y 1
				if (random == 0) {
					laberinto.getPersona().setP2(laberinto.getDimensionMatriz().getP2());
				}
				if (laberinto.getPersona().getP1() == j && laberinto.getPersona().getP2() == i) {
					cadena = cadena + "o";
				} else if (i == 0 || i == laberinto.getDimensionMatriz().getP2()) {
					cadena = cadena + "-";
				} else if (j == 0 || j == laberinto.getDimensionMatriz().getP1()) {
					cadena = cadena + "|";
				} else {
					if (laberinto.getTesoro().getP1() == j && laberinto.getTesoro().getP2() == i) {
						cadena = cadena + "*";

					} else if (random == 0) {
						cadena = cadena + "/";
					} else {
						cadena = cadena + "\\";
					}

				}

			}
			System.out.println(cadena);
			cadena = "";
		}

	}

}
