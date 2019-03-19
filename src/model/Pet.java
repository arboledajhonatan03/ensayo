package model;
public class Pet{
	private static final String DOG = "perro";
	private static final String CAT = "gato";
	private static final String BIRD = "ave";
	private static final String OTHER = "otro";
	private String namePet;
	private double weightPet;
	private String typeOfPet;
	private int ageOfPet;
	private HistorialRecord histo; 
	public Pet (String namePet, double weightPet, String typeOfPet, int ageOfPet, HistorialRecord histo){
		this.namePet = namePet;
		this.weightPet = weightPet;
		this.typeOfPet = typeOfPet;
		this.ageOfPet = ageOfPet;
		this.histo = histo;
	}
	public String getNamePet(){
		return namePet;
	}
	public void setNamePet (String namePet){
		this.namePet = namePet;
	}
	public double getWeightPet(){
		return weightPet;
	}
	public void setWeightPet (double weightPet){
		this.weightPet = weightPet;
	}
	public String getTypeOfPet(){
		return typeOfPet;
	}
	public void setTypeOfPet (String typeOfPet){
		this.typeOfPet = typeOfPet;
	}
	public int getAgeOfPet(){
		return ageOfPet;
	}
	public void setAgeOfPet (int ageOfPet){
		this.ageOfPet = ageOfPet;
	}
	public HistorialRecord getHisto(){
		return histo;
	}
	public void setHisto (HistorialRecord histo){
		this.histo = histo;
	}
	
}