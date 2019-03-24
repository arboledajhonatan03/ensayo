package model;
import java.util.ArrayList;
public class Pet{
	private static final String DOG = "dog";
	private static final String CAT = "cat";
	private static final String BIRD = "bird";
	private static final String OTHER = "other";
	private String namePet;
	private double weightPet;
	private String typeOfPet;
	private int ageOfPet;
	private String owner;
	private ClinicalHistory history;
	public Pet (String namePet, double weightPet, String typeOfPet, int ageOfPet, String owner, ClinicalHistory history){
		this.namePet = namePet;
		this.weightPet = weightPet;
		this.typeOfPet = typeOfPet;
		this.ageOfPet = ageOfPet;
		this.owner = owner;
		this.history = history;
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
	public String getOwner(){
		return owner;
	}
	public void setOwner(String owner){
		this.owner = owner;
	}
	public ClinicalHistory getHistory(){
		return history;
	}
	public void setHistory(ClinicalHistory history){
		this.history = history;
	}
	public double hospitalizateValor(int actualDay, int actualMonth, int actualYear){
		double total = 0.0;
		int exactedDays = history.frecuencyMedicament(actualDay, actualMonth, actualYear);
		double doseXcost = history.doseMedicamentCost();
		if(typeOfPet.equals(CAT)){
			if(weightPet >= 1.0 && 3.0 <= weightPet){
				total += (double) (exactedDays * 10000)+ doseXcost;
			}else if(weightPet >= 3.1 && 10.0 <= weightPet){
				total += (double) (exactedDays* 12000)+ doseXcost;
			}else if(weightPet >= 10.1 && 20.0 <= weightPet){
				total += (double) (exactedDays * 15000)+ doseXcost;
			}else if(weightPet > 20.0 ){
			 total +=(double) (exactedDays * 20000)+ doseXcost;
			}
		}
		else if(typeOfPet.equals(DOG)){
			if(weightPet >= 1.0 && 3.0 <= weightPet){
				total += (double) (exactedDays * 15000)+ doseXcost;
			}else if(weightPet >= 3.1 && 10.0 <= weightPet){
				total += (double) (exactedDays* 17000)+ doseXcost;
			}else if(weightPet >= 10.1 && 20.0 <= weightPet){
				total += (double) (exactedDays * 20000)+ doseXcost;
			}else if(weightPet > 20.0 ){
			 total +=(double) (exactedDays * 25000)+ doseXcost;
			}
		}
		else if(typeOfPet.equals(BIRD)){
			if(weightPet >= 1.0 && 3.0 <= weightPet){
				total += (double) (exactedDays * 10000)+ doseXcost;
			}else if(weightPet >= 3.1 && 10.0 <= weightPet){
				total += (double) (exactedDays* 12000)+ doseXcost;
			}else if(weightPet >= 10.1 && 20.0 <= weightPet){
				total += (double) (exactedDays * 20000)+ doseXcost;
			}else if(weightPet > 20.0 ){
			 total +=(double) (exactedDays * 25000)+ doseXcost;
			}
		}
		else if(typeOfPet.equals(OTHER)){
			if(weightPet >= 1.0 && 3.0 <= weightPet){
				total += (double) (exactedDays * 10000)+ doseXcost;
			}else if(weightPet >= 3.1 && 10.0 <= weightPet){
				total += (double) (exactedDays* 17000)+ doseXcost;
			}else if(weightPet >= 10.1 && 20.0 <= weightPet){
				total += (double) (exactedDays * 30000)+ doseXcost;
			}else if(weightPet > 20.0 ){
			 total +=(double) (exactedDays * 30000)+ doseXcost;
			}
		}
		return total;
	}
	public String showInfoPet(){
	String msj = "";
	msj += "Name: " + namePet + "\n";
	msj += "Age: " + ageOfPet + "\n";
	msj += "Weight: " + weightPet + "\n";
	msj += "Type of animal: " + typeOfPet + "\n";
	return msj;
	}
}