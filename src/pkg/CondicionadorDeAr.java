package pkg;

public class CondicionadorDeAr {
	
	private Termostato termostato;
	private boolean ligado;
	
	public CondicionadorDeAr() {
		this.setLigado(false);
		termostato = new Termostato();
	}
	
	public Termostato getTermostato() {
		return termostato;
	}

	public void setTermostato(Termostato termostato) {
		this.termostato = termostato;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public void ligar() {
		this.ligado = true;
	}
	
	public void desligar() {
		this.ligado = false;
		
	}
	
	public void aumentarTemperatura() {
		int temp = this.getTermostato().getTemperatura();
		if (temp < 28) {
			this.getTermostato().setTemperatura(temp+=1);
		}
	}
	
	public void diminuirTemperatura() {
		int temp = this.getTermostato().getTemperatura();
		if (temp > 15) {
			this.getTermostato().setTemperatura(temp-=1);
		}
	}
	
	@Override
	public String toString() {
		if (this.isLigado() == true) {
			return "Ar Condicionado está Ligado! Temperatura atual: " + this.getTermostato().getTemperatura();
		}else
			return"Ar Condicionado está Desligado.";
	}

	
}
