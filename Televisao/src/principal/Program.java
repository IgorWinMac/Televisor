package principal;

import entities.Televisor;

public class Program {

	public static void main(String[] args) {

		Televisor televisor = new Televisor();
		
		televisor.ligarTelevisor();
		
		//televisor.desligarTelevisor();
		
		televisor.aumentarVolume();
		televisor.aumentarVolume();
		televisor.aumentarVolume();
		
		//televisor.reduzirVolume();
		//televisor.reduzirVolume();
		//televisor.reduzirVolume();
		
		televisor.subirCanal();
		televisor.subirCanal();
		televisor.subirCanal();
		
		//televisor.descerCanal();
		televisor.descerCanal();
		
		//televisor.desligarTelevisor();
		
		televisor.pularLinha();
		
		televisor.mostrarStatus();
	}

}
