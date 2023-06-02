package entities;

public class Televisor {

	public int canal;
	public int volume;
	public boolean ligado = false;

	public void pularLinha() {
		System.out.println();
	}

	public void aumentarVolume() {
		if (ligado == true && volume < 10) {
			System.out.println("Aumentando volume...");
			volume = volume + 1;
		}
		System.out.println(volume);
	}

	public void reduzirVolume() {
		if (ligado == true && volume > 0) {
			System.out.println("Reduzindo volume...");
			volume = volume - 1;
		}
		System.out.println(volume);
	}

	public void subirCanal() {
		System.out.println("Mudando de canal");
		if (ligado == true && canal < 16) {
			canal = canal + 1;
		}
		System.out.println(canal);
	}

	public void descerCanal() {
		System.out.println("Voltando de canal");
		if (ligado == true && canal > 1) {
			canal = canal - 1;
		}
		System.out.println(canal);
	}

	public void ligarTelevisor() {
		ligado = true;
		System.out.println("Televisor ligado!");
	}

	public void desligarTelevisor() {
		ligado = false;
		System.out.println("Televisor desligado!");
	}

	public void mostrarStatus() {
		System.out.println("A televisão está: " + ligado);
		System.out.println("O canal atual é o: " + canal);
		System.out.println("O volume atual é: " + volume);
	}
}
