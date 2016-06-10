package cl.java.Builder;

import java.util.ArrayList;

public class Auto {
	
	private String marca;
	private String modelo;
	private ArrayList<Ruedas> Ruedas;
	private GPS gps;
	private Motor motor;
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public ArrayList<Ruedas> getRuedas() {
		return Ruedas;
	}
	public void setRuedas(ArrayList<Ruedas> ruedas) {
		Ruedas = ruedas;
	}
	public GPS getGps() {
		return gps;
	}
	public void setGps(GPS gps) {
		this.gps = gps;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	public Auto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Auto(String marca, String modelo, ArrayList<cl.java.Builder.Ruedas> ruedas, GPS gps, Motor motor) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		Ruedas = ruedas;
		this.gps = gps;
		this.motor = motor;
	}
	
	
}
