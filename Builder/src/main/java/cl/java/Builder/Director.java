package cl.java.Builder;

public class Director {
	private BuilderAuto builder;
	
	
	public BuilderAuto getBuilder() {
		return builder;
	}


	public void setBuilder(BuilderAuto builder) {
		this.builder = builder;
	}


	public Auto construirAuto(){
		
		return this.builder.construir();
	}
	
}
