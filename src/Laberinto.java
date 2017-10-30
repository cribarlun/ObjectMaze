
public class Laberinto {

	private Punto dimensionMatriz;
	private Punto persona;
	private Punto tesoro;

	public Laberinto(Punto dimensionMatriz, Punto persona, Punto tesoro) {
		this.dimensionMatriz = dimensionMatriz;
		this.persona = persona;
		this.tesoro = tesoro;
	}

	public Punto getDimensionMatriz() {
		return dimensionMatriz;
	}

	public void setDimensionMatriz(Punto dimensionMatriz) {
		this.dimensionMatriz = dimensionMatriz;
	}

	public Punto getPersona() {
		return persona;
	}

	public void setPersona(Punto persona) {
		this.persona = persona;
	}

	public Punto getTesoro() {
		return tesoro;
	}

	public void setTesoro(Punto tesoro) {
		this.tesoro = tesoro;
	}

}
