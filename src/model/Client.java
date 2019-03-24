package model;
import java.util.ArrayList;
public class Client{
	private String name;
	private String identify;
	private String address;
	private String numTel;
	private ArrayList<Pet> pets;
	public Client(String name, String identify, String address, String numTel){
		this.name = name;
		this.identify = identify;
		this.address = address;
		this.numTel = numTel;
		pets = new ArrayList<Pet>();
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getIdentify(){
		return identify;
	}
	public void setIdentify(String identify){
		this.identify = identify;
	}
	public String getAddress(){
		return address;
	}
	public void setaddress(String address){
		this.address = address;
	}
	public String getNumTel(){
		return numTel;
	}
	public void setNumTel(String numTel){
		this.numTel = numTel;
	}
	public ArrayList<Pet> getPets(){
		return pets;
	}
	public void setPets(ArrayList<Pet> Pets){
		this.pets = pets;
	}
	public void addPet(Pet newPet){
		pets.add(newPet);
	}
	public String infoClient(){
		String msj = "";
		msj += "Name: " + name + "\n";
		msj += "ID: " + identify+ "\n";
		msj += "Address: " + address + "\n";
		msj += "Tel: " + numTel + "\n";
		msj += "\n";
		int j = 0;
		for(int i = 0; i<pets.size(); i++){
			++j;
			msj += "Pet"+ j + "";
			msj += "\n";
			msj += pets.get(i).showInfoPet();
			msj += "\n";
		}
		return msj;
	}
	public double incomesForPets(int actualDay, int actualMonth, int actualYear){
		double total = 0.0;
		for(int j=0;j<pets.size();j++){
			total+=pets.get(j).hospitalizateValor(actualDay, actualMonth, actualYear);
		}
		return total;
	}
	public Pet findPet(String petName1){
		Pet pety = null;
		boolean found = false;
		for(int j = 0; j<pets.size() && !found; j++){
			if(pets.get(j).getNamePet().equals(petName1)){
				pety = pets.get(j);
				found = true;
			}
		}
		return pety;
	}
}