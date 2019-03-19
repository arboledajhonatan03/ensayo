package model;
public class Medicament {
	private String name;
	private double dose;
	private double doseCost;
	private char frecuency;
	public Medicament (String name, double dose, double doseCost, char frecuency){
		this.name = name;
		this.dose = dose;
		this.doseCost = doseCost;
		this.frecuency = frecuency;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public double getDose(){
		return dose;
	}
	public void setDose(double dose){
		this.dose = dose;
	}
	public double getDoseCost(){
		return doseCost;
	}
	public void setDoseCost(double doseCost){
		this.doseCost = doseCost;
	}
	public char getFrecuency(){
		return frecuency;
	}
	public void setFrecuency(char frecuency){
		this.frecuency = frecuency;
	}
}