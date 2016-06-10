package cl.java.Builder;

import java.util.ArrayList;

public class BuilderAutoTesla extends BuilderAuto{

	public Auto construir(){
		ArrayList<Ruedas> ruedas = new ArrayList<Ruedas>();
		ruedas.add(new Ruedas(3));
		ruedas.add(new Ruedas(3));
		ruedas.add(new Ruedas(3));
		ruedas.add(new Ruedas(3));
		GPS gps1 = new GPS("Random", 2016);
		Motor motorTesla = new Motor(60);
		Auto autoTesla = new Auto("Tesla","Electronic",ruedas,gps1,motorTesla);
		return autoTesla;
	}
	
}
