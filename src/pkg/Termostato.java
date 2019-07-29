package pkg;

public class Termostato {
	
	private int temperatura;
	
	public Termostato() {
		this.setTemperatura(20);
	}
	
	public Termostato (int temperatura) {
		this.temperatura = temperatura;
	}

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

}
