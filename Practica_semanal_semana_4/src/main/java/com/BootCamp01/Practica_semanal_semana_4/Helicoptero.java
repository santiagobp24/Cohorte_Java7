package com.BootCamp01.Practica_semanal_semana_4;


public class Helicoptero extends Vehículos implements Aterrizable{
	
	
	
	private String ColorDePatinDeAterrizaje;
	
	public Helicoptero(String nombreDelPiloto, Integer peso, int cantidadDeMotores, String ColorDePatinDeAterrizaje) {
		super(nombreDelPiloto, peso, cantidadDeMotores);
		this.ColorDePatinDeAterrizaje = ColorDePatinDeAterrizaje;
	}

	public Helicoptero() {
	}

	public String getColorDePatinDeAterrizaje() {
		return ColorDePatinDeAterrizaje;
	}

	public void setColorDePatinDeAterrizaje(String colorDePatinDeAterrizaje) {
		ColorDePatinDeAterrizaje = colorDePatinDeAterrizaje;
	}

	@Override
	public String toString() {
		return "Helicoptero [ColorDePatinDeAterrizaje=" + ColorDePatinDeAterrizaje + "]";
	}
	
	public String getClase() {
		return "Helicoptero";
	}
	
	

	

	
	
	

}
